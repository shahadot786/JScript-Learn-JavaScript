package com.javascript.jscript.Interview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityInterviewItemsListBinding;

import java.util.Objects;

public class InterviewItemsListActivity extends AppCompatActivity {

    private AdNetwork adNetwork;
    ActivityInterviewItemsListBinding binding;
    ListView interviews;
    String[] list = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInterviewItemsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adNetwork = new AdNetwork(InterviewItemsListActivity.this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        InterviewItemsListActivity.this.setTitle("JScript: Interview Questions");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        interviews = findViewById(R.id.interviewList);
        InterviewItemsListActivity.CustomAdapter adapter = new InterviewItemsListActivity.CustomAdapter();
        interviews.setAdapter(adapter);
        //load ad
        adNetwork.loadInterstitialAd();
        interviews.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(InterviewItemsListActivity.this, InterviewAnswerActivity.class);
            intent.putExtra("Interview Questions",list[i]);
            intent.putExtra("Interview Answers",list[i]);
            startActivity(intent);
            adNetwork.showInterstitialAd();
        });


    }
    private void loadItems() {
        final String[] basic = {
                "What is JavaScript?",
                "What is the real name of JavaScript?",
                "Enumerate the differences between Java and JavaScript?",
                "What are JavaScript Data Types?",
                "What is the use of isNaN function?",
                "Which is faster between JavaScript and an ASP script?",
                "What is negative Infinity?",
                "Is it possible to break JavaScript Code into several lines?",
                "Which company developed JavaScript?",
                "What are undeclared and undefined variables?",
                "Write the code for adding new elements dynamically?",
                "What are global variables? How are these variable declared?",
                "What is a prompt box?",
                "What is ‘this’ keyword in JavaScript?",
                "What is the working of timers in JavaScript?",
                "Which symbol is used for comments in Javascript?",
                "What is the difference between ViewState and SessionState?",
                "What is === operator?",
                "How can the style/class of an element be changed?",
                "What are all the looping structures in JavaScript?",
                "What is called Variable typing in Javascript?",
                "What would be the result of 3+2+”7″?",
                "What is the function of the delete operator?",
                "What is an undefined value in JavaScript?",
                "What are all the types of Pop up boxes available in JavaScript?",
                "What is the data type of variables in JavaScript?",
                "What is break and continue statements?",
                "What are the two basic groups of data types in JavaScript?",
                "What is the use of a type of operator?",
                "Which keyword is used to print the text on the screen?",
                "What is variable typing?",
                "What is the difference between JavaScript and Jscript?",
                "What is the way to get the status of a CheckBox?",
                "What is for-in loop in Javascript?",
                "Explain Popup Message using event with example",
                "Define anonymous function",

        };
        final String[] Advanced = {
                "How you can submit a form using JavaScript?",
                "Does JavaScript support automatic type conversion?",
                "How to read and write a file using JavaScript?",
                "How can you convert the string of any base to an integer in JavaScript?",
                "Difference between “==” and “===”?",
                "How to detect the operating system on the client machine?",
                "What do you mean by NULL in Javascript?",
                "What is the use of Void (0)?",
                "How can a page be forced to load another page in JavaScript?",
                "What is the difference between an alert box and a confirmation box?",
                "What are escape characters?",
                "What are JavaScript Cookies?",
                "What a pop()method in JavaScript is?",
                "Does JavaScript has concept level scope?",
                "What are the disadvantages of using innerHTML in JavaScript?",
                "How can generic objects be created?",
                "Which keywords are used to handle exceptions?",
                "What is the use of the blur function?",
                "How to find an operating system in the client machine using JavaScript?",
                "What are the different types of errors in JavaScript?",
                "What is the use of the Push method in JavaScript?",
                "What is the unshift method in JavaScript?",
                "What is the ‘Strict Mode in JavaScript, and how can it be enabled?",
                "How closures work in JavaScript?",
                "How can a value be appended to an array?",
                "What are the important properties of an anonymous function in JavaScript?",
                "What is the difference between .call() and .apply()?",
                "What is event bubbling?",
                "How can a particular frame be targeted, from a hyperlink, in JavaScript?",
                "Why you should not use innerHTML in JavaScript?",
                "What is namespacing in JavaScript, and how is it used?",
                "How can JavaScript codes be hidden from old browsers that do not support JavaScript?",
                "Give an example of JavaScript Multiplication Table",
        };
        final String[] Objects = {
                "How are object properties assigned?",
                "How to create objects in JavaScript?",
                "How can a value be appended to an array?",
                "How are object properties assigned?",
                "What is the method for reading and writing a file in JavaScript?",
                "What are Screen objects?",
                "What is the unshift() method?",
                "What are the important JavaScript Array Method explain with example?",
                "What is Loop Though the Properties of an Object?",
                "In JavaScript what is an argument object?",
                "If we want to return the character from a specific index which method is used?",
                "What is the use of window object?",
                "What is the use of history object?",
                "How to set the cursor to wait in JavaScript?",
                "What is this [[[]]]?",
                "What is the use of Math object in JavaScript?",
                "What is the use of a Date object in JavaScript?",
                "What is the use of a Number object in JavaScript?",
                "What is the use of a Boolean object in JavaScript?",
                "What is the use of a TypedArray object in JavaScript?",
                "What is the use of a Set object in JavaScript?",
                "What is the use of a WeakSet object in JavaScript?",
                "What is the use of a Map object in JavaScript?",
                "What is the use of a WeakMap object in JavaScript?",
        };
        final String[] OOPs = {
                "What is OOPS Concept in JavaScript?",
                "How are event handlers utilized in JavaScript?",
                "What is the role of deferred scripts in JavaScript?",
                "What are the various functional components in JavaScript?",
                "Write about the errors shown in JavaScript?",
                "What is unescape() and escape() functions?",
                "What are the decodeURI() and encodeURI()?",
                "What is JavaScript Unit Testing, and what are the challenges in JavaScript Unit Testing?",
                "What are some important JavaScript Unit Testing Frameworks?",
                "What is QuickSort Algorithm in JavaScript?",
                "How does QuickSort Work",
                "Difference between Client side JavaScript and Server side JavaScript?",
                "In which location cookies are stored on the hard disk?",
                "What is the requirement of debugging in JavaScript?",
                "What is the use of debugger keyword in JavaScript?",

        };
        final String[] DOM = {
                "How are DOM utilized in JavaScript?",
                "What is DOM in JavaScript?",
                "How to use DOM and Events?",
                "What is External JavaScript?",
                "When to Use Internal and External JavaScript Code?",
                "",
                "",
                "",

        };
        final String[] BOM = {
                "What is BOM?",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",

        };
        final String[] AJAX = {

        };
        final String[] Typescript = {

        };
        //pro
        final String[] Angular = {

        };
        final String[] VueJs = {

        };
        final String[] NextJs = {

        };
        final String[] ReactJs = {

        };
        final String[] EmberJs = {

        };
        final String[] Bootstrap = {

        };
        final String[] NodeJs = {

        };
        final String[] ExpressJs = {

        };
        final String[] Laravel = {

        };
        final String[] jQuery = {

        };
        String programsItems = getIntent().getStringExtra("interviewItems");
        switch (programsItems){
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

        @SuppressLint({"ViewHolder", "InflateParams"})
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