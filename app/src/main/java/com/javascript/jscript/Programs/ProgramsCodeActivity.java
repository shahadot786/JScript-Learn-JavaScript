package com.javascript.jscript.Programs;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxAdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.CodesActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityProgramsCodeBinding;

import java.util.Map;
import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class ProgramsCodeActivity extends AppCompatActivity {
    ActivityProgramsCodeBinding binding;
    CodeView codeView, outCodeView;
    FirebaseDatabase database;
    FirebaseAuth auth;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;
    private AdNetwork adNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgramsCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //firebase instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //ad request
        // ads
        adNetwork = new AdNetwork(this);
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
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ProgramsCodeActivity.this.setTitle("Details");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //code view for code
        codeView = findViewById(R.id.codeView);
        codeView.setTheme(CodeViewTheme.ATELIER_SAVANNA_DARK).fillColor();
        //code view for output
        outCodeView = findViewById(R.id.questionDes);
        outCodeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //load values
        loadCodes();
        loadOutputs();

        //progress value
        binding.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.finish.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorSecondary)));
                binding.finish.setTextColor(getResources().getColor(R.color.textColorGrey));
                //send progress value
                database.getReference()
                        .child("Progress")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                        .child("programsCount")
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                int programsCount = 0;
                                if (snapshot.exists()) {
                                    programsCount = snapshot.getValue(Integer.class);
                                }
                                database.getReference()
                                        .child("Progress")
                                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                        .child("programsCount")
                                        .setValue(programsCount + 1)
                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(@NonNull Void unused) {

                                            }
                                        });
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                finish();
            }
        });

    }//ends of onCreate
    //load code
    private void loadCodes() {
        String codes = null;
        switch (getIntent().getStringExtra("position")) {
            case "Display the current day and time":
                codes = ProgramsCodes.codes1;
                break;
            case "Find the area of a triangle":
                codes = ProgramsCodes.codes2;
                break;
            case "Given year is a leap year":
                codes = ProgramsCodes.codes3;
                break;
            case "Random integer between 1 to 10":
                codes = ProgramsCodes.codes4;
                break;
            case "Convert temperatures":
                codes = ProgramsCodes.codes5;
                break;
            case "Get the extension of a filename":
                codes = ProgramsCodes.codes6;
                break;
            case "Remove a character at the specified position":
                codes = ProgramsCodes.codes7;
                break;
            case "Find the largest of three given integers":
                codes = ProgramsCodes.codes8;
                break;
            case "Specified character exists":
                codes = ProgramsCodes.codes9;
                break;
            case "Reverse a given string":
                codes = ProgramsCodes.codes10;
                break;
            case "Capitalize the first letter":
                codes = ProgramsCodes.codes11;
                break;
            case "Convert a given number to hours and minutes":
                codes = ProgramsCodes.codes12;
                break;
            case "Convert the letters of a given string in alphabetical order":
                codes = ProgramsCodes.codes13;
                break;
            case "Concatenate two strings except their first character":
                codes = ProgramsCodes.codes14;
                break;
            case "Rotate the elements left of a given array of integers of length 3":
                codes = ProgramsCodes.codes15;
                break;
            case "Find the maximal difference between any two adjacent elements of a given array of integers":
                codes = ProgramsCodes.codes16;
                break;
            case "Find the shortest possible string":
                codes = ProgramsCodes.codes17;
                break;
            case "Create the dot products of two given 3D vectors":
                codes = ProgramsCodes.codes18;
                break;
            case "Sort an array of all prime numbers between 1 and a given integer":
                codes = ProgramsCodes.codes19;
                break;
            case "Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer":
                codes = ProgramsCodes.codes20;
                break;
            case "A given string represents a correct sentence or not":
                codes = ProgramsCodes.codes21;
                break;
            case "A matrix is a diagonal matrix or not":
                codes = ProgramsCodes.codes22;
                break;
            case "A point lies strictly inside a given circle":
                codes = ProgramsCodes.codes23;
                break;
            case "A given matrix is lower triangular or not":
                codes = ProgramsCodes.codes24;
                break;
            case "To create the value of NOR of two given booleans":
                codes = ProgramsCodes.codes25;
                break;
            case "Largest even number from an array of integers":
                codes = ProgramsCodes.codes26;
                break;
            case "Find the smallest prime number strictly greater than a given number":
                codes = ProgramsCodes.codes27;
                break;
            case "Find all distinct prime factors of a given integer":
                codes = ProgramsCodes.codes28;
                break;
            case "A given fraction is proper or not":
                codes = ProgramsCodes.codes29;
                break;
            case "A given absolute path for a file in Unix-style":
                codes = ProgramsCodes.codes30;
                break;
            case "Swap two halves of a given array of integers of even length":
                codes = ProgramsCodes.codes31;
                break;
            case "List the properties of a JavaScript object":
                codes = ProgramsCodes.codes32;
                break;
            case "Delete a property from an object and print before or after deleting":
                codes = ProgramsCodes.codes33;
                break;
            case "Find the length of an object":
                codes = ProgramsCodes.codes34;
                break;
            case "Gather and display information from an object":
                codes = ProgramsCodes.codes35;
                break;
            case "Calculate the volume of a Cylinder":
                codes = ProgramsCodes.codes36;
                break;
            case "Sort an array using Bubble Sorting method":
                codes = ProgramsCodes.codes37;
                break;
            case "Returns a subset of a string":
                codes = ProgramsCodes.codes38;
                break;
            case "Create a clock and display the time in each second":
                codes = ProgramsCodes.codes39;
                break;
            case "Calculate the area and perimeter of a circle":
                codes = ProgramsCodes.codes40;
                break;
            case "Sort an array of JavaScript objects":
                codes = ProgramsCodes.codes41;
                break;
            case "Print all the methods in an JavaScript object":
                codes = ProgramsCodes.codes42;
                break;
            case "Parse an URL":
                codes = ProgramsCodes.codes43;
                break;
            case "Retrieve all the names of object's own and inherited properties":
                codes = ProgramsCodes.codes44;
                break;
            case "Retrieve all the values of an object's properties":
                codes = ProgramsCodes.codes45;
                break;
            case "Convert an object into a list of pairs":
                codes = ProgramsCodes.codes46;
                break;
            case "Get a copy of the object where the keys have become the values and the values the keys":
                codes = ProgramsCodes.codes47;
                break;
            case "Check whether an object contains specified property":
                codes = ProgramsCodes.codes48;
                break;
            case "Check whether a specified value is a DOM element":
                codes = ProgramsCodes.codes49;
                break;
            case "Extend a 3-digit color code to a 6-digit color code":
                codes = ProgramsCodes.codes50;
                break;
            case "Create a function that invokes each provided function with the arguments it receives and returns the results":
                codes = ProgramsCodes.codes51;
                break;
            case "Filter out the non-unique values in an array, based on a provided comparator function":
                codes = ProgramsCodes.codes52;
                break;
            case "Measure the time taken by a function to execute":
                codes = ProgramsCodes.codes53;
                break;
            case "Remove the key-value pairs corresponding to the given keys from an object":
                codes = ProgramsCodes.codes54;
                break;
            case "Change function that accepts an array into a variadic function":
                codes = ProgramsCodes.codes55;
                break;
            case "Split values into two groups with condition":
                codes = ProgramsCodes.codes56;
                break;
            case "Perform a deep comparison between two values to determine if they are equivalent":
                codes = ProgramsCodes.codes57;
                break;
            case "Retrieve a set of properties indicated by the given selectors from an object":
                codes = ProgramsCodes.codes58;
                break;
            case "Compute the average of an array, after mapping each element to a value using the provided function":
                codes = ProgramsCodes.codes59;
                break;
            case "Create a deep clone of an object":
                codes = ProgramsCodes.codes60;
                break;
            case "Take any number of iterable objects or objects with a length property and returns the longest one":
                codes = ProgramsCodes.codes61;
                break;
            case "Create an object with keys generated by running the provided function for each key and the same values as the provided object":
                codes = ProgramsCodes.codes62;
                break;
            case "Write a JavaScript program to get the median of an array of numbers":
                codes = ProgramsCodes.codes63;
                break;
            case "Negates a predicate function":
                codes = ProgramsCodes.codes64;
                break;
            case "Nest a given flat array of objects linked to one another recursively":
                codes = ProgramsCodes.codes65;
                break;
            case "Remove an event listener from an element":
                codes = ProgramsCodes.codes66;
                break;
            case "Create an object composed of the properties the given function returns truthy for":
                codes = ProgramsCodes.codes67;
                break;
            case "Unescape escaped HTML characters":
                codes = ProgramsCodes.codes68;
                break;
            case "Uncurry a function up to depth n":
                codes = ProgramsCodes.codes69;
                break;
            case "Apply a function against an accumulator and each key in the object":
                codes = ProgramsCodes.codes70;
                break;
            case "Modify paragraph text style through javascript code using button":
                codes = ProgramsCodes.codes71;
                break;
            case "Store and display the values of text boxes of a form":
                codes = ProgramsCodes.codes72;
                break;
            case "Set the background color of a paragraph":
                codes = ProgramsCodes.codes73;
                break;
            case "Collect the value of href, hreflang, rel, target, and type attributes of a link":
                codes = ProgramsCodes.codes74;
                break;
            case "JavaScript function to add rows to a table":
                codes = ProgramsCodes.codes75;
                break;
            case "Create a function to update the content of a specific cell of a table":
                codes = ProgramsCodes.codes76;
                break;
            case "Create a user defined table, accepting rows and columns":
                codes = ProgramsCodes.codes77;
                break;
            case "Remove items from a dropdown list":
                codes = ProgramsCodes.codes78;
                break;
            case "Count and display the items of a dropdown list, in an alert window":
                codes = ProgramsCodes.codes79;
                break;
            case "Calculate the volume of a sphere":
                codes = ProgramsCodes.codes80;
                break;
            case "Display a random image by clicking on a button":
                codes = ProgramsCodes.codes81;
                break;
            case "Highlight the bold words of a paragraph, on mouse over a certain link":
                codes = ProgramsCodes.codes82;
                break;
            case "Get the width and height of a window online":
                codes = ProgramsCodes.codes83;
                break;
            case "Check whether a passed string is palindrome or not":
                codes = ProgramsCodes.codes84;
                break;
            case "Generates all combinations of a string":
                codes = ProgramsCodes.codes85;
                break;
            case "Returns a passed string with letters in alphabetical order":
                codes = ProgramsCodes.codes86;
                break;
            case "Check a number is prime or not":
                codes = ProgramsCodes.codes87;
                break;
            case "Search JavaScript arrays with a binary search":
                codes = ProgramsCodes.codes88;
                break;
            case "Bubble Sort algorithm":
                codes = ProgramsCodes.codes89;
                break;
            case "Calculate the factorial of a number":
                codes = ProgramsCodes.codes90;
                break;
            case "Get the first n Fibonacci numbers":
                codes = ProgramsCodes.codes91;
                break;
            case "Marge sort - recursion":
                codes = ProgramsCodes.codes92;
                break;
            case "Convert a binary number to a decimal number":
                codes = ProgramsCodes.codes93;
                break;
            case "Greatest common divisor (gcd) of two integers":
                codes = ProgramsCodes.codes94;
                break;
            case "Pythagorean function in JavaScript":
                codes = ProgramsCodes.codes95;
                break;
            case "Evaluate binomial coefficients":
                codes = ProgramsCodes.codes96;
                break;
            case "Convert an integer into a Roman Numeral":
                codes = ProgramsCodes.codes97;
                break;
            case "Function to create a UUID identifier":
                codes = ProgramsCodes.codes98;
                break;
            case "Calculate the combination of n and r":
                codes = ProgramsCodes.codes99;
                break;
            case "Show the Hamming numbers":
                codes = ProgramsCodes.codes100;
                break;
            case "Calculate Lanczos approximation gamma":
                codes = ProgramsCodes.codes101;
                break;
            case "Find the most frequent item of an array":
                codes = ProgramsCodes.codes102;
                break;
            case "Flatten a nested array":
                codes = ProgramsCodes.codes103;
                break;
            case "Sort the specified array of objects by title value":
                codes = ProgramsCodes.codes104;
                break;
            case "Ungrouping the elements in an array produced by zip":
                codes = ProgramsCodes.codes105;
                break;
            case "Get a textual representation of a day":
                codes = ProgramsCodes.codes106;
                break;
            case "Convert a Unix timestamp to time":
                codes = ProgramsCodes.codes107;
                break;
            case "Sorts an array of numbers, using the quicksort algorithm":
                codes = ProgramsCodes.codes108;
                break;
            case "Merge sort":
                codes = ProgramsCodes.codes109;
                break;
            case "Sorts an array of numbers, using the heapsort algorithm":
                codes = ProgramsCodes.codes110;
                break;
            case "Sorts an array of numbers, using the insertion sort algorithm":
                codes = ProgramsCodes.codes111;
                break;
            case "Flash sort":
                codes = ProgramsCodes.codes112;
                break;
            case "Pancake sort":
                codes = ProgramsCodes.codes113;
                break;
            case "Shell sort":
                codes = ProgramsCodes.codes114;
                break;
            case "Cocktail shaker sort":
                codes = ProgramsCodes.codes115;
                break;
            case "Comb sort":
                codes = ProgramsCodes.codes116;
                break;
            case "Gnome sort":
                codes = ProgramsCodes.codes117;
                break;
            case "Counting sort":
                codes = ProgramsCodes.codes118;
                break;
            case "Bogosort":
                codes = ProgramsCodes.codes119;
                break;
            case "Performing an Ajax GET Request":
                codes = ProgramsCodes.codes120;
                break;
            case "Performing an Ajax POST Request":
                codes = ProgramsCodes.codes121;
                break;
            case "Retrieve all header information of a resource (file)":
                codes = ProgramsCodes.codes122;
                break;
            case "Retrieve specific header information of a resource (file)":
                codes = ProgramsCodes.codes123;
                break;
            case "Load an XML file with AJAX":
                codes = ProgramsCodes.codes124;
                break;
            case "Retrieve the content of an XML file":
                codes = ProgramsCodes.codes125;
                break;
            case "Retrieve the content of a PHP file":
                codes = ProgramsCodes.codes126;
                break;
            case "Retrieve the content of an ASP file":
                codes = ProgramsCodes.codes127;
                break;
            case "Retrieve content from a database":
                codes = ProgramsCodes.codes128;
                break;
            case "Display XML data in an HTML table":
                codes = ProgramsCodes.codes129;
                break;
            case "Show XML data inside an HTML div element":
                codes = ProgramsCodes.codes130;
                break;
            case "Navigate through XML nodes":
                codes = ProgramsCodes.codes131;
                break;
            case "A simple CD catalog application":
                codes = ProgramsCodes.codes132;
                break;
            case "For loop":
                codes = ProgramsCodes.codes133;
                break;
            case "For-in loop":
                codes = ProgramsCodes.codes134;
                break;
            case "For-of loop":
                codes = ProgramsCodes.codes135;
                break;
            case "Foreach loop":
                codes = ProgramsCodes.codes136;
                break;
            case "Example for length property":
                codes = ProgramsCodes.codes137;
                break;
            case "Example for reverse method":
                codes = ProgramsCodes.codes138;
                break;
            case "Example for sort method":
                codes = ProgramsCodes.codes139;
                break;
            case "Example for pop method":
                codes = ProgramsCodes.codes140;
                break;
            case "Example for shift method":
                codes = ProgramsCodes.codes141;
                break;
            case "Example for push method":
                codes = ProgramsCodes.codes142;
                break;
            case "A working example on Class":
                codes = ProgramsCodes.codes143;
                break;
            case "Example of a class using Inheritance":
                codes = ProgramsCodes.codes144;
                break;
            case "Access Modifiers":
                codes = ProgramsCodes.codes145;
                break;
            case "Interface as function parameter":
                codes = ProgramsCodes.codes146;
                break;
            case "AngularJS Controller":
                codes = ProgramsCodes.codes147;
                break;
            case "Controller Function":
                codes = ProgramsCodes.codes148;
                break;
            case "Different Scopes":
                codes = ProgramsCodes.codes149;
                break;
            case "The RootScope":
                codes = ProgramsCodes.codes150;
                break;
            case "Directive Filter orderBy":
                codes = ProgramsCodes.codes151;
                break;
            case "Input Filters":
                codes = ProgramsCodes.codes152;
                break;
            case "Reading a static JSON file":
                codes = ProgramsCodes.codes153;
                break;
            case "Table with CSS":
                codes = ProgramsCodes.codes154;
                break;
            case "Reading from a MySQL database":
                codes = ProgramsCodes.codes155;
                break;
            case "Reading from a SQL Server database":
                codes = ProgramsCodes.codes156;
                break;
            case "AngularJS Forms":
                codes = ProgramsCodes.codes157;
                break;
            case "AngularJS Validation":
                codes = ProgramsCodes.codes158;
                break;
            case "AngularJS angular.isString()":
                codes = ProgramsCodes.codes159;
                break;
            case "AngularJS angular.isNumber()":
                codes = ProgramsCodes.codes160;
                break;
            case "AngularJS Animation":
                codes = ProgramsCodes.codes161;
                break;
            case "Animation using CSS3 Transitions":
                codes = ProgramsCodes.codes162;
                break;
            case "Note Application":
                codes = ProgramsCodes.codes163;
                break;
            case "ToDo Application":
                codes = ProgramsCodes.codes164;
                break;
            case "Password Validation Indicator in VueJS":
                codes = ProgramsCodes.codes165;
                break;
            case "VueJs Watch Property":
                codes = ProgramsCodes.codes166;
                break;
            case "VueJS Binding":
                codes = ProgramsCodes.codes167;
                break;
            case "Key Modifiers":
                codes = ProgramsCodes.codes168;
                break;
            case "Conditional Rendering":
                codes = ProgramsCodes.codes169;
                break;
            case "List Rendering":
                codes = ProgramsCodes.codes170;
                break;
            case "VueJS Mixins":
                codes = ProgramsCodes.codes171;
                break;
            case "VueJs Directives":
                codes = ProgramsCodes.codes172;
                break;
            case "VueJs Filters":
                codes = ProgramsCodes.codes173;
                break;
            case "VueJs Routing":
                codes = ProgramsCodes.codes174;
                break;
            case "Furniture Inventory":
                codes = ProgramsCodes.codes175;
                break;
            case "Build Search filter in React":
                codes = ProgramsCodes.codes176;
                break;
            case "Simple counter exercise":
                codes = ProgramsCodes.codes177;
                break;
            case "Blade language definition for Highlight.js":
                codes = ProgramsCodes.codes178;
                break;
            case "React Component":
                codes = ProgramsCodes.codes179;
                break;
            case "React Props":
                codes = ProgramsCodes.codes180;
                break;
            case "React Conditionals":
                codes = ProgramsCodes.codes181;
                break;
            case "React Lists":
                codes = ProgramsCodes.codes182;
                break;
            case "React Hooks useEffect":
                codes = ProgramsCodes.codes183;
                break;
            case "React CSS styles":
                codes = ProgramsCodes.codes184;
                break;
            case "React Form":
                codes = ProgramsCodes.codes185;
                break;
            case "React Router":
                codes = ProgramsCodes.codes186;
                break;
            case "Computed Properties":
                codes = ProgramsCodes.codes187;
                break;
            case "Classes and Instances":
                codes = ProgramsCodes.codes188;
                break;
            case "Ember object is initialized":
                codes = ProgramsCodes.codes189;
                break;
            case "Computed Properties and Aggregate Data":
                codes = ProgramsCodes.codes190;
                break;
            case "Bindings":
                codes = ProgramsCodes.codes191;
                break;
            case "Observers":
                codes = ProgramsCodes.codes192;
                break;
            case "Bootstrap table":
                codes = ProgramsCodes.codes193;
                break;
            case "Appropriate alert":
                codes = ProgramsCodes.codes194;
                break;
            case "Buttons vertically":
                codes = ProgramsCodes.codes195;
                break;
            case "Progress bar":
                codes = ProgramsCodes.codes196;
                break;
            case "Pagination":
                codes = ProgramsCodes.codes197;
                break;
            case "List groups":
                codes = ProgramsCodes.codes198;
                break;
            case "Card with a header":
                codes = ProgramsCodes.codes199;
                break;
            case "Dropdown list":
                codes = ProgramsCodes.codes200;
                break;
            case "Pill menu":
                codes = ProgramsCodes.codes201;
                break;
            case "Navigation bar":
                codes = ProgramsCodes.codes202;
                break;
            case "External http calls":
                codes = ProgramsCodes.codes203;
                break;
            case "Check request header for cookies":
                codes = ProgramsCodes.codes204;
                break;
            case "Print the given object's properties":
                codes = ProgramsCodes.codes205;
                break;
            case "Get files":
                codes = ProgramsCodes.codes206;
                break;
            case "Connect to database":
                codes = ProgramsCodes.codes207;
                break;
            case "Iterate over the given array":
                codes = ProgramsCodes.codes208;
                break;
            case "Read a file line":
                codes = ProgramsCodes.codes209;
                break;
            case "Connect to MongoDB database":
                codes = ProgramsCodes.codes210;
                break;
            case "Zip a file":
                codes = ProgramsCodes.codes211;
                break;
            case "Use try catch blocks":
                codes = ProgramsCodes.codes212;
                break;
            case "SMTP mail using Node.js":
                codes = ProgramsCodes.codes213;
                break;
            case "Authentication with login and password":
                codes = ProgramsCodes.codes214;
                break;
            case "Working with cookie-based sessions":
                codes = ProgramsCodes.codes215;
                break;
            case "Working with cookies":
                codes = ProgramsCodes.codes216;
                break;
            case "Transferring files to client":
                codes = ProgramsCodes.codes217;
                break;
            case "Creating error pages":
                codes = ProgramsCodes.codes218;
                break;
            case "Markdown as template engine":
                codes = ProgramsCodes.codes219;
                break;
            case "Accepting multipart-encoded forms":
                codes = ProgramsCodes.codes220;
                break;
            case "Tracking online user activity with online and redis packages":
                codes = ProgramsCodes.codes221;
                break;
            case "Working with route parameters":
                codes = ProgramsCodes.codes222;
                break;
            case "Multiple HTTP operations on the same resource":
                codes = ProgramsCodes.codes223;
                break;
            case "Organizing routes using a map":
                codes = ProgramsCodes.codes224;
                break;
            case "Working with route middleware":
                codes = ProgramsCodes.codes225;
                break;
            case "Simple API service":
                codes = ProgramsCodes.codes226;
                break;
            case "Select values from a JSON object using jQuery":
                codes = ProgramsCodes.codes227;
                break;
            case "Check if an object is a jQuery object":
                codes = ProgramsCodes.codes228;
                break;
            case "Convert a jQuery object into a string":
                codes = ProgramsCodes.codes229;
                break;
            case "Remove a specific value from an array using jQuery":
                codes = ProgramsCodes.codes230;
                break;
            case "Register a handler to be called when Ajax requests complete":
                codes = ProgramsCodes.codes231;
                break;
            case "Remove all of the callbacks from a list":
                codes = ProgramsCodes.codes232;
                break;
            case "Add a callback or a collection of callbacks to a callback list":
                codes = ProgramsCodes.codes233;
                break;
            case "Lock a callback list in its current state":
                codes = ProgramsCodes.codes234;
                break;
            case "Check whether the event namespace is used":
                codes = ProgramsCodes.codes235;
                break;
            case "Find the data passed with the on() method for each element":
                codes = ProgramsCodes.codes236;
                break;
        }
        codeView.showCode(codes);

    }

    //load output
    private void loadOutputs() {
        String outputs = null;
        switch (getIntent().getStringExtra("output")) {
            case "Display the current day and time":
                outputs = ProgramsOutputs.outputs1;
                break;
            case "Find the area of a triangle":
                outputs = ProgramsOutputs.outputs2;
                break;
            case "Given year is a leap year":
                outputs = ProgramsOutputs.outputs3;
                break;
            case "Random integer between 1 to 10":
                outputs = ProgramsOutputs.outputs4;
                break;
            case "Convert temperatures":
                outputs = ProgramsOutputs.outputs5;
                break;
            case "Get the extension of a filename":
                outputs = ProgramsOutputs.outputs6;
                break;
            case "Remove a character at the specified position":
                outputs = ProgramsOutputs.outputs7;
                break;
            case "Find the largest of three given integers":
                outputs = ProgramsOutputs.outputs8;
                break;
            case "Specified character exists":
                outputs = ProgramsOutputs.outputs9;
                break;
            case "Reverse a given string":
                outputs = ProgramsOutputs.outputs10;
                break;
            case "Capitalize the first letter":
                outputs = ProgramsOutputs.outputs11;
                break;
            case "Convert a given number to hours and minutes":
                outputs = ProgramsOutputs.outputs12;
                break;
            case "Convert the letters of a given string in alphabetical order":
                outputs = ProgramsOutputs.outputs13;
                break;
            case "Concatenate two strings except their first character":
                outputs = ProgramsOutputs.outputs14;
                break;
            case "Rotate the elements left of a given array of integers of length 3":
                outputs = ProgramsOutputs.outputs15;
                break;
            case "Find the maximal difference between any two adjacent elements of a given array of integers":
                outputs = ProgramsOutputs.outputs16;
                break;
            case "Find the shortest possible string":
                outputs = ProgramsOutputs.outputs17;
                break;
            case "Create the dot products of two given 3D vectors":
                outputs = ProgramsOutputs.outputs18;
                break;
            case "Sort an array of all prime numbers between 1 and a given integer":
                outputs = ProgramsOutputs.outputs19;
                break;
            case "Calculate the sum of n + n/2 + n/4 + n/8 + .... where n is a positive integer and all divisions are integer":
                outputs = ProgramsOutputs.outputs20;
                break;
            case "A given string represents a correct sentence or not":
                outputs = ProgramsOutputs.outputs21;
                break;
            case "A matrix is a diagonal matrix or not":
                outputs = ProgramsOutputs.outputs22;
                break;
            case "A point lies strictly inside a given circle":
                outputs = ProgramsOutputs.outputs23;
                break;
            case "A given matrix is lower triangular or not":
                outputs = ProgramsOutputs.outputs24;
                break;
            case "To create the value of NOR of two given booleans":
                outputs = ProgramsOutputs.outputs25;
                break;
            case "Largest even number from an array of integers":
                outputs = ProgramsOutputs.outputs26;
                break;
            case "Find the smallest prime number strictly greater than a given number":
                outputs = ProgramsOutputs.outputs27;
                break;
            case "Find all distinct prime factors of a given integer":
                outputs = ProgramsOutputs.outputs28;
                break;
            case "A given fraction is proper or not":
                outputs = ProgramsOutputs.outputs29;
                break;
            case "A given absolute path for a file in Unix-style":
                outputs = ProgramsOutputs.outputs30;
                break;
            case "Swap two halves of a given array of integers of even length":
                outputs = ProgramsOutputs.outputs31;
                break;
            case "List the properties of a JavaScript object":
                outputs = ProgramsOutputs.outputs32;
                break;
            case "Delete a property from an object and print before or after deleting":
                outputs = ProgramsOutputs.outputs33;
                break;
            case "Find the length of an object":
                outputs = ProgramsOutputs.outputs34;
                break;
            case "Gather and display information from an object":
                outputs = ProgramsOutputs.outputs35;
                break;
            case "Calculate the volume of a Cylinder":
                outputs = ProgramsOutputs.outputs36;
                break;
            case "Sort an array using Bubble Sorting method":
                outputs = ProgramsOutputs.outputs37;
                break;
            case "Returns a subset of a string":
                outputs = ProgramsOutputs.outputs38;
                break;
            case "Create a clock and display the time in each second":
                outputs = ProgramsOutputs.outputs39;
                break;
            case "Calculate the area and perimeter of a circle":
                outputs = ProgramsOutputs.outputs40;
                break;
            case "Sort an array of JavaScript objects":
                outputs = ProgramsOutputs.outputs41;
                break;
            case "Print all the methods in an JavaScript object":
                outputs = ProgramsOutputs.outputs42;
                break;
            case "Parse an URL":
                outputs = ProgramsOutputs.outputs43;
                break;
            case "Retrieve all the names of object's own and inherited properties":
                outputs = ProgramsOutputs.outputs44;
                break;
            case "Retrieve all the values of an object's properties":
                outputs = ProgramsOutputs.outputs45;
                break;
            case "Convert an object into a list of pairs":
                outputs = ProgramsOutputs.outputs46;
                break;
            case "Get a copy of the object where the keys have become the values and the values the keys":
                outputs = ProgramsOutputs.outputs47;
                break;
            case "Check whether an object contains specified property":
                outputs = ProgramsOutputs.outputs48;
                break;
            case "Check whether a specified value is a DOM element":
                outputs = ProgramsOutputs.outputs49;
                break;
            case "Extend a 3-digit color code to a 6-digit color code":
                outputs = ProgramsOutputs.outputs50;
                break;
            case "Create a function that invokes each provided function with the arguments it receives and returns the results":
                outputs = ProgramsOutputs.outputs51;
                break;
            case "Filter out the non-unique values in an array, based on a provided comparator function":
                outputs = ProgramsOutputs.outputs52;
                break;
            case "Measure the time taken by a function to execute":
                outputs = ProgramsOutputs.outputs53;
                break;
            case "Remove the key-value pairs corresponding to the given keys from an object":
                outputs = ProgramsOutputs.outputs54;
                break;
            case "Change function that accepts an array into a variadic function":
                outputs = ProgramsOutputs.outputs55;
                break;
            case "Split values into two groups with condition":
                outputs = ProgramsOutputs.outputs56;
                break;
            case "Perform a deep comparison between two values to determine if they are equivalent":
                outputs = ProgramsOutputs.outputs57;
                break;
            case "Retrieve a set of properties indicated by the given selectors from an object":
                outputs = ProgramsOutputs.outputs58;
                break;
            case "Compute the average of an array, after mapping each element to a value using the provided function":
                outputs = ProgramsOutputs.outputs59;
                break;
            case "Create a deep clone of an object":
                outputs = ProgramsOutputs.outputs60;
                break;
            case "Take any number of iterable objects or objects with a length property and returns the longest one":
                outputs = ProgramsOutputs.outputs61;
                break;
            case "Create an object with keys generated by running the provided function for each key and the same values as the provided object":
                outputs = ProgramsOutputs.outputs62;
                break;
            case "Write a JavaScript program to get the median of an array of numbers":
                outputs = ProgramsOutputs.outputs63;
                break;
            case "Negates a predicate function":
                outputs = ProgramsOutputs.outputs64;
                break;
            case "Nest a given flat array of objects linked to one another recursively":
                outputs = ProgramsOutputs.outputs65;
                break;
            case "Remove an event listener from an element":
                outputs = ProgramsOutputs.outputs66;
                break;
            case "Create an object composed of the properties the given function returns truthy for":
                outputs = ProgramsOutputs.outputs67;
                break;
            case "Unescape escaped HTML characters":
                outputs = ProgramsOutputs.outputs68;
                break;
            case "Uncurry a function up to depth n":
                outputs = ProgramsOutputs.outputs69;
                break;
            case "Apply a function against an accumulator and each key in the object":
                outputs = ProgramsOutputs.outputs70;
                break;
            case "Modify paragraph text style through javascript code using button":
                outputs = ProgramsOutputs.outputs71;
                break;
            case "Store and display the values of text boxes of a form":
                outputs = ProgramsOutputs.outputs72;
                break;
            case "Set the background color of a paragraph":
                outputs = ProgramsOutputs.outputs73;
                break;
            case "Collect the value of href, hreflang, rel, target, and type attributes of a link":
                outputs = ProgramsOutputs.outputs74;
                break;
            case "JavaScript function to add rows to a table":
                outputs = ProgramsOutputs.outputs75;
                break;
            case "Create a function to update the content of a specific cell of a table":
                outputs = ProgramsOutputs.outputs76;
                break;
            case "Create a user defined table, accepting rows and columns":
                outputs = ProgramsOutputs.outputs77;
                break;
            case "Remove items from a dropdown list":
                outputs = ProgramsOutputs.outputs78;
                break;
            case "Count and display the items of a dropdown list, in an alert window":
                outputs = ProgramsOutputs.outputs79;
                break;
            case "Calculate the volume of a sphere":
                outputs = ProgramsOutputs.outputs80;
                break;
            case "Display a random image by clicking on a button":
                outputs = ProgramsOutputs.outputs81;
                break;
            case "Highlight the bold words of a paragraph, on mouse over a certain link":
                outputs = ProgramsOutputs.outputs82;
                break;
            case "Get the width and height of a window online":
                outputs = ProgramsOutputs.outputs83;
                break;
            case "Check whether a passed string is palindrome or not":
                outputs = ProgramsOutputs.outputs84;
                break;
            case "Generates all combinations of a string":
                outputs = ProgramsOutputs.outputs85;
                break;
            case "Returns a passed string with letters in alphabetical order":
                outputs = ProgramsOutputs.outputs86;
                break;
            case "Check a number is prime or not":
                outputs = ProgramsOutputs.outputs87;
                break;
            case "Search JavaScript arrays with a binary search":
                outputs = ProgramsOutputs.outputs88;
                break;
            case "Bubble Sort algorithm":
                outputs = ProgramsOutputs.outputs89;
                break;
            case "Calculate the factorial of a number":
                outputs = ProgramsOutputs.outputs90;
                break;
            case "Get the first n Fibonacci numbers":
                outputs = ProgramsOutputs.outputs91;
                break;
            case "Marge sort - recursion":
                outputs = ProgramsOutputs.outputs92;
                break;
            case "Convert a binary number to a decimal number":
                outputs = ProgramsOutputs.outputs93;
                break;
            case "Greatest common divisor (gcd) of two integers":
                outputs = ProgramsOutputs.outputs94;
                break;
            case "Pythagorean function in JavaScript":
                outputs = ProgramsOutputs.outputs95;
                break;
            case "Evaluate binomial coefficients":
                outputs = ProgramsOutputs.outputs96;
                break;
            case "Convert an integer into a Roman Numeral":
                outputs = ProgramsOutputs.outputs97;
                break;
            case "Function to create a UUID identifier":
                outputs = ProgramsOutputs.outputs98;
                break;
            case "Calculate the combination of n and r":
                outputs = ProgramsOutputs.outputs99;
                break;
            case "Show the Hamming numbers":
                outputs = ProgramsOutputs.outputs100;
                break;
            case "Calculate Lanczos approximation gamma":
                outputs = ProgramsOutputs.outputs101;
                break;
            case "Find the most frequent item of an array":
                outputs = ProgramsOutputs.outputs102;
                break;
            case "Flatten a nested array":
                outputs = ProgramsOutputs.outputs103;
                break;
            case "Sort the specified array of objects by title value":
                outputs = ProgramsOutputs.outputs104;
                break;
            case "Ungrouping the elements in an array produced by zip":
                outputs = ProgramsOutputs.outputs105;
                break;
            case "Get a textual representation of a day":
                outputs = ProgramsOutputs.outputs106;
                break;
            case "Convert a Unix timestamp to time":
                outputs = ProgramsOutputs.outputs107;
                break;
            case "Sorts an array of numbers, using the quicksort algorithm":
                outputs = ProgramsOutputs.outputs108;
                break;
            case "Merge sort":
                outputs = ProgramsOutputs.outputs109;
                break;
            case "Sorts an array of numbers, using the heapsort algorithm":
                outputs = ProgramsOutputs.outputs110;
                break;
            case "Sorts an array of numbers, using the insertion sort algorithm":
                outputs = ProgramsOutputs.outputs111;
                break;
            case "Flash sort":
                outputs = ProgramsOutputs.outputs112;
                break;
            case "Pancake sort":
                outputs = ProgramsOutputs.outputs113;
                break;
            case "Shell sort":
                outputs = ProgramsOutputs.outputs114;
                break;
            case "Cocktail shaker sort":
                outputs = ProgramsOutputs.outputs115;
                break;
            case "Comb sort":
                outputs = ProgramsOutputs.outputs116;
                break;
            case "Gnome sort":
                outputs = ProgramsOutputs.outputs117;
                break;
            case "Counting sort":
                outputs = ProgramsOutputs.outputs118;
                break;
            case "Bogosort":
                outputs = ProgramsOutputs.outputs119;
                break;
            case "Performing an Ajax GET Request":
                outputs = ProgramsOutputs.outputs120;
                break;
            case "Performing an Ajax POST Request":
                outputs = ProgramsOutputs.outputs121;
                break;
            case "Retrieve all header information of a resource (file)":
                outputs = ProgramsOutputs.outputs122;
                break;
            case "Retrieve specific header information of a resource (file)":
                outputs = ProgramsOutputs.outputs123;
                break;
            case "Load an XML file with AJAX":
                outputs = ProgramsOutputs.outputs124;
                break;
            case "Retrieve the content of an XML file":
                outputs = ProgramsOutputs.outputs125;
                break;
            case "Retrieve the content of a PHP file":
                outputs = ProgramsOutputs.outputs126;
                break;
            case "Retrieve the content of an ASP file":
                outputs = ProgramsOutputs.outputs127;
                break;
            case "Retrieve content from a database":
                outputs = ProgramsOutputs.outputs128;
                break;
            case "Display XML data in an HTML table":
                outputs = ProgramsOutputs.outputs129;
                break;
            case "Show XML data inside an HTML div element":
                outputs = ProgramsOutputs.outputs130;
                break;
            case "Navigate through XML nodes":
                outputs = ProgramsOutputs.outputs131;
                break;
            case "A simple CD catalog application":
                outputs = ProgramsOutputs.outputs132;
                break;
            case "For loop":
                outputs = ProgramsOutputs.outputs133;
                break;
            case "For-in loop":
                outputs = ProgramsOutputs.outputs134;
                break;
            case "For-of loop":
                outputs = ProgramsOutputs.outputs135;
                break;
            case "Foreach loop":
                outputs = ProgramsOutputs.outputs136;
                break;
            case "Example for length property":
                outputs = ProgramsOutputs.outputs137;
                break;
            case "Example for reverse method":
                outputs = ProgramsOutputs.outputs138;
                break;
            case "Example for sort method":
                outputs = ProgramsOutputs.outputs139;
                break;
            case "Example for pop method":
                outputs = ProgramsOutputs.outputs140;
                break;
            case "Example for shift method":
                outputs = ProgramsOutputs.outputs141;
                break;
            case "Example for push method":
                outputs = ProgramsOutputs.outputs142;
                break;
            case "A working example on Class":
                outputs = ProgramsOutputs.outputs143;
                break;
            case "Example of a class using Inheritance":
                outputs = ProgramsOutputs.outputs144;
                break;
            case "Access Modifiers":
                outputs = ProgramsOutputs.outputs145;
                break;
            case "Interface as function parameter":
                outputs = ProgramsOutputs.outputs146;
                break;
            case "AngularJS Controller":
                outputs = ProgramsOutputs.outputs147;
                break;
            case "Controller Function":
                outputs = ProgramsOutputs.outputs148;
                break;
            case "Different Scopes":
                outputs = ProgramsOutputs.outputs149;
                break;
            case "The RootScope":
                outputs = ProgramsOutputs.outputs150;
                break;
            case "Directive Filter orderBy":
                outputs = ProgramsOutputs.outputs151;
                break;
            case "Input Filters":
                outputs = ProgramsOutputs.outputs152;
                break;
            case "Reading a static JSON file":
                outputs = ProgramsOutputs.outputs153;
                break;
            case "Table with CSS":
                outputs = ProgramsOutputs.outputs154;
                break;
            case "Reading from a MySQL database":
                outputs = ProgramsOutputs.outputs155;
                break;
            case "Reading from a SQL Server database":
                outputs = ProgramsOutputs.outputs156;
                break;
            case "AngularJS Forms":
                outputs = ProgramsOutputs.outputs157;
                break;
            case "AngularJS Validation":
                outputs = ProgramsOutputs.outputs158;
                break;
            case "AngularJS angular.isString()":
                outputs = ProgramsOutputs.outputs159;
                break;
            case "AngularJS angular.isNumber()":
                outputs = ProgramsOutputs.outputs160;
                break;
            case "AngularJS Animation":
                outputs = ProgramsOutputs.outputs161;
                break;
            case "Animation using CSS3 Transitions":
                outputs = ProgramsOutputs.outputs162;
                break;
            case "Note Application":
                outputs = ProgramsOutputs.outputs163;
                break;
            case "ToDo Application":
                outputs = ProgramsOutputs.outputs164;
                break;
            case "Password Validation Indicator in VueJS":
                outputs = ProgramsOutputs.outputs165;
                break;
            case "VueJs Watch Property":
                outputs = ProgramsOutputs.outputs166;
                break;
            case "VueJS Binding":
                outputs = ProgramsOutputs.outputs167;
                break;
            case "Key Modifiers":
                outputs = ProgramsOutputs.outputs168;
                break;
            case "Conditional Rendering":
                outputs = ProgramsOutputs.outputs169;
                break;
            case "List Rendering":
                outputs = ProgramsOutputs.outputs170;
                break;
            case "VueJS Mixins":
                outputs = ProgramsOutputs.outputs171;
                break;
            case "VueJs Directives":
                outputs = ProgramsOutputs.outputs172;
                break;
            case "VueJs Filters":
                outputs = ProgramsOutputs.outputs173;
                break;
            case "VueJs Routing":
                outputs = ProgramsOutputs.outputs174;
                break;
            case "Furniture Inventory":
                outputs = ProgramsOutputs.outputs175;
                break;
            case "Build Search filter in React":
                outputs = ProgramsOutputs.outputs176;
                break;
            case "Simple counter exercise":
                outputs = ProgramsOutputs.outputs177;
                break;
            case "Blade language definition for Highlight.js":
                outputs = ProgramsOutputs.outputs178;
                break;
            case "React Component":
                outputs = ProgramsOutputs.outputs179;
                break;
            case "React Props":
                outputs = ProgramsOutputs.outputs180;
                break;
            case "React Conditionals":
                outputs = ProgramsOutputs.outputs181;
                break;
            case "React Lists":
                outputs = ProgramsOutputs.outputs182;
                break;
            case "React Hooks useEffect":
                outputs = ProgramsOutputs.outputs183;
                break;
            case "React CSS styles":
                outputs = ProgramsOutputs.outputs184;
                break;
            case "React Form":
                outputs = ProgramsOutputs.outputs185;
                break;
            case "React Router":
                outputs = ProgramsOutputs.outputs186;
                break;
            case "Computed Properties":
                outputs = ProgramsOutputs.outputs187;
                break;
            case "Classes and Instances":
                outputs = ProgramsOutputs.outputs188;
                break;
            case "Ember object is initialized":
                outputs = ProgramsOutputs.outputs189;
                break;
            case "Computed Properties and Aggregate Data":
                outputs = ProgramsOutputs.outputs190;
                break;
            case "Bindings":
                outputs = ProgramsOutputs.outputs191;
                break;
            case "Observers":
                outputs = ProgramsOutputs.outputs192;
                break;
            case "Bootstrap table":
                outputs = ProgramsOutputs.outputs193;
                break;
            case "Appropriate alert":
                outputs = ProgramsOutputs.outputs194;
                break;
            case "Buttons vertically":
                outputs = ProgramsOutputs.outputs195;
                break;
            case "Progress bar":
                outputs = ProgramsOutputs.outputs196;
                break;
            case "Pagination":
                outputs = ProgramsOutputs.outputs197;
                break;
            case "List groups":
                outputs = ProgramsOutputs.outputs198;
                break;
            case "Card with a header":
                outputs = ProgramsOutputs.outputs199;
                break;
            case "Dropdown list":
                outputs = ProgramsOutputs.outputs200;
                break;
            case "Pill menu":
                outputs = ProgramsOutputs.outputs201;
                break;
            case "Navigation bar":
                outputs = ProgramsOutputs.outputs202;
                break;
            case "External http calls":
                outputs = ProgramsOutputs.outputs203;
                break;
            case "Check request header for cookies":
                outputs = ProgramsOutputs.outputs204;
                break;
            case "Print the given object's properties":
                outputs = ProgramsOutputs.outputs205;
                break;
            case "Get files":
                outputs = ProgramsOutputs.outputs206;
                break;
            case "Connect to database":
                outputs = ProgramsOutputs.outputs207;
                break;
            case "Iterate over the given array":
                outputs = ProgramsOutputs.outputs208;
                break;
            case "Read a file line":
                outputs = ProgramsOutputs.outputs209;
                break;
            case "Connect to MongoDB database":
                outputs = ProgramsOutputs.outputs210;
                break;
            case "Zip a file":
                outputs = ProgramsOutputs.outputs211;
                break;
            case "Use try catch blocks":
                outputs = ProgramsOutputs.outputs212;
                break;
            case "SMTP mail using Node.js":
                outputs = ProgramsOutputs.outputs213;
                break;
            case "Authentication with login and password":
                outputs = ProgramsOutputs.outputs214;
                break;
            case "Working with cookie-based sessions":
                outputs = ProgramsOutputs.outputs215;
                break;
            case "Working with cookies":
                outputs = ProgramsOutputs.outputs216;
                break;
            case "Transferring files to client":
                outputs = ProgramsOutputs.outputs217;
                break;
            case "Creating error pages":
                outputs = ProgramsOutputs.outputs218;
                break;
            case "Markdown as template engine":
                outputs = ProgramsOutputs.outputs219;
                break;
            case "Accepting multipart-encoded forms":
                outputs = ProgramsOutputs.outputs220;
                break;
            case "Tracking online user activity with online and redis packages":
                outputs = ProgramsOutputs.outputs221;
                break;
            case "Working with route parameters":
                outputs = ProgramsOutputs.outputs222;
                break;
            case "Multiple HTTP operations on the same resource":
                outputs = ProgramsOutputs.outputs223;
                break;
            case "Organizing routes using a map":
                outputs = ProgramsOutputs.outputs224;
                break;
            case "Working with route middleware":
                outputs = ProgramsOutputs.outputs225;
                break;
            case "Simple API service":
                outputs = ProgramsOutputs.outputs226;
                break;
            case "Select values from a JSON object using jQuery":
                outputs = ProgramsOutputs.outputs227;
                break;
            case "Check if an object is a jQuery object":
                outputs = ProgramsOutputs.outputs228;
                break;
            case "Convert a jQuery object into a string":
                outputs = ProgramsOutputs.outputs229;
                break;
            case "Remove a specific value from an array using jQuery":
                outputs = ProgramsOutputs.outputs230;
                break;
            case "Register a handler to be called when Ajax requests complete":
                outputs = ProgramsOutputs.outputs231;
                break;
            case "Remove all of the callbacks from a list":
                outputs = ProgramsOutputs.outputs232;
                break;
            case "Add a callback or a collection of callbacks to a callback list":
                outputs = ProgramsOutputs.outputs233;
                break;
            case "Lock a callback list in its current state":
                outputs = ProgramsOutputs.outputs234;
                break;
            case "Check whether the event namespace is used":
                outputs = ProgramsOutputs.outputs235;
                break;
            case "Find the data passed with the on() method for each element":
                outputs = ProgramsOutputs.outputs236;
                break;
        }
        outCodeView.showCode(outputs);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_codes, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.codes) {
            //network check
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ProgramsCodeActivity.CONNECTIVITY_SERVICE);
            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                //we are connected to a network
                startActivity(new Intent(ProgramsCodeActivity.this, CodesActivity.class));
            } else {
                toastText.setText(R.string.no_connection_text);
                toast.show();
            }

        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}