package com.javascript.jscript.Learn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityLearnItemsListBinding;
import java.util.Objects;

public class LearnItemsListActivity extends AppCompatActivity {

    ActivityLearnItemsListBinding binding;
    private AdNetwork adNetwork;
    ListView learnList;
    String[] list = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLearnItemsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        LearnItemsListActivity.this.setTitle("Learn");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        learnList = findViewById(R.id.learnList);
        LearnItemsListActivity.CustomAdapter adapter = new LearnItemsListActivity.CustomAdapter();
        learnList.setAdapter(adapter);
        //load ad
        adNetwork = new AdNetwork(LearnItemsListActivity.this);
        adNetwork.loadInterstitialAd();

        learnList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //intent
                Intent intent = new Intent(LearnItemsListActivity.this, LearnDetailsActivity.class);
                intent.putExtra("learnTopics",list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });

    }//ends of onCreate
    private void loadItems() {
        //free content list
        final String[] Fundamental = {
                "Fundamental Introduction",
                "Code structure",
                "The modern mode",
                "Variables",
                "Data types",
                "Interaction: alert, prompt, confirm",
                "Type conversion",
                "Operators",
                "Comparisons",
                "Conditionals",
                "Loops",
                "Functions",
                "Arrow functions"};
        final String[] basic = {
                "Basic Introduction",
                "Syntax",
                "Enabling",
                "Placement",
                "Basic Variables",
                "Basic Data Types",
                "Basic Operators",
                "Basic Conditions",
                "Switch",
                "Basic Loops",
                "Basic Functions",
                "Events"
        };
        final String[] Objects = {
                "Learn Objects",
                "Number Objects",
                "Boolean Objects",
                "Strings Objects",
                "Arrays Objects",
                "Date Objects",
                "Math Objects",
                "RegExp Objects"
        };
        final String[] OOPs = {
                "JS Class",
                "JS Object",
                "JS Prototype",
                "JS Constructor Method",
                "JS Static Method",
                "JS Encapsulation",
                "JS Inheritance",
                "JS Polymorphism",
                "JS Abstraction"
        };
        final String[] DOM = {
                "HTML DOM",
                "DOM Methods",
                "DOM Documents",
                "DOM Elements",
                "DOM HTML",
                "DOM Forms",
                "DOM CSS",
                "DOM Animations"
        };
        final String[] BOM = {
                "JS Window",
                "JS Screen",
                "JS Location",
                "JS History",
                "JS Navigator",
                "JS Timing",
                "JS Cookies"

        };
        final String[] advanced = {
                "JS Error Handling",
                "JS Validations",
                "JS Multimedia",
                "JS Debugging",
                "JS Web APIs",
                "Web Storage API",
                "Web Workers API",
                "JS Graphics"
        };
        final String[] AJAX = {
                "AJAX Introduction",
                "AJAX XMLHttp",
                "AJAX Response",
                "AJAX PHP",
                "AJAX ASP",
                "AJAX Database",
                "AJAX Applications"
        };
        //final String[] JSON = {};
        //pro content list
        final String[] Typescript = {
                "Typescript Introduction",
                "TypeScript Basic Syntax",
                "TypeScript Types",
                "TypeScript Variables",
                "TypeScript Operators",
                "TypeScript Decision Making",
                "TypeScript Loops",
                "TypeScript Functions",
                "TypeScript Numbers",
                "TypeScript Strings",
                "TypeScript Arrays",
                "TypeScript Tuples",
                "TypeScript Union",
                "TypeScript Interfaces",
                "TypeScript Classes",
                "TypeScript Objects",
                "TypeScript Namespaces",
                "TypeScript Modules"

        };

        final String[] angular = {
                "Learn angular"
        };
        final String[] VueJs = {
                "Vue Js"
        };
        final String[] NextJs = {
                "Next Js"
        };
        final String[] ReactJs = {
                "React Js"
        };
        final String[] EmberJs = {
                "Ember Js"
        };
        final String[] SvelteJs = {
                "Svelte Js"
        };
        final String[] Gatsby = {
                "Gatsby Js"
        };
        final String[] NuxtJs = {
                "Nuxt Js"
        };
        final String[] Bootstrap = {
                "Bootstrap Js"
        };
        final String[] NodeJs = {
                "Node Js"
        };
        final String[] SpringBoot = {
                "Spring Boot Js"
        };
        final String[] ExpressJs = {
                "Express Js"
        };
        final String[] Laravel = {
                "Laravel Js"
        };
        final String[] Micronaut = {
                "Micronaut Js"
        };
        final String[] MochaJs = {
                "Mocha Js"
        };


        String programsItems = getIntent().getStringExtra("learnItems");
        switch (programsItems){
            //free content
            case "Fundamental":
                list = Fundamental;
                break;
            case "Basic":
                list = basic;
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
            case "BOM":
                list = BOM;
                break;
            case "Advanced":
                list = advanced;
                break;
            case "AJAX":
                list = AJAX;
                break;
            /*case "JSON":
                list = JSON;
                break;*/
            //pro content
            case "Typescript":
                list = Typescript;
                break;
            case "Angular":
                list = angular;
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
            case "Svelte Js":
                list = SvelteJs;
                break;
            case "Gatsby Js":
                list = Gatsby;
                break;
            case "Nuxt Js":
                list = NuxtJs;
                break;
            case "Bootstrap":
                list = Bootstrap;
                break;
            case "Node Js":
                list = NodeJs;
                break;
            case "Spring Boot":
                list = SpringBoot;
                break;
            case "Express Js":
                list = ExpressJs;
                break;
            case "Laravel":
                list = Laravel;
                break;
            case "Micronaut":
                list = Micronaut;
                break;
            case "Mocha Js":
                list = MochaJs;
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