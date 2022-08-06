package com.javascript.jscript.Interview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxAdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityInterviewItemsListBinding;

import java.util.Map;
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

        adNetwork = new AdNetwork(this);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        InterviewItemsListActivity.this.setTitle("JScript: Interview Questions");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        interviews = findViewById(R.id.interviewList);
        InterviewItemsListActivity.CustomAdapter adapter = new InterviewItemsListActivity.CustomAdapter();
        interviews.setAdapter(adapter);
        //load ad
        //ad initialization
        adNetwork.loadInterstitialAd();
        //ad request
        adNetwork.loadBannerAd();
        //banner
        MaxAdView bannerAd = findViewById(R.id.adView);
        //check premium
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
            bannerAd.startAutoRefresh();
        } else {
            bannerAd.setVisibility(View.GONE);
            bannerAd.stopAutoRefresh();
        }


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
                "What is React?",
                "What are the features of React?",
                "List some of the major advantages of React?",
                "What are the limitations of React?",
                "What is JSX?",
                "What do you understand by Virtual DOM? Explain its works.",
                "Why can’t browsers read JSX?",
                "How different is React’s ES6 syntax when compared to ES5?",
                "“In React, everything is a component.” Explain",
                "What is the purpose of render() in React?",
                "How can you embed two or more components into one?",
                "What is Props?",
                "What is a state in React and how is it used?",
                "How can you update the state of a component?",
                "What is arrow function in React? How is it used?",
                "Explain the lifecycle methods of React components in detail.",
                "What is an event in React?",
                "What do you understand by refs in React?",
                "How do you modularize code in React?",
                "What are Higher Order Components(HOC)?",
                "What is the significance of keys in React?",
                "What were the major problems with MVC framework?",
                "What is Redux?",
                "What are the three principles that Redux follows?",
                "What do you understand by “Single source of truth”?",
                "How are Actions defined in Redux?",
                "What is the significance of Store in Redux?",
                "What is React Router?",
                "Why is switch keyword used in React Router v4?",
                "Why do we need a Router in React?"

        };
        final String[] EmberJs = {
                "Explain what Ember.js is and how it works?",
                "List out main components of Ember.js?",
                "Explain what is model in Ember.js?",
                "Explain how ember applications are structured?",
                "What controller does in Ember.js?",
                "Explain how is ember.js is different than traditional web application?",
                "Explain how Router and {{outlet}} tag can be useful in ember.js?",
                "Explain what is the difference between Router and Route in ember.js ?",
                "Explain what is Ember-data ?",
                "Explain the role of adapter and types of adapters ?",
                "Explain what are the two ways of defining and inserting a view?",
                "Explain what is controller in ember.js ?",
                "Mention the template components used in ember.js ?",
                "Explain what is serializer?",
                "How you can define a new ember class?",
                "Explain how you can create an Ember. handlebars  template ?",
                "Explain how you can add data using fixture into an application?",
                "What do you understand by ember route? How can you generate a route in Ember.js?",
                "What is an adapter in Ember.js, and why is it used?",
                "Mention some of the functions used in ember packages/ember run-time/lib and packages/ember metal/lib/utils.js ?",
                "Explain what is Enumerables in ember.js ?",
                "Explain what is Ember.ArrayController and what is the advantage of it ?",
                "Explain what is the use Ember.SortableMixin ?",
                "What do you know by observers in Ember.js?",
                "How to define a view in Ember.js?"

        };
        final String[] Bootstrap = {
                "What is Bootstrap?",
                "Explain why Bootstrap is preferred for website development.",
                "What are the key components of Bootstrap?",
                "List some features of Bootstrap.",
                "What are Class loaders in Bootstrap?",
                "How many types of layout are available in Bootstrap?",
                "What is Bootstrap Grid System?",
                "Give an example of a basic grid structure in Bootstrap?",
                "Why do we use Jumbotron in Bootstrap?",
                "What are the two codes used for code display in Bootstrap?",
                "Explain the typography and links in Bootstrap.",
                "Explain types of lists supported by Bootstrap.",
                "Explain the uses of carousel plugin in Bootstrap.",
                "What are glyphicons? How to use them?",
                "What are the input groups in Bootstrap?",
                "What is Bootstrap breadcrumb?",
                "What is pagination in bootstrap and how are they classified?",
                "How will you create a Bootstrap Dismissal Alert?",
                "What are the steps to create a progress bar using bootstrap?",
                "What do you mean by column ordering in Bootstrap?",
                "What is Normalize in Bootstrap?",
                "What are Bootstrap panels? Explain how to create a Bootstrap panel with a heading.",
                "What is the purpose of using the Scrollspy plugin?",
                "Why do we use the affix plugin in Bootstrap?",
                "What is Button group and which class is used for basic button group?",
                "What will be the default Bootstrap look of the alert created with this following code:",
                "What are badges? Which class will you use to make your badge look more rounded?",
                "What are the important rules that you should follow while using Grids in Bootstrap?"

        };
        final String[] NodeJs = {
                "What is Node.js? Where can you use it?",
                "Why use Node.js?",
                "How does Node.js work?",
                "Why is Node.js Single-threaded?",
                "If Node.js is single-threaded, then how does it handle concurrency?",
                "Explain callback in Node.js.",
                "How is Node.js most frequently used?",
                "What is NPM?",
                "What are the modules in Node.js?",
                "Why is Node.js preferred over other backend technologies like Java and PHP?",
                "Which database is more popularly used with Node.js?",
                "What are some of the most commonly used libraries in Node.js?",
                "What is the command used to import external libraries?",
                "What does event-driven programming mean?",
                "What is an Event Loop in Node.js?",
                "Differentiate between process.nextTick() and setImmediate()?",
                "What is an EventEmitter in Node.js?",
                "What are the two types of API functions in Node.js?",
                "What is the package.json file?",
                "How do you create a simple Express.js application?",
                "What are streams in Node.js?",
                "Explain asynchronous and non-blocking APIs in Node.js.",
                "What is REPL in Node.js?",
                "What is the buffer class in Node.js?",
                "What is piping in Node.js?",
                "What is callback hell?",
                "What is a reactor pattern in Node.js?",
                "For Node.js, why does Google use the V8 engine?",
                "Explain the concept of middleware in Node.js.",
                "What is WASI, and why is it being introduced?"

        };
        final String[] ExpressJs = {
                "What is Express.js?",
                "What are some distinctive features of Express?",
                "Is Express.js front-end or backend framework?",
                "Why do we use Express.js?",
                "Write the steps for setting up an Express JS application?",
                "What function are arguments available to Express JS route handlers?",
                "How to Config properties in Express JS?",
                "Write a code to get post a query in Express.js",
                "What do you understand by Scaffolding in Express.js?",
                "Do Other MVC frameworks also support scaffolding?",
                "How can you enable debugging in Express.js app?",
                "How Should I Structure my Express JS Application?",
                "How can you deal with error handling in Express.js? Explain with an example.",
                "How can we render a pain HTML?",
                "How to allow CORS in Express JS? Explain with an example?",
                "What is the use of next in Express JS?",
                "How to Redirect 404 Errors to A Page In ExpressJS?"

        };
        final String[] Laravel = {
                "What is Laravel?",
                "What are the pros and cons of Laravel?",
                "What are events in Laravel?",
                "What is validation in Laravel?",
                "How do you install Laravel via composer?",
                "What is a PHP artisan in Laravel?",
                "What is middleware in Laravel?",
                "What template is used by the Laravel engine?",
                "Explain CSRF protection and CSRF token in Laravel.",
                "Explain the Laravel facade.",
                "What is Eloquent in Laravel?",
                "What are the advantages of the Laravel framework?",
                "What are the features of the Laravel framework?",
                "What are the features included in the latest version of Laravel?",
                "What is the project structure of a Laravel project?",
                "What is authentication in Laravel?",
                "What are service providers in Laravel?",
                "What is a homestead in Laravel?",
                "What is dd() in Laravel?",
                "What is yield in Laravel?",
                "What are requests in Laravel?",
                "What are closures in Laravel?",
                "What is soft delete in Laravel?",
                "What is a repository pattern in Laravel?",
                "What is method spoofing in Laravel?",
                "What is tinker in Laravel?",
                "What is the use of the updateOrinsert() method in Laravel?",
                "How do you stop an Artisan server in Laravel?",
                "How can you extend the login expiration time in Auth?",
                "How do you check the current route name?"

        };
        final String[] jQuery = {
                "What is jQuery?",
                "What are the features of jQuery?",
                "Mention some advantages of jQuery.",
                "What are Selectors in jQuery?",
                "What is jQuery.noConflict?",
                "Differentiate among .empty() vs .remove() vs .detach() in jQuery.",
                "What are the methods used to provide effects in jQuery?",
                "What are the various Ajax functions available in jQuery?",
                "Differentiate between width() vs css(‘width’) in jQuery",
                "What is jQuery connect and how to use it?",
                "What is the difference between jquery.size() and jquery.length?",
                "How can events be prevented from stopping to work after an ajax request?",
                "What is the difference between $(window).load and $(document).ready function in jQuery?",
                "What is a CDN? What are the advantages of using CDN?",
                "How can you add a jQuery library in your project?",
                "What is the use of serialize() method in JQuery?",
                "What is jQuery UI?",
                "What is jQuery Datepicker in jQuery?",
                "What is slice() method in jQuery?",
                "What are jQuery plugins?",
                "What is the difference between Map and Grep function in jQuery?",
                "How can jQuery be used in conjunction with another JavaScript library that also uses $ for naming?",
                "What is method chaining in jQuery and what are the advantages?",
                "What is the use of jQuery .each() function?",
                "What is the difference between prop and attr?",
                "What is chaining in jQuery?",
                "What are the features of jQuery used in web applications?"

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