package com.javascript.jscript.Programs;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.CodesActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityProgramsCodeBinding;

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
        AdView bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
        } else {
            bannerAd.setVisibility(View.GONE);
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
            case "":
                codes = ProgramsCodes.codes;
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
            case "":
                outputs = ProgramsOutputs.outputs;
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