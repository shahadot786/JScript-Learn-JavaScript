package com.javascript.jscript.Books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
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

import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityBooksListBinding;

import java.util.Objects;

public class BooksListActivity extends AppCompatActivity {

    ActivityBooksListBinding binding;
    private AdNetwork adNetwork;
    ListView books;
    String[] list = {};
    private boolean connected = false;
    Toast toast;
    TextView toastText;
    LayoutInflater inflater;
    View toastLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBooksListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adNetwork = new AdNetwork(BooksListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        BooksListActivity.this.setTitle("Books");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        books = findViewById(R.id.bookList);
        BooksListActivity.CustomAdapter adapter = new BooksListActivity.CustomAdapter();
        books.setAdapter(adapter);
        //load ad
        adNetwork.loadInterstitialAd();
        books.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //custom toast
                inflater = getLayoutInflater();
                toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
                toastText = (TextView) toastLayout.findViewById(R.id.toastText);
                toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.BOTTOM,0,100);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(toastLayout);
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ReadBooksActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                    Intent intent = new Intent(BooksListActivity.this, ReadBooksActivity.class);
                    intent.putExtra("booksUri",list[i]);
                    startActivity(intent);
                    adNetwork.showInterstitialAd();

                }else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                    connected = false;
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
        final String[] angular = {
                "angular",
                "Books1",
                "Books",
                "Books1",
                "Books",
                "Books1",
        };

        String programsItems = getIntent().getStringExtra("booksItems");
        switch (programsItems){
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


        }
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

            view = getLayoutInflater().inflate(R.layout.programs_list_items_layout,null);
            TextView textView = view.findViewById(R.id.itemsTitle);
            textView.setText(list[i]);

            return view;
        }
    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}