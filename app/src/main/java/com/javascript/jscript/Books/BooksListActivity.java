package com.javascript.jscript.Books;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityBooksListBinding;

import java.util.Map;
import java.util.Objects;

public class BooksListActivity extends AppCompatActivity {

    ActivityBooksListBinding binding;
    ListView books;
    String[] list = {};
    Toast toast;
    TextView toastText;
    LayoutInflater inflater;
    View toastLayout;
    private AdNetwork adNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBooksListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adNetwork = new AdNetwork(BooksListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        BooksListActivity.this.setTitle("JScript: Books");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        books = findViewById(R.id.bookList);
        BooksListActivity.CustomAdapter adapter = new BooksListActivity.CustomAdapter();
        books.setAdapter(adapter);
        //load ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                Map<String, AdapterStatus> statusMap = initializationStatus.getAdapterStatusMap();
                for (String adapterClass : statusMap.keySet()) {
                    AdapterStatus status = statusMap.get(adapterClass);
                    Log.d("MyApp", String.format(
                            "Adapter name: %s, Description: %s, Latency: %d",
                            adapterClass, status.getDescription(), status.getLatency()));
                }

                // Start loading ads here...
                //ad initialization
                adNetwork.loadInterstitialAd();
                //ad request
                AdView bannerAd = findViewById(R.id.adView);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAd.loadAd(adRequest);
                if (UiConfig.BANNER_AD_VISIBILITY) {
                    bannerAd.setVisibility(View.VISIBLE);
                } else {
                    bannerAd.setVisibility(View.GONE);
                }

            }
        });

        books.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //custom toast
                inflater = getLayoutInflater();
                toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
                toastText = toastLayout.findViewById(R.id.toastText);
                toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.BOTTOM, 0, 100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(toastLayout);
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ReadBooksActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Intent intent = new Intent(BooksListActivity.this, ReadBooksActivity.class);
                    intent.putExtra("booksUri", list[i]);
                    startActivity(intent);
                    adNetwork.showInterstitialAd();

                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
            }
        });


    }

    private void loadItems() {
        final String[] Fundamental = {
                "A Smarter Way to Learn JavaScript",
                "Eloquent Javascript",
                "JavaScript The Good Parts",
                "JavaScript and JQuery Interactive",
                "JavaScript The Definitive Guide",
                "JavaScript For Beginners",
                "Beginning HTML, XHTML, CSS and JavaScript"
        };

        final String[] Basic = {
                "Head First JavaScript Programming",
                "O'Reilly Head First JavaScript",
                "Learn Javascript Visually",
                "You Don’t Know JS",
                "Understanding ECMAScript 6",
                "Effective JavaScript"
        };

        final String[] Objects = {
                "Core JavaScript Objects, and Functions",
                "JavaScript Objects",
                "JavaScript Object Programming",
                "JavaScript Functions objects and Arrays",
        };

        final String[] OOPs = {
                "The Principles of Object Oriented JavaScript",
                "Object Oriented JavaScript 2nd Edition",
                "Object Oriented JavaScript 3rd Edition",
                "Mastering JavaScript Object-Oriented Programming",
                "Object-Oriented JavaScript-Stefanov",
                "The Object-Oriented Thought Process",
                "Functional Programming in JavaScript"
        };

        final String[] DOM = {
                "DOM Enlightenment",
                "DOM Scripting Web Design with JavaScript",
                "Beginning JavaScript with DOM Scripting and Ajax",
                "JavaScript, DOM Scripting and Ajax Projects",
                "DOM Scripting: Web Design with JavaScript and Model"
        };
        final String[] Advanced = {
                "JavaScript The Complete Reference",
                "Professional JavaScript for Web Developers",
                "JavaScript Creativity: Exploring the Modern Capabilities of JavaScript and HTML5",
                "HTML, CSS & JavaScript Web Publishing in One Hour a Day",
                "The Advanced Game Developer's Toolkit: Create Amazing Web-based Games with JavaScript",
                "Introduction to JavaScript Object Notation",
                "JavaScript Bible",
                "JavaScript Patterns",
                "Advanced JavaScript Essentials",
                "Sam's Teach Yourself HTML, CSS, and JavaScript All in One",
                "Learn Javascript by Chuck Easttom"
        };
        final String[] AJAX = {
                "Ajax: The Complete Reference",
                "Head First Ajax",
                "Ajax The Definitive Guide Anthony T. Holdener III",
                "Professional Ajax",
                "Foundations of Ajax",
                "AJAX and PHP",
                "AJAX: A Beginner’s Guide",
                "JavaScript & AJAX for Dummies",
                "Programming ASP.NET AJAX: Build rich, Web 2.0-style UI with ASP.NET AJAX",
                "Wordpress and Ajax: An In-Depth Guide on Using Ajax With WordPress"
        };
        final String[] Typescript = {
                "What is TypeScript?",
                "TypeScript Essentials",
                "Programming TypeScript: Making Your JavaScript Applications Scale",
                "Effective TypeScript: 62 Specific Ways to Improve Your TypeScript",
                "Mastering TypeScript: Build Enterprise-ready, Modular Web Applications Using TypeScript 4",
                "Essential Typescript: From Beginner To Pro",
                "TypeScript Microservices: Build, deploy, and secure Microservices using TypeScript",
                "TypeScript Quickly",
                "Angular 2 Development with TypeScript",
                "Pro TypeScript: Application-Scale JavaScript Development",
                "Mastering TypeScript 2nd Edition",
                "TypeScript Modern JavaScript Development",
                "Decorators in TypeScript"
        };
        final String[] Angular = {
                "Angular in Action",
                "Pro Angular",
                "Pro Angular 9 Build Powerful and Dynamic Web Apps",
                "Angular for Enterprise Ready Web Applications",
                "Angular 2 Development with TypeScript",
                "Angular: Up and Running: Learning Angular",
                "Learn With: Angular 4: Collected Essays: Angular CLI, Unit Testing, Debugging TypeScript, and Angular",
                "Angular 5 Projects: Learn to Build Single Page Web Applications Using 70+ Projects",
                "Essential Angular for ASP.NET Core MVC",
                "Getting MEAN with Mongo, Express, Angular, and Node"
        };
        final String[] VueJs = {
                "Vue.js in Action",
                "Fullstack VueJS",
                "Vue.js Up and Running: Building Accessible and Performant Web Apps",
                "Pro Vue.js 2",
                "Learning Vue.js 2"
        };
        final String[] NextJs = {
                "The Next.js Handbook",
                "Learning React: Modern Patterns for Developing React Apps",
                "Fullstack React:The Complete Guide to ReactJS and Friends"
        };
        final String[] ReactJs = {
                "Learning React: Modern Patterns for Developing React Apps",
                "Fullstack React:The Complete Guide to ReactJS and Friends",
                "React in Action",
                "Learning React: Functional Web Development with React and Redux",
                "The Road to React",
                "React Quickly: Painless Web Apps with React, JSX, Redux and GraphQL",
                "React Cookbook: Recipes for Mastering the React Framework",
                "Mastering Full-Stack React Web Development",
                "React.js Essentials"
        };
        final String[] EmberJs = {
                "Ember.js in Action",
                "Ember.js Guides",
                "Web App Development Book Guide to Ember.js",
                "Building Web Apps with Ember.js",
                "Mastering Ember.js"
        };
        final String[] Bootstrap = {
                "An introduction to the bootstrap",
                "Bootstrap: Responsive Web Development",
                "Mastering Bootstrap 4",
                "Introducing Bootstrap 4",
                "Learning Bootstrap 4",
                "Practical Bootstrap: Learn to Develop Responsively with One of the Most Popular CSS Frameworks",
                "Pro MERN Stack Full Stack Web App Development with Mongo, Express, React, and Node",
                "Front-end Development with ASP.NET Core, Angular, and Bootstrap"
        };
        final String[] NodeJs = {
                "Beginning Node.js",
                "Web Development with Node and Express Leveraging the javascript Stack",
                "Node.js 8 the Right Way: Practical, Server-Side JavaScript That Scales",
                "Node.js in Action",
                "Practical Node.Js: Building Real-World Scalable Web Apps",
                "Manning Node.js in Practice",
                "Node.js Design Patterns",
                "SitePoint Full Stack JavaScript Development with MEAN, MongoDB Express AngularJS and Node.js",
                "Pro REST API Development with Node.js",
                "Node.js for PHP Developers: Porting PHP to Node.js",
                "Node.js, MongoDB and Angular Web Development"
        };
        final String[] ExpressJs = {
                "Getting MEAN with Mongo, Express, Angular, and Node",
                "Web Development with Node and Express Leveraging the javascript Stack",
                "Express in Action",
                "Express.js Guide",
                "Pro Express.js",
                "Express.js: Guide Book on Web framework for Node.js"
        };
        final String[] Laravel = {
                "Laravel 5 Essentials",
                "Laravel: Up & Running: A Framework for Building Modern PHP Apps",
                "Mastering Laravel",
                "Laravel for Beginners",
                "Beginning Laravel",
                "Laravel 5.1 Beauty: Creating Beautiful Web Apps with Laravel 5.1",
                "Learning Laravel Eloquent",
                "Design Patterns in PHP and Laravel",
                "Easy Laravel 5",
                "Laravel 5 Cookbook",
                "Laravel: Code Bright",
        };
        final String[] jQuery = {
                "JavaScript and JQuery: Interactive Front-End Web Development",
                "Learning jQuery",
                "jQuery in Action",
                "JQuery Cookbook",
                "JQuery Pocket Reference",
                "jQuery UI in Action",
                "Head First jQuery",
                "Pro PHP and jQuery, 2nd Edition",
                "JQuery 1.4 animation techniques beginner's guide",
                "Beginning jQuery",
                "jQuery UI 1.6 - The User Interface Library for jQuery",
                "Web Development with jQuery",
                "Beginning jQuery 2 for ASP.NET Developers",
                "jQuery For Dummies",
                "Learning PHP, MySQL & JavaScript: With jQuery, CSS & HTML5",
        };

        String programsItems = getIntent().getStringExtra("booksItems");
        switch (programsItems) {
            case "Fundamental":
                list = Fundamental;
                break;
            case "Basic":
                list = Basic;
                break;
            case "Objects":
                list = Objects;
                break;
            case "OOPs":
                list = OOPs;
                break;
            case "DOM":
                list = DOM;
                break;
            case "Advanced":
                list = Advanced;
                break;
            case "AJAX":
                list = AJAX;
                break;
            case "Typescript":
                list = Typescript;
                break;
            case "Angular":
                list = Angular;
                break;
            case "Vue Js":
                list = VueJs;
                break;
            case "Next Js":
                list = NextJs;
                break;
            case "React Js":
                list = ReactJs;
                break;
            case "Ember Js":
                list = EmberJs;
                break;
            case "Bootstrap":
                list = Bootstrap;
                break;
            case "Node Js":
                list = NodeJs;
                break;
            case "Express Js":
                list = ExpressJs;
                break;
            case "Laravel":
                list = Laravel;
                break;
            case "jQuery":
                list = jQuery;
                break;
        }
    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.programs_list_items_layout, null);
            TextView textView = view.findViewById(R.id.itemsTitle);
            textView.setText(list[i]);

            return view;
        }
    }
}