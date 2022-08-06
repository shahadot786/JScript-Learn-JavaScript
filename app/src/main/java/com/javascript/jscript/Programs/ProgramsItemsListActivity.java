package com.javascript.jscript.Programs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
import com.javascript.jscript.databinding.ActivityProgramsItemsListBinding;

import java.util.Map;
import java.util.Objects;

public class ProgramsItemsListActivity extends AppCompatActivity {
    ListView programs;
    String[] list = {};
    ActivityProgramsItemsListBinding binding;
    private AdNetwork adNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsItemsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ProgramsItemsListActivity.this.setTitle("JScript: Practice Programs");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadItems();
        programs = findViewById(R.id.programsList);
        CustomAdapter adapter = new CustomAdapter();
        programs.setAdapter(adapter);
        //load ad
        adNetwork = new AdNetwork(this);
        //ad initialization
        adNetwork.loadInterstitialAd();
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

        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ProgramsItemsListActivity.this, ProgramsCodeActivity.class);
                intent.putExtra("position", list[i]);
                intent.putExtra("output", list[i]);
                startActivity(intent);
                adNetwork.showInterstitialAd();
            }
        });


    }

    private void loadItems() {
        final String[] Basic = {
                "Display the current day and time",
                "Find the area of a triangle",
                "Given year is a leap year",
                "Random integer between 1 to 10",
                "Convert temperatures",
                "Get the extension of a filename",
                "Remove a character at the specified position",
                "Find the largest of three given integers",
                "Specified character exists",
                "Reverse a given string",
                "Capitalize the first letter",
                "Convert a given number to hours and minutes",
                "Convert the letters of a given string in alphabetical order",
                "Concatenate two strings except their first character",
                "Rotate the elements left of a given array of integers of length 3",
                "Find the maximal difference between any two adjacent elements of a given array of integers",
                "Find the shortest possible string",
                "Create the dot products of two given 3D vectors",
                "Sort an array of all prime numbers between 1 and a given integer",
                "Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer",
                "A given string represents a correct sentence or not",
                "A matrix is a diagonal matrix or not",
                "A point lies strictly inside a given circle",
                "A given matrix is lower triangular or not",
                "To create the value of NOR of two given booleans",
                "Largest even number from an array of integers",
                "Find the smallest prime number strictly greater than a given number",
                "Find all distinct prime factors of a given integer",
                "A given fraction is proper or not",
                "A given absolute path for a file in Unix-style",
                "Swap two halves of a given array of integers of even length"
        };

        final String[] Objects = {
                "List the properties of a JavaScript object",
                "Delete a property from an object and print before or after deleting",
                "Find the length of an object",
                "Gather and display information from an object",
                "Calculate the volume of a Cylinder",
                "Sort an array using Bubble Sorting method",
                "Returns a subset of a string",
                "Create a clock and display the time in each second",
                "Calculate the area and perimeter of a circle",
                "Sort an array of JavaScript objects",
                "Print all the methods in an JavaScript object",
                "Parse an URL",
                "Retrieve all the names of object's own and inherited properties",
                "Retrieve all the values of an object's properties",
                "Convert an object into a list of pairs",
                "Get a copy of the object where the keys have become the values and the values the keys",
                "Check whether an object contains specified property",
                "Check whether a specified value is a DOM element"
        };

        final String[] OOPs = {
                "Extend a 3-digit color code to a 6-digit color code",
                "Create a function that invokes each provided function with the arguments it receives and returns the results",
                "Filter out the non-unique values in an array, based on a provided comparator function",
                "Measure the time taken by a function to execute",
                "Remove the key-value pairs corresponding to the given keys from an object",
                "Change function that accepts an array into a variadic function",
                "Split values into two groups with condition",
                "Perform a deep comparison between two values to determine if they are equivalent",
                "Retrieve a set of properties indicated by the given selectors from an object",
                "Compute the average of an array, after mapping each element to a value using the provided function",
                "Create a deep clone of an object",
                "Take any number of iterable objects or objects with a length property and returns the longest one",
                "Create an object with keys generated by running the provided function for each key and the same values as the provided object",
                "Write a JavaScript program to get the median of an array of numbers",
                "Negates a predicate function",
                "Nest a given flat array of objects linked to one another recursively",
                "Remove an event listener from an element",
                "Create an object composed of the properties the given function returns truthy for",
                "Unescape escaped HTML characters",
                "Uncurry a function up to depth n",
                "Apply a function against an accumulator and each key in the object"
        };

        final String[] DOM = {
                "Modify paragraph text style through javascript code using button",
                "Store and display the values of text boxes of a form",
                "Set the background color of a paragraph",
                "Collect the value of href, hreflang, rel, target, and type attributes of a link",
                "JavaScript function to add rows to a table",
                "Create a function to update the content of a specific cell of a table",
                "Create a user defined table, accepting rows and columns",
                "Remove items from a dropdown list",
                "Count and display the items of a dropdown list, in an alert window",
                "Calculate the volume of a sphere",
                "Display a random image by clicking on a button",
                "Highlight the bold words of a paragraph, on mouse over a certain link",
                "Get the width and height of a window online"
        };
        final String[] Advanced = {
                "Check whether a passed string is palindrome or not",
                "Generates all combinations of a string",
                "Returns a passed string with letters in alphabetical order",
                "Check a number is prime or not",
                "Search JavaScript arrays with a binary search",
                "Bubble Sort algorithm",
                "Calculate the factorial of a number",
                "Get the first n Fibonacci numbers",
                "Marge sort - recursion",
                "Convert a binary number to a decimal number",
                "Greatest common divisor (gcd) of two integers",
                "Pythagorean function in JavaScript",
                "Evaluate binomial coefficients",
                "Convert an integer into a Roman Numeral",
                "Function to create a UUID identifier",
                "Calculate the combination of n and r",
                "Show the Hamming numbers",
                "Calculate Lanczos approximation gamma",
                "Find the most frequent item of an array",
                "Flatten a nested array",
                "Sort the specified array of objects by title value",
                "Ungrouping the elements in an array produced by zip",
                "Get a textual representation of a day",
                "Convert a Unix timestamp to time",
                "Sorts an array of numbers, using the quicksort algorithm",
                "Sorts an array of numbers, using the heapsort algorithm",
                "Sorts an array of numbers, using the insertion sort algorithm",
                "Merge sort",
                "Flash sort",
                "Pancake sort",
                "Shell sort",
                "Cocktail shaker sort",
                "Comb sort",
                "Gnome sort",
                "Counting sort",
                "Bogosort"
        };
        final String[] AJAX = {
                "Performing an Ajax GET Request",
                "Performing an Ajax POST Request",
                "Retrieve all header information of a resource (file)",
                "Retrieve specific header information of a resource (file)",
                "Load an XML file with AJAX",
                "Retrieve the content of an XML file",
                "Retrieve the content of a PHP file",
                "Retrieve the content of an ASP file",
                "Retrieve content from a database",
                "Display XML data in an HTML table",
                "Show XML data inside an HTML div element",
                "Navigate through XML nodes",
                "A simple CD catalog application"
        };
        final String[] Typescript = {
                "For loop",
                "For-in loop",
                "For-of loop",
                "Foreach loop",
                "Example for length property",
                "Example for reverse method",
                "Example for sort method",
                "Example for pop method",
                "Example for shift method",
                "Example for push method",
                "A working example on Class",
                "Example of a class using Inheritance",
                "Access Modifiers",
                "Interface as function parameter"
        };
        //pro content
        final String[] Angular = {
                "AngularJS Controller",
                "Controller Function",
                "Different Scopes",
                "The RootScope",
                "Directive Filter orderBy",
                "Input Filters",
                "Reading a static JSON file",
                "Table with CSS",
                "Reading from a MySQL database",
                "Reading from a SQL Server database",
                "AngularJS Forms",
                "AngularJS Validation",
                "AngularJS angular.isString()",
                "AngularJS angular.isNumber()",
                "AngularJS Animation",
                "Animation using CSS3 Transitions",
                "Note Application",
                "ToDo Application"
        };
        final String[] VueJs = {
                "Password Validation Indicator in VueJS",
                "Furniture Inventory",
                "VueJs Watch Property",
                "VueJS Binding",
                "Key Modifiers",
                "Conditional Rendering",
                "List Rendering",
                "VueJS Mixins",
                "VueJs Directives",
                "VueJs Filters",
                "VueJs Routing"
        };
        final String[] ReactJs = {
                "Build Search filter in React",
                "Simple counter exercise",
                "Blade language definition for Highlight.js",
                "React Component",
                "React Props",
                "React Conditionals",
                "React Lists",
                "React Hooks useEffect",
                "React CSS styles",
                "React Form",
                "React Router"
        };
        final String[] EmberJs = {
                "Computed Properties",
                "Classes and Instances",
                "Ember object is initialized",
                "Computed Properties and Aggregate Data",
                "Bindings",
                "Observers"
        };
        final String[] Bootstrap = {
                "Bootstrap table",
                "Appropriate alert",
                "Buttons vertically",
                "Progress bar",
                "Pagination",
                "List groups",
                "Card with a header",
                "Dropdown list",
                "Pill menu",
                "Navigation bar"
        };
        final String[] NodeJs = {
                "External http calls",
                "Check request header for cookies",
                "Print the given object's properties",
                "Get files",
                "Connect to database",
                "Iterate over the given array",
                "Read a file line",
                "Connect to MongoDB database",
                "Zip a file",
                "Use try catch blocks",
                "SMTP mail using Node.js"
        };
        final String[] ExpressJs = {
                "Authentication with login and password",
                "Working with cookie-based sessions",
                "Working with cookies",
                "Transferring files to client",
                "Creating error pages",
                "Markdown as template engine",
                "Accepting multipart-encoded forms",
                "Tracking online user activity with online and redis packages",
                "Working with route parameters",
                "Multiple HTTP operations on the same resource",
                "Organizing routes using a map",
                "Working with route middleware",
                "Simple API service"
        };
        final String[] jQuery = {
                "Select values from a JSON object using jQuery",
                "Check if an object is a jQuery object",
                "Convert a jQuery object into a string",
                "Remove a specific value from an array using jQuery",
                "Register a handler to be called when Ajax requests complete",
                "Add a callback or a collection of callbacks to a callback list",
                "Remove all of the callbacks from a list",
                "Lock a callback list in its current state",
                "Check whether the event namespace is used",
                "Find the data passed with the on() method for each element"
        };


        String programsItems = getIntent().getStringExtra("programsItems");
        switch (programsItems) {
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