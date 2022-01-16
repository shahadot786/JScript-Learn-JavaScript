package com.javascript.jscript.Interview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityInterviewItemsListBinding;

import java.util.Objects;

public class InterviewItemsListActivity extends AppCompatActivity {

    ActivityInterviewItemsListBinding binding;
    ListView interviews;
    String[] list = {};
    private AdNetwork adNetwork;

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
            intent.putExtra("Interview Questions", list[i]);
            intent.putExtra("Interview Answers", list[i]);
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
                "How does QuickSort Work?",
                "Difference between Client side JavaScript and Server side JavaScript?",
                "In which location cookies are stored on the hard disk?",
                "What is the requirement of debugging in JavaScript?",
                "What is the use of debugger keyword in JavaScript?",
                "How do you define a class and its constructor?",
                "What is function overloading in JavaScript?",
                "What is  associative arrays in JavaScript?",
                "Why \"self\" is needed instead of \"this\" in JavaScript?",
                "Understanding JavaScript Inheritance with Example",
                "Why asynchronous code is important in JavaScript?",
                "How to empty an array in JavaScript?",
                "What is the difference between let, var, and const?",
                "Is it possible to use JavaScript to change the meta-tags of the page?",
                "How To modify the URL of page without reloading the page?",
                "Name two ways two change the context of a JavaScript method?"
        };
        final String[] DOM = {
                "How are DOM utilized in JavaScript?",
                "What is DOM in JavaScript?",
                "How to use DOM and Events?",
                "What is External JavaScript?",
                "When to Use Internal and External JavaScript Code?",
                "Is there any difference between window and document?",
                "Does document.onload and window.onload fire at the same time?",
                "Is attribute similar to property?",
                "What are the different ways to get an element from DOM?",
                "What is the fastest way to select elements by using css selectors?",
                "How come, I can't use forEach or similar array methods on a NodeList?",
                "If you need to implement getElementByAttribute, how would you implement it?",
                "How would you add a class to an element by query selector?",
                "How could I verify whether one element is child of another?",
                "What is the best way to create a DOM element? Set innherHTML or use createElement?",
                "What is createDocumentFragment and why you might use it?",
                "What is reflow? What causes reflow? How could you reduce reflow?",
                "What is repaint and when does this happen?",
                "How could you make sure to run some javaScript when DOM is ready like $(document).ready?",
                "How would you destroy multiple list items with one click handler?",
                "Create a button that is destroyed by clicking on it but two new buttons are created in it's place.",
                "How could you capture all clicks in a page?",
                "How can you get all the texts in a web page?"

        };
        final String[] BOM = {
                "What is BOM?",
                "What is the window object?",
                "Which is the root element of Bom?",
                "Which object is the top object in BOM?",
                "Why window object is used on BOM?",
                "What is full form of Bom?",
                "Which object is the most important object in the BOM model?",
                "Which object is at the top of the hierarchy in document object model?\n",
                "How to get web browser window size?",
                "How to detect web browser information?",
                "What is IIFEs (Immediately Invoked Function Expressions)?",
                "Explain the difference between Object.freeze() vs const",
                "What is generator in JS?",
                "When should we use generators in ES6?",
                "What will be the output of the following code?",
                "Explain the Prototype Design Pattern",
                "What is the Temporal Dead Zone in ES6?",
                "Can you describe the main difference between a .forEach loop and a .map() loop and why you would pick one versus the other?",
                "Describe the Revealing Module Pattern design pattern"

        };
        final String[] AJAX = {
                "What is Ajax?",
                "What are Ajax applications?",
                "How many types of triggers are present in update panel?",
                "What are all the controls of Ajax?",
                "What is the name of the DLL that contains Ajax control tool kit?",
                "What role of #&& in querystring?",
                "How to control the duration of an Ajax request?",
                "What are the advantages of Ajax?",
                "What are the disadvantages of Ajax?",
                "What is update panel?",
                "Which are the two methods used for cross domain Ajax calls?",
                "What are all the technologies used by Ajax?",
                "What are all the features of Ajax?",
                "What is JSON in Ajax?",
                "What are the components of the ASP.NET AJAX architecture?",
                "What is AJAX Control Extender Toolkit?",
                "Where AJAX cannot be used?",
                "What are the pre-requisites to execute AJAX applications on a server?",
                "What is AJAX Framework?",
                "Does Ajax work with another language?",
                "What is an asynchronous request in AJAX?",
                "What is a synchronous request in AJAX?",
                "Did adaptive path invent Ajax? Did Google? Did adaptive path help build Google’s Ajax Applications?",
                "What do you need to know to create my own Ajax Functionality?",
                "Should I use Xml or Text, Javascript, or Html as a Return Type?",
                "Are there usability issues with Ajax?",
                "Should I use an Http get or Post for my Ajax Calls?",
                "How do we Debug Javascript?",
                "How do I provide Internationalized Ajax Interactions?"

        };
        final String[] Typescript = {
                "What is TypeScript?",
                "What are the Differences between TypeScript and JavaScript?",
                "Why do we need TypeScript?",
                "Mention some of the features of TypeScript",
                "What are the Benefits of using TypeScript?",
                "What are the Disadvantages of TypeScript?",
                "What are the Components of TypeScript?",
                "Who developed Typescript and what is the current stable version available?",
                "How to install TypeScript?",
                "How do you compile TypeScript files?",
                "Can we combine multiple .ts files into a single .js file?",
                "What are the different types of TypeScript?",
                "List out the built-in data types in TypeScript.",
                "What are Variables in TypeScript and how to create them?",
                "What are the object-oriented terms supported by TypeScript?",
                "What are Interfaces in TypeScript?",
                "What are Classes in TypeScript? List out some of the features.",
                "What are the access modifiers supported by TypeScript?",
                "How is TypeScript an optionally statically typed language?",
                "What are modules in TypeScript?",
                "What is namespace in Typescript and how to declare it?",
                "Does TypeScript support function overloading?",
                "Explain Decorators in TypeScript.",
                "What are Mixins?",
                "How does TypeScript support optional parameters in function?",
                "What is Scope variable?",
                "What is TypeScript Definition Manager and why do we need it?",
                "What is TypeScript Declare Keyword?",
                "What is the Default Parameters Function in TypeScript?",
                "What is tsconfig.json file?",
                "What are Generics in TypeScript?",
                "What is JSX in TypeScript?",
                "What are all the JSX modes TypeScript supports?",
                "What are Ambient in TypeScripts and when to use them?",
                "What is a TypeScript Map file?",
                "What is Type assertions in TypeScript?",
                "Explain Enum in TypeScript.",
                "What is method overriding in TypeScript?",
                "What is Lambda/Arrow function?"

        };
        //pro
        final String[] Angular = {
                "What is Angular? Why was it introduced?",
                "What is data binding? Which type of data binding does Angular deploy?",
                "What are Single Page Applications (SPA)?",
                "What are decorators in Angular?",
                "Mention some advantages of Angular.",
                "What are the new updates with Angular10?",
                "What are Templates in Angular?",
                "What are Annotations in Angular?",
                "What are Directives in Angular?",
                "What is an AOT compilation? What are its advantages?",
                "What are Components in Angular?",
                "What are Pipes in Angular?",
                "What is an ngModule?",
                "What are filters in Angular? Name a few of them.",
                "What is view encapsulation in Angular?",
                "What are controllers?",
                "Explain the lifecycle hooks in Angular",
                "What is String Interpolation in Angular?",
                "What is the difference between AOT and JIT?",
                "Explain the @Component Decorator.",
                "What are Services in Angular?",
                "What are Promises and Observables in Angular?",
                "What are Template and Reactive forms?",
                "What is Bootstrap? How is it embedded into Angular?",
                "What type of DOM does Angular implement?"

        };
        final String[] VueJs = {
                "What is Vue.js?",
                "List some features of Vue.js?",
                "Explain Life cycle of Vue Instance?",
                "How to create an instance of Vue js?",
                "Explain the differences between one-way data flow and two-way data binding?",
                "How to create Two-Way Bindings in Vue.js?",
                "What are filters in VUE.js?",
                "How to create a custom filter in Vue.js?",
                "What are Components in Vue.js? How to register a component inside other component?",
                "What are Directives in VUE.js, List some of them you used?",
                "List type of Directive are available in Vue.js?",
                "What is VUE-resource, how can you install Vue Resource?",
                "How to create Constants in Vue.js?",
                "What is virtual dom in Vue.js?",
                "Why we need Vue.js mixins?",
                "What is Vuex?",
                "What are filters in Vue.js?",
                "How to create a component in Vue.js?",
                "How to import js file in the Vue component?",
                "How to call rest API from Vue js?"

        };
        final String[] NextJs = {
                "What is Next.js?",
                "Why is Next.js used for? / Why do world's leading companies prefer Next.js?",
                "What is the process to install Next.js? / How to install Next.js?",
                "What are the most prominent features of Next.js?",
                "Which types of websites most popularly use Next.js?",
                "Is it possible to use Next.js with Redux?",
                "What is the recommended method to fetch data in Next.js?",
                "Give an example to demonstrate how do you set up CDN in Next.js?",
                "Are Create-React-App and Next.js used for the same thing?",
                "How can you disable the etag generation in Next.js?",
                "How can you configure the build-id in Next.js?",
                "How can you create a page directory inside your project?",
                "Give an example to demonstrate how to create a custom error page in Next.js?",
                "What do you understand by code splitting in Next.js?",
                "How can you enable AMP in Next.js?",
                "Is it possible to host Next.js in a web server like Nginx?",
                "Next.js vs gatsby?"

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
        switch (programsItems) {
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

        @SuppressLint({"ViewHolder", "InflateParams"})
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.programs_list_items_layout, null);
            TextView textView = view.findViewById(R.id.itemsTitle);
            textView.setText(list[i]);

            return view;
        }
    }
}