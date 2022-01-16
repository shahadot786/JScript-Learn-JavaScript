package com.javascript.jscript.Interview;

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
import com.javascript.jscript.Activities.EditProfileActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityInterviewAnswerBinding;

import java.util.Objects;

public class InterviewAnswerActivity extends AppCompatActivity {
    ActivityInterviewAnswerBinding binding;
    FirebaseDatabase database;
    FirebaseAuth auth;
    TextView textQuestion, questionDes;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInterviewAnswerBinding.inflate(getLayoutInflater());
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
        InterviewAnswerActivity.this.setTitle("Answer");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //find text view id
        textQuestion = findViewById(R.id.textQuestion);
        questionDes = findViewById(R.id.questionDes);

        loadQuestion();
        loadAnswer();

        //progress codes
        binding.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.finish.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorSecondary)));
                binding.finish.setTextColor(getResources().getColor(R.color.textColorGrey));
                //send progress value
                database.getReference()
                        .child("Progress")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                        .child("interviewCount")
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                int interviewCount = 0;
                                if (snapshot.exists()) {
                                    interviewCount = snapshot.getValue(Integer.class);
                                }
                                database.getReference()
                                        .child("Progress")
                                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                        .child("interviewCount")
                                        .setValue(interviewCount + 1)
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
    private void loadQuestion() {
        String question = null;
        switch (getIntent().getStringExtra("Interview Questions")) {
            case "What is JavaScript?":
                question = InterviewQuestions.What_is_JavaScript;
                break;
            case "What are JavaScript Data Types?":
                question = InterviewQuestions.WhatareJavaScriptDataTypes;
                break;
            case "What is the real name of JavaScript?":
                question = InterviewQuestions.WhatistherealnameofJavaScript;
                break;
            case "Enumerate the differences between Java and JavaScript?":
                question = InterviewQuestions.EnumeratethedifferencesbetweenjavaandJavaScript;
                break;
            case "What is the use of isNaN function?":
                question = InterviewQuestions.WhatistheuseofisNaNfunction;
                break;
            case "Which is faster between JavaScript and an ASP script?":
                question = InterviewQuestions.WhichisfasterbetweenjavaScriptandanASP;
                break;
            case "What is negative Infinity?":
                question = InterviewQuestions.WhatisnegativeInfinity;
                break;
            case "Is it possible to break JavaScript Code into several lines?":
                question = InterviewQuestions.IsitpossibletobreakJavaScriptCode;
                break;
            case "Which company developed JavaScript?":
                question = InterviewQuestions.WhichcompanydevelopedJavaScript;
                break;
            case "What are undeclared and undefined variables?":
                question = InterviewQuestions.Whatareundeclaredandundefinedvariables;
                break;
            case "Write the code for adding new elements dynamically?":
                question = InterviewQuestions.Writethecodeforaddingnewelementsdynamically;
                break;
            case "What are global variables? How are these variable declared?":
                question = InterviewQuestions.WhatareglobalvariablesHowarethesevariabledeclared;
                break;
            case "What is a prompt box?":
                question = InterviewQuestions.Whatisapromptbox;
                break;
            case "What is ‘this’ keyword in JavaScript?":
                question = InterviewQuestions.WhatisthiskeywordinJavaScript;
                break;
            case "What is the working of timers in JavaScript?":
                question = InterviewQuestions.WhatistheworkingoftimersinJavaScript;
                break;
            case "Which symbol is used for comments in Javascript?":
                question = InterviewQuestions.WhichsymbolisusedforcommentsinJavascript;
                break;
            case "What is the difference between ViewState and SessionState?":
                question = InterviewQuestions.WhatisthedifferencebetweenViewStateandSessionState;
                break;
            case "What is === operator?":
                question = InterviewQuestions.Whatisoperator;
                break;
            case "How can the style/class of an element be changed?":
                question = InterviewQuestions.Howcanthestyleclassofanelementbechanged;
                break;
            case "What are all the looping structures in JavaScript?":
                question = InterviewQuestions.WhatarealltheloopingstructuresinjavaScript;
                break;
            case "What is called Variable typing in Javascript?":
                question = InterviewQuestions.WhatiscalledVariabletypinginJavascript;
                break;
            case "What would be the result of 3+2+”7″?":
                question = InterviewQuestions.Whatwouldbetheresultof;
                break;
            case "What is the function of the delete operator?":
                question = InterviewQuestions.Whatisthefunctionofthedeleteoperator;
                break;
            case "What is an undefined value in JavaScript?":
                question = InterviewQuestions.WhatisanundefinedvalueinJavaScript;
                break;
            case "What are all the types of Pop up boxes available in JavaScript?":
                question = InterviewQuestions.WhatareallthetypesofPopupboxes;
                break;
            case "What is the data type of variables in JavaScript?":
                question = InterviewQuestions.WhatisthedatatypeofvariablesinJavaScript;
                break;
            case "What is break and continue statements?":
                question = InterviewQuestions.Whatisbreakandcontinuestatements;
                break;
            case "What are the two basic groups of data types in JavaScript?":
                question = InterviewQuestions.Whatarethetwobasicgroupsofdatatypes;
                break;
            case "What is the use of a type of operator?":
                question = InterviewQuestions.Whatistheuseofatypeofoperator;
                break;
            case "Which keyword is used to print the text on the screen?":
                question = InterviewQuestions.Whichkeywordisusedtoprintthtextonthescreen;
                break;
            case "What is variable typing?":
                question = InterviewQuestions.Whatisvariabletyping;
                break;
            case "What is the difference between JavaScript and Jscript?":
                question = InterviewQuestions.WhatisthedifferencebetweenJavaScriptandJscript;
                break;
            case "What is the way to get the status of a CheckBox?":
                question = InterviewQuestions.WhatisthewaytogetthestatusofaCheckBox;
                break;
            case "What is for-in loop in Javascript?":
                question = InterviewQuestions.WhatisforinloopinJavascript;
                break;
            case "Explain Popup Message using event with example":
                question = InterviewQuestions.ExplainPopupMessageusingeventwithexample;
                break;
            case "Define anonymous function":
                question = InterviewQuestions.Defineanonymousfunction;
                break;
            case "How you can submit a form using JavaScript?":
                question = InterviewQuestions.HowyoucansubmitaformusingJavaScript;
                break;
            case "Does JavaScript support automatic type conversion?":
                question = InterviewQuestions.DoesJavaScriptsupportautomatictypeconversion;
                break;
            case "How to read and write a file using JavaScript?":
                question = InterviewQuestions.HowtoreadandwriteafileusingJavaScript;
                break;
            case "How can you convert the string of any base to an integer in JavaScript?":
                question = InterviewQuestions.HowcanyouconvertthestringofanybasetoanintegerinJavaScript;
                break;
            case "Difference between “==” and “===”?":
                question = InterviewQuestions.question40;
                break;
            case "How to detect the operating system on the client machine?":
                question = InterviewQuestions.question41;
                break;
            case "What do you mean by NULL in Javascript?":
                question = InterviewQuestions.question42;
                break;
            case "What is the use of Void (0)?":
                question = InterviewQuestions.question43;
                break;
            case "How can a page be forced to load another page in JavaScript?":
                question = InterviewQuestions.question44;
                break;
            case "What is the difference between an alert box and a confirmation box?":
                question = InterviewQuestions.question45;
                break;
            case "What are escape characters?":
                question = InterviewQuestions.question46;
                break;
            case "What are JavaScript Cookies?":
                question = InterviewQuestions.question47;
                break;
            case "What a pop()method in JavaScript is?":
                question = InterviewQuestions.question48;
                break;
            case "Does JavaScript has concept level scope?":
                question = InterviewQuestions.question49;
                break;
            case "What are the disadvantages of using innerHTML in JavaScript?":
                question = InterviewQuestions.question50;
                break;
            case "How can generic objects be created?":
                question = InterviewQuestions.question51;
                break;
            case "Which keywords are used to handle exceptions?":
                question = InterviewQuestions.question52;
                break;
            case "What is the use of the blur function?":
                question = InterviewQuestions.question53;
                break;
            case "How to find an operating system in the client machine using JavaScript?":
                question = InterviewQuestions.question54;
                break;
            case "What are the different types of errors in JavaScript?":
                question = InterviewQuestions.question55;
                break;
            case "What is the use of the Push method in JavaScript?":
                question = InterviewQuestions.question56;
                break;
            case "What is the unshift method in JavaScript?":
                question = InterviewQuestions.question57;
                break;
            case "What is the ‘Strict Mode in JavaScript, and how can it be enabled?":
                question = InterviewQuestions.question58;
                break;
            case "How closures work in JavaScript?":
                question = InterviewQuestions.question59;
                break;
            case "How can a value be appended to an array?":
                question = InterviewQuestions.question60;
                break;
            case "What are the important properties of an anonymous function in JavaScript?":
                question = InterviewQuestions.question61;
                break;
            case "What is the difference between .call() and .apply()?":
                question = InterviewQuestions.question62;
                break;
            case "What is event bubbling?":
                question = InterviewQuestions.question63;
                break;
            case "How can a particular frame be targeted, from a hyperlink, in JavaScript?":
                question = InterviewQuestions.question64;
                break;
            case "Why you should not use innerHTML in JavaScript?":
                question = InterviewQuestions.question65;
                break;
            case "What is namespacing in JavaScript, and how is it used?":
                question = InterviewQuestions.question66;
                break;
            case "How can JavaScript codes be hidden from old browsers that do not support JavaScript?":
                question = InterviewQuestions.question67;
                break;
            case "Give an example of JavaScript Multiplication Table":
                question = InterviewQuestions.question68;
                break;
            case "How are object properties assigned?":
                question = InterviewQuestions.question69;
                break;
            case "How to create objects in JavaScript?":
                question = InterviewQuestions.question70;
                break;
            case "What is the method for reading and writing a file in JavaScript?":
                question = InterviewQuestions.question71;
                break;
            case "What are Screen objects?":
                question = InterviewQuestions.question72;
                break;
            case "What is the unshift() method?":
                question = InterviewQuestions.question73;
                break;
            case "What are the important JavaScript Array Method explain with example?":
                question = InterviewQuestions.question74;
                break;
            case "What is Loop Though the Properties of an Object?":
                question = InterviewQuestions.question75;
                break;
            case "In JavaScript what is an argument object?":
                question = InterviewQuestions.question76;
                break;
            case "If we want to return the character from a specific index which method is used?":
                question = InterviewQuestions.question77;
                break;
            case "What is the use of window object?":
                question = InterviewQuestions.question78;
                break;
            case "What is the use of history object?":
                question = InterviewQuestions.question79;
                break;
            case "How to set the cursor to wait in JavaScript?":
                question = InterviewQuestions.question80;
                break;
            case "What is this [[[]]]?":
                question = InterviewQuestions.question81;
                break;
            case "What is the use of Math object in JavaScript?":
                question = InterviewQuestions.question82;
                break;
            case "What is the use of a Date object in JavaScript?":
                question = InterviewQuestions.question83;
                break;
            case "What is the use of a Number object in JavaScript?":
                question = InterviewQuestions.question84;
                break;
            case "What is the use of a Boolean object in JavaScript?":
                question = InterviewQuestions.question85;
                break;
            case "What is the use of a TypedArray object in JavaScript?":
                question = InterviewQuestions.question86;
                break;
            case "What is the use of a Set object in JavaScript?":
                question = InterviewQuestions.question87;
                break;
            case "What is the use of a WeakSet object in JavaScript?":
                question = InterviewQuestions.question88;
                break;
            case "What is the use of a Map object in JavaScript?":
                question = InterviewQuestions.question89;
                break;
            case "What is the use of a WeakMap object in JavaScript?":
                question = InterviewQuestions.question90;
                break;
            case "What is OOPS Concept in JavaScript?":
                question = InterviewQuestions.question91;
                break;
            case "How are event handlers utilized in JavaScript?":
                question = InterviewQuestions.question92;
                break;
            case "What is the role of deferred scripts in JavaScript?":
                question = InterviewQuestions.question93;
                break;
            case "What are the various functional components in JavaScript?":
                question = InterviewQuestions.question94;
                break;
            case "Write about the errors shown in JavaScript?":
                question = InterviewQuestions.question95;
                break;
            case "What is unescape() and escape() functions?":
                question = InterviewQuestions.question96;
                break;
            case "What are the decodeURI() and encodeURI()?":
                question = InterviewQuestions.question97;
                break;
            case "What is JavaScript Unit Testing, and what are the challenges in JavaScript Unit Testing?":
                question = InterviewQuestions.question98;
                break;
            case "What are some important JavaScript Unit Testing Frameworks?":
                question = InterviewQuestions.question99;
                break;
            case "What is QuickSort Algorithm in JavaScript?":
                question = InterviewQuestions.question100;
                break;
            case "How does QuickSort Work?":
                question = InterviewQuestions.question101;
                break;
            case "Difference between Client side JavaScript and Server side JavaScript?":
                question = InterviewQuestions.question102;
                break;
            case "In which location cookies are stored on the hard disk?":
                question = InterviewQuestions.question103;
                break;
            case "What is the requirement of debugging in JavaScript?":
                question = InterviewQuestions.question104;
                break;
            case "What is the use of debugger keyword in JavaScript?":
                question = InterviewQuestions.question105;
                break;
            case "How do you define a class and its constructor?":
                question = InterviewQuestions.question106;
                break;
            case "What is function overloading in JavaScript?":
                question = InterviewQuestions.question107;
                break;
            case "What is  associative arrays in JavaScript?":
                question = InterviewQuestions.question108;
                break;
            case "Why \"self\" is needed instead of \"this\" in JavaScript?":
                question = InterviewQuestions.question109;
                break;
            case "Understanding JavaScript Inheritance with Example":
                question = InterviewQuestions.question110;
                break;
            case "Why asynchronous code is important in JavaScript?":
                question = InterviewQuestions.question111;
                break;
            case "How to empty an array in JavaScript?":
                question = InterviewQuestions.question112;
                break;
            case "What is the difference between let, var, and const?":
                question = InterviewQuestions.question113;
                break;
            case "Is it possible to use JavaScript to change the meta-tags of the page?":
                question = InterviewQuestions.question114;
                break;
            case "How To modify the URL of page without reloading the page?":
                question = InterviewQuestions.question115;
                break;
            case "Name two ways two change the context of a JavaScript method?":
                question = InterviewQuestions.question116;
                break;
            case "How are DOM utilized in JavaScript?":
                question = InterviewQuestions.question117;
                break;
            case "What is DOM in JavaScript?":
                question = InterviewQuestions.question118;
                break;
            case "How to use DOM and Events?":
                question = InterviewQuestions.question119;
                break;
            case "What is External JavaScript?":
                question = InterviewQuestions.question120;
                break;
            case "When to Use Internal and External JavaScript Code?":
                question = InterviewQuestions.question121;
                break;
            case "Is there any difference between window and document?":
                question = InterviewQuestions.question122;
                break;
            case "Does document.onload and window.onload fire at the same time?":
                question = InterviewQuestions.question123;
                break;
            case "Is attribute similar to property?":
                question = InterviewQuestions.question124;
                break;
            case "What are the different ways to get an element from DOM?":
                question = InterviewQuestions.question125;
                break;
            case "What is the fastest way to select elements by using css selectors?":
                question = InterviewQuestions.question126;
                break;
            case "How come, I can't use forEach or similar array methods on a NodeList?":
                question = InterviewQuestions.question127;
                break;
            case "If you need to implement getElementByAttribute, how would you implement it?":
                question = InterviewQuestions.question128;
                break;
            case "How would you add a class to an element by query selector?":
                question = InterviewQuestions.question129;
                break;
            case "How could I verify whether one element is child of another?":
                question = InterviewQuestions.question130;
                break;
            case "What is the best way to create a DOM element? Set innherHTML or use createElement?":
                question = InterviewQuestions.question131;
                break;
            case "What is createDocumentFragment and why you might use it?":
                question = InterviewQuestions.question132;
                break;
            case "What is reflow? What causes reflow? How could you reduce reflow?":
                question = InterviewQuestions.question133;
                break;
            case "What is repaint and when does this happen?":
                question = InterviewQuestions.question134;
                break;
            case "How could you make sure to run some javaScript when DOM is ready like $(document).ready?":
                question = InterviewQuestions.question135;
                break;
            case "How would you destroy multiple list items with one click handler?":
                question = InterviewQuestions.question136;
                break;
            case "Create a button that is destroyed by clicking on it but two new buttons are created in it's place.":
                question = InterviewQuestions.question137;
                break;
            case "How could you capture all clicks in a page?":
                question = InterviewQuestions.question138;
                break;
            case "How can you get all the texts in a web page?":
                question = InterviewQuestions.question139;
                break;
            case "What is BOM?":
                question = InterviewQuestions.question140;
                break;
            case "Which is the root element of Bom?":
                question = InterviewQuestions.question141;
                break;
            case "Which object is the top object in BOM?":
                question = InterviewQuestions.question142;
                break;
            case "Why window object is used on BOM?":
                question = InterviewQuestions.question143;
                break;
            case "What is full form of Bom?":
                question = InterviewQuestions.question144;
                break;
            case "Which object is the most important object in the BOM model?":
                question = InterviewQuestions.question145;
                break;
            case "Which object is at the top of the hierarchy in document object model?\n":
                question = InterviewQuestions.question146;
                break;
            case "What is the window object?":
                question = InterviewQuestions.question147;
                break;
            case "How to get web browser window size?":
                question = InterviewQuestions.question148;
                break;
            case "How to detect web browser information?":
                question = InterviewQuestions.question149;
                break;
            case "What is IIFEs (Immediately Invoked Function Expressions)?":
                question = InterviewQuestions.question150;
                break;
            case "Explain the difference between Object.freeze() vs const":
                question = InterviewQuestions.question151;
                break;
            case "What is generator in JS?":
                question = InterviewQuestions.question152;
                break;
            case "When should we use generators in ES6?":
                question = InterviewQuestions.question153;
                break;
            case "What will be the output of the following code?":
                question = InterviewQuestions.question154;
                break;
            case "Explain the Prototype Design Pattern":
                question = InterviewQuestions.question155;
                break;
            case "What is the Temporal Dead Zone in ES6?":
                question = InterviewQuestions.question156;
                break;
            case "Can you describe the main difference between a .forEach loop and a .map() loop and why you would pick one versus the other?":
                question = InterviewQuestions.question157;
                break;
            case "Describe the Revealing Module Pattern design pattern":
                question = InterviewQuestions.question158;
                break;
            case "What is Ajax?":
                question = InterviewQuestions.question159;
                break;
            case "What are Ajax applications?":
                question = InterviewQuestions.question160;
                break;
            case "How many types of triggers are present in update panel?":
                question = InterviewQuestions.question161;
                break;
            case "What are all the controls of Ajax?":
                question = InterviewQuestions.question162;
                break;
            case "What is the name of the DLL that contains Ajax control tool kit?":
                question = InterviewQuestions.question163;
                break;
            case "What role of #&& in querystring?":
                question = InterviewQuestions.question164;
                break;
            case "How to control the duration of an Ajax request?":
                question = InterviewQuestions.question165;
                break;
            case "What are the advantages of Ajax?":
                question = InterviewQuestions.question166;
                break;
            case "What are the disadvantages of Ajax?":
                question = InterviewQuestions.question167;
                break;
            case "What is update panel?":
                question = InterviewQuestions.question168;
                break;
            case "Which are the two methods used for cross domain Ajax calls?":
                question = InterviewQuestions.question169;
                break;
            case "What are all the technologies used by Ajax?":
                question = InterviewQuestions.question170;
                break;
            case "What are all the features of Ajax?":
                question = InterviewQuestions.question171;
                break;
            case "What is JSON in Ajax?":
                question = InterviewQuestions.question172;
                break;
            case "What are the components of the ASP.NET AJAX architecture?":
                question = InterviewQuestions.question173;
                break;
            case "What is AJAX Control Extender Toolkit?":
                question = InterviewQuestions.question174;
                break;
            case "Where AJAX cannot be used?":
                question = InterviewQuestions.question175;
                break;
            case "What are the pre-requisites to execute AJAX applications on a server?":
                question = InterviewQuestions.question176;
                break;
            case "What is AJAX Framework?":
                question = InterviewQuestions.question177;
                break;
            case "Does Ajax work with another language?":
                question = InterviewQuestions.question178;
                break;
            case "What is an asynchronous request in AJAX?":
                question = InterviewQuestions.question179;
                break;
            case "What is a synchronous request in AJAX?":
                question = InterviewQuestions.question180;
                break;
            case "Did adaptive path invent Ajax? Did Google? Did adaptive path help build Google’s Ajax Applications?":
                question = InterviewQuestions.question181;
                break;
            case "What do you need to know to create my own Ajax Functionality?":
                question = InterviewQuestions.question182;
                break;
            case "Should I use Xml or Text, Javascript, or Html as a Return Type?":
                question = InterviewQuestions.question183;
                break;
            case "Are there usability issues with Ajax?":
                question = InterviewQuestions.question184;
                break;
            case "Should I use an Http get or Post for my Ajax Calls?":
                question = InterviewQuestions.question185;
                break;
            case "How do we Debug Javascript?":
                question = InterviewQuestions.question186;
                break;
            case "How do I provide Internationalized Ajax Interactions?":
                question = InterviewQuestions.question187;
                break;
            case "What is TypeScript?":
                question = InterviewQuestions.question188;
                break;
            case "What are the Differences between TypeScript and JavaScript?":
                question = InterviewQuestions.question189;
                break;
            case "Why do we need TypeScript?":
                question = InterviewQuestions.question190;
                break;
            case "Mention some of the features of TypeScript":
                question = InterviewQuestions.question191;
                break;
            case "What are the Benefits of using TypeScript?":
                question = InterviewQuestions.question192;
                break;
            case "What are the Disadvantages of TypeScript?":
                question = InterviewQuestions.question193;
                break;
            case "What are the Components of TypeScript?":
                question = InterviewQuestions.question194;
                break;
            case "Who developed Typescript and what is the current stable version available?":
                question = InterviewQuestions.question195;
                break;
            case "How to install TypeScript?":
                question = InterviewQuestions.question196;
                break;
            case "How do you compile TypeScript files?":
                question = InterviewQuestions.question197;
                break;
            case "Can we combine multiple .ts files into a single .js file?":
                question = InterviewQuestions.question198;
                break;
            case "What are the different types of TypeScript?":
                question = InterviewQuestions.question199;
                break;
            case "List out the built-in data types in TypeScript.":
                question = InterviewQuestions.question200;
                break;
            case "What are Variables in TypeScript and how to create them?":
                question = InterviewQuestions.question201;
                break;
            case "What are the object-oriented terms supported by TypeScript?":
                question = InterviewQuestions.question202;
                break;
            case "What are Interfaces in TypeScript?":
                question = InterviewQuestions.question203;
                break;
            case "What are Classes in TypeScript? List out some of the features.":
                question = InterviewQuestions.question204;
                break;
            case "What are the access modifiers supported by TypeScript?":
                question = InterviewQuestions.question205;
                break;
            case "How is TypeScript an optionally statically typed language?":
                question = InterviewQuestions.question206;
                break;
            case "What are modules in TypeScript?":
                question = InterviewQuestions.question207;
                break;
            case "What is namespace in Typescript and how to declare it?":
                question = InterviewQuestions.question208;
                break;
            case "Does TypeScript support function overloading?":
                question = InterviewQuestions.question209;
                break;
            case "Explain Decorators in TypeScript.":
                question = InterviewQuestions.question210;
                break;
            case "What are Mixins?":
                question = InterviewQuestions.question211;
                break;
            case "How does TypeScript support optional parameters in function?":
                question = InterviewQuestions.question212;
                break;
            case "What is Scope variable?":
                question = InterviewQuestions.question213;
                break;
            case "What is TypeScript Definition Manager and why do we need it?":
                question = InterviewQuestions.question214;
                break;
            case "What is TypeScript Declare Keyword?":
                question = InterviewQuestions.question215;
                break;
            case "What is the Default Parameters Function in TypeScript?":
                question = InterviewQuestions.question216;
                break;
            case "What is tsconfig.json file?":
                question = InterviewQuestions.question217;
                break;
            case "What are Generics in TypeScript?":
                question = InterviewQuestions.question218;
                break;
            case "What is JSX in TypeScript?":
                question = InterviewQuestions.question219;
                break;
            case "What are all the JSX modes TypeScript supports?":
                question = InterviewQuestions.question220;
                break;
            case "What are Ambients in TypeScripts and when to use them?":
                question = InterviewQuestions.question221;
                break;
            case "What is a TypeScript Map file?":
                question = InterviewQuestions.question222;
                break;
            case "What is Type assertions in TypeScript?":
                question = InterviewQuestions.question223;
                break;
            case "Explain Enum in TypeScript.":
                question = InterviewQuestions.question224;
                break;
            case "What is method overriding in TypeScript?":
                question = InterviewQuestions.question225;
                break;
            case "What is Lambda/Arrow function?":
                question = InterviewQuestions.question226;
                break;
            case "What is Angular? Why was it introduced?":
                question = InterviewQuestions.question227;
                break;
            case "What is data binding? Which type of data binding does Angular deploy?":
                question = InterviewQuestions.question228;
                break;
            case "What are Single Page Applications (SPA)?":
                question = InterviewQuestions.question229;
                break;
            case "What are decorators in Angular?":
                question = InterviewQuestions.question230;
                break;
            case "Mention some advantages of Angular.":
                question = InterviewQuestions.question231;
                break;
            case "What are the new updates with Angular10?":
                question = InterviewQuestions.question232;
                break;
            case "What are Templates in Angular?":
                question = InterviewQuestions.question233;
                break;
            case "What are Annotations in Angular?":
                question = InterviewQuestions.question234;
                break;
            case "What are Directives in Angular?":
                question = InterviewQuestions.question235;
                break;
            case "What is an AOT compilation? What are its advantages?":
                question = InterviewQuestions.question236;
                break;
            case "What are Components in Angular?":
                question = InterviewQuestions.question237;
                break;
            case "What are Pipes in Angular?":
                question = InterviewQuestions.question238;
                break;
            case "What is an ngModule?":
                question = InterviewQuestions.question239;
                break;
            case "What are filters in Angular? Name a few of them.":
                question = InterviewQuestions.question240;
                break;
            case "What is view encapsulation in Angular?":
                question = InterviewQuestions.question241;
                break;
            case "What are controllers?":
                question = InterviewQuestions.question242;
                break;
            case "Explain the lifecycle hooks in Angular":
                question = InterviewQuestions.question243;
                break;
            case "What is String Interpolation in Angular?":
                question = InterviewQuestions.question244;
                break;
            case "What is the difference between AOT and JIT?":
                question = InterviewQuestions.question245;
                break;
            case "Explain the @Component Decorator.":
                question = InterviewQuestions.question246;
                break;
            case "What are Services in Angular?":
                question = InterviewQuestions.question247;
                break;
            case "What are Promises and Observables in Angular?":
                question = InterviewQuestions.question248;
                break;
            case "What are Template and Reactive forms?":
                question = InterviewQuestions.question249;
                break;
            case "What is Bootstrap? How is it embedded into Angular?":
                question = InterviewQuestions.question250;
                break;
            case "What type of DOM does Angular implement?":
                question = InterviewQuestions.question251;
                break;
            case "What is Vue.js?":
                question = InterviewQuestions.question252;
                break;
            case "List some features of Vue.js?":
                question = InterviewQuestions.question253;
                break;
            case "Explain Life cycle of Vue Instance?":
                question = InterviewQuestions.question254;
                break;
            case "How to create an instance of Vue js?":
                question = InterviewQuestions.question255;
                break;
            case "Explain the differences between one-way data flow and two-way data binding?":
                question = InterviewQuestions.question256;
                break;
            case "How to create Two-Way Bindings in Vue.js?":
                question = InterviewQuestions.question257;
                break;
            case "What are filters in VUE.js?":
                question = InterviewQuestions.question258;
                break;
            case "How to create a custom filter in Vue.js?":
                question = InterviewQuestions.question259;
                break;
            case "What are Components in Vue.js? How to register a component inside other component?":
                question = InterviewQuestions.question260;
                break;
            case "What are Directives in VUE.js, List some of them you used?":
                question = InterviewQuestions.question261;
                break;
            case "List type of Directive are available in Vue.js?":
                question = InterviewQuestions.question262;
                break;
            case "What is VUE-resource, how can you install Vue Resource?":
                question = InterviewQuestions.question263;
                break;
            case "How to create Constants in Vue.js?":
                question = InterviewQuestions.question264;
                break;
            case "What is virtual dom in Vue.js?":
                question = InterviewQuestions.question265;
                break;
            case "Why we need Vue.js mixins?":
                question = InterviewQuestions.question266;
                break;
            case "What is Vuex?":
                question = InterviewQuestions.question267;
                break;
            case "What are filters in Vue.js?":
                question = InterviewQuestions.question268;
                break;
            case "How to create a component in Vue.js?":
                question = InterviewQuestions.question269;
                break;
            case "How to import js file in the Vue component?":
                question = InterviewQuestions.question270;
                break;
            case "How to call rest API from Vue js?":
                question = InterviewQuestions.question271;
                break;
            case "What is Next.js?":
                question = InterviewQuestions.question272;
                break;
            case "Why is Next.js used for? / Why do world's leading companies prefer Next.js?":
                question = InterviewQuestions.question273;
                break;
            case "What is the process to install Next.js? / How to install Next.js?":
                question = InterviewQuestions.question274;
                break;
            case "What are the most prominent features of Next.js?":
                question = InterviewQuestions.question275;
                break;
            case "Which types of websites most popularly use Next.js?":
                question = InterviewQuestions.question276;
                break;
            case "Is it possible to use Next.js with Redux?":
                question = InterviewQuestions.question277;
                break;
            case "What is the recommended method to fetch data in Next.js?":
                question = InterviewQuestions.question278;
                break;
            case "Give an example to demonstrate how do you set up CDN in Next.js?":
                question = InterviewQuestions.question279;
                break;
            case "Are Create-React-App and Next.js used for the same thing?":
                question = InterviewQuestions.question280;
                break;
            case "How can you disable the etag generation in Next.js?":
                question = InterviewQuestions.question281;
                break;
            case "How can you configure the build-id in Next.js?":
                question = InterviewQuestions.question282;
                break;
            case "How can you create a page directory inside your project?":
                question = InterviewQuestions.question283;
                break;
            case "Give an example to demonstrate how to create a custom error page in Next.js?":
                question = InterviewQuestions.question284;
                break;
            case "What do you understand by code splitting in Next.js?":
                question = InterviewQuestions.question285;
                break;
            case "How can you enable AMP in Next.js?":
                question = InterviewQuestions.question286;
                break;
            case "Is it possible to host Next.js in a web server like Nginx?":
                question = InterviewQuestions.question287;
                break;
            case "Next.js vs gatsby?":
                question = InterviewQuestions.question288;
                break;
            case "":
                question = InterviewQuestions.question;
                break;

        }
        textQuestion.setText(question);

    }

    //load output
    private void loadAnswer() {
        String answer = null;
        switch (getIntent().getStringExtra("Interview Answers")) {
            case "What is JavaScript?":
                answer = InterviewAnswers.What_is_JavaScript;
                break;
            case "What are JavaScript Data Types?":
                answer = InterviewAnswers.WhatareJavaScriptDataTypes;
                break;
            case "What is the real name of JavaScript?":
                answer = InterviewAnswers.WhatistherealnameofJavaScript;
                break;
            case "Enumerate the differences between Java and JavaScript?":
                answer = InterviewAnswers.EnumeratethedifferencesbetweenjavaandJavaScript;
                break;
            case "What is the use of isNaN function?":
                answer = InterviewAnswers.WhatistheuseofisNaNfunction;
                break;
            case "Which is faster between JavaScript and an ASP script?":
                answer = InterviewAnswers.WhichisfasterbetweenjavaScriptandanASP;
                break;
            case "What is negative Infinity?":
                answer = InterviewAnswers.WhatisnegativeInfinity;
                break;
            case "Is it possible to break JavaScript Code into several lines?":
                answer = InterviewAnswers.IsitpossibletobreakJavaScriptCode;
                break;
            case "Which company developed JavaScript?":
                answer = InterviewAnswers.WhichcompanydevelopedJavaScript;
                break;
            case "What are undeclared and undefined variables?":
                answer = InterviewAnswers.Whatareundeclaredandundefinedvariables;
                break;
            case "Write the code for adding new elements dynamically?":
                answer = InterviewAnswers.Writethecodeforaddingnewelementsdynamically;
                break;
            case "What are global variables? How are these variable declared?":
                answer = InterviewAnswers.WhatareglobalvariablesHowarethesevariabledeclared;
                break;
            case "What is a prompt box?":
                answer = InterviewAnswers.Whatisapromptbox;
                break;
            case "What is ‘this’ keyword in JavaScript?":
                answer = InterviewAnswers.WhatisthiskeywordinJavaScript;
                break;
            case "What is the working of timers in JavaScript?":
                answer = InterviewAnswers.WhatistheworkingoftimersinJavaScript;
                break;
            case "Which symbol is used for comments in Javascript?":
                answer = InterviewAnswers.WhichsymbolisusedforcommentsinJavascript;
                break;
            case "What is the difference between ViewState and SessionState?":
                answer = InterviewAnswers.WhatisthedifferencebetweenViewStateandSessionState;
                break;
            case "What is === operator?":
                answer = InterviewAnswers.Whatisoperator;
                break;
            case "How can the style/class of an element be changed?":
                answer = InterviewAnswers.Howcanthestyleclassofanelementbechanged;
                break;
            case "What are all the looping structures in JavaScript?":
                answer = InterviewAnswers.WhatarealltheloopingstructuresinjavaScript;
                break;
            case "What is called Variable typing in Javascript?":
                answer = InterviewAnswers.WhatiscalledVariabletypinginJavascript;
                break;
            case "What would be the result of 3+2+”7″?":
                answer = InterviewAnswers.Whatwouldbetheresultof;
                break;
            case "What is the function of the delete operator?":
                answer = InterviewAnswers.Whatisthefunctionofthedeleteoperator;
                break;
            case "What is an undefined value in JavaScript?":
                answer = InterviewAnswers.WhatisanundefinedvalueinJavaScript;
                break;
            case "What are all the types of Pop up boxes available in JavaScript?":
                answer = InterviewAnswers.WhatareallthetypesofPopupboxes;
                break;
            case "What is the data type of variables in JavaScript?":
                answer = InterviewAnswers.WhatisthedatatypeofvariablesinJavaScript;
                break;
            case "What is break and continue statements?":
                answer = InterviewAnswers.Whatisbreakandcontinuestatements;
                break;
            case "What are the two basic groups of data types in JavaScript?":
                answer = InterviewAnswers.Whatarethetwobasicgroupsofdatatypes;
                break;
            case "What is the use of a type of operator?":
                answer = InterviewAnswers.Whatistheuseofatypeofoperator;
                break;
            case "Which keyword is used to print the text on the screen?":
                answer = InterviewAnswers.Whichkeywordisusedtoprintthtextonthescreen;
                break;
            case "What is variable typing?":
                answer = InterviewAnswers.Whatisvariabletyping;
                break;
            case "What is the difference between JavaScript and Jscript?":
                answer = InterviewAnswers.WhatisthedifferencebetweenJavaScriptandJscript;
                break;
            case "What is the way to get the status of a CheckBox?":
                answer = InterviewAnswers.WhatisthewaytogetthestatusofaCheckBox;
                break;
            case "What is for-in loop in Javascript?":
                answer = InterviewAnswers.WhatisforinloopinJavascript;
                break;
            case "Explain Popup Message using event with example":
                answer = InterviewAnswers.ExplainPopupMessageusingeventwithexample;
                break;
            case "Define anonymous function":
                answer = InterviewAnswers.Defineanonymousfunction;
                break;
            case "How you can submit a form using JavaScript?":
                answer = InterviewAnswers.HowyoucansubmitaformusingJavaScript;
                break;
            case "Does JavaScript support automatic type conversion?":
                answer = InterviewAnswers.DoesJavaScriptsupportautomatictypeconversion;
                break;
            case "How to read and write a file using JavaScript?":
                answer = InterviewAnswers.HowtoreadandwriteafileusingJavaScript;
                break;
            case "How can you convert the string of any base to an integer in JavaScript?":
                answer = InterviewAnswers.HowcanyouconvertthestringofanybasetoanintegerinJavaScript;
                break;
            case "Difference between “==” and “===”?":
                answer = InterviewAnswers.answer40;
                break;
            case "How to detect the operating system on the client machine?":
                answer = InterviewAnswers.answer41;
                break;
            case "What do you mean by NULL in Javascript?":
                answer = InterviewAnswers.answer42;
                break;
            case "What is the use of Void (0)?":
                answer = InterviewAnswers.answer43;
                break;
            case "How can a page be forced to load another page in JavaScript?":
                answer = InterviewAnswers.answer44;
                break;
            case "What is the difference between an alert box and a confirmation box?":
                answer = InterviewAnswers.answer45;
                break;
            case "What are escape characters?":
                answer = InterviewAnswers.answer46;
                break;
            case "What are JavaScript Cookies?":
                answer = InterviewAnswers.answer47;
                break;
            case "What a pop()method in JavaScript is?":
                answer = InterviewAnswers.answer48;
                break;
            case "Does JavaScript has concept level scope?":
                answer = InterviewAnswers.answer49;
                break;
            case "What are the disadvantages of using innerHTML in JavaScript?":
                answer = InterviewAnswers.answer50;
                break;
            case "How can generic objects be created?":
                answer = InterviewAnswers.answer51;
                break;
            case "Which keywords are used to handle exceptions?":
                answer = InterviewAnswers.answer52;
                break;
            case "What is the use of the blur function?":
                answer = InterviewAnswers.answer53;
                break;
            case "How to find an operating system in the client machine using JavaScript?":
                answer = InterviewAnswers.answer54;
                break;
            case "What are the different types of errors in JavaScript?":
                answer = InterviewAnswers.answer55;
                break;
            case "What is the use of the Push method in JavaScript?":
                answer = InterviewAnswers.answer56;
                break;
            case "What is the unshift method in JavaScript?":
                answer = InterviewAnswers.answer57;
                break;
            case "What is the ‘Strict Mode in JavaScript, and how can it be enabled?":
                answer = InterviewAnswers.answer58;
                break;
            case "How closures work in JavaScript?":
                answer = InterviewAnswers.answer59;
                break;
            case "How can a value be appended to an array?":
                answer = InterviewAnswers.answer60;
                break;
            case "What are the important properties of an anonymous function in JavaScript?":
                answer = InterviewAnswers.answer61;
                break;
            case "What is the difference between .call() and .apply()?":
                answer = InterviewAnswers.answer62;
                break;
            case "What is event bubbling?":
                answer = InterviewAnswers.answer63;
                break;
            case "How can a particular frame be targeted, from a hyperlink, in JavaScript?":
                answer = InterviewAnswers.answer64;
                break;
            case "Why you should not use innerHTML in JavaScript?":
                answer = InterviewAnswers.answer65;
                break;
            case "What is namespacing in JavaScript, and how is it used?":
                answer = InterviewAnswers.answer66;
                break;
            case "How can JavaScript codes be hidden from old browsers that do not support JavaScript?":
                answer = InterviewAnswers.answer67;
                break;
            case "Give an example of JavaScript Multiplication Table":
                answer = InterviewAnswers.answer68;
                break;
            case "How are object properties assigned?":
                answer = InterviewAnswers.answer69;
                break;
            case "How to create objects in JavaScript?":
                answer = InterviewAnswers.answer70;
                break;
            case "What is the method for reading and writing a file in JavaScript?":
                answer = InterviewAnswers.answer71;
                break;
            case "What are Screen objects?":
                answer = InterviewAnswers.answer72;
                break;
            case "What is the unshift() method?":
                answer = InterviewAnswers.answer73;
                break;
            case "What are the important JavaScript Array Method explain with example?":
                answer = InterviewAnswers.answer74;
                break;
            case "What is Loop Though the Properties of an Object?":
                answer = InterviewAnswers.answer75;
                break;
            case "In JavaScript what is an argument object?":
                answer = InterviewAnswers.answer76;
                break;
            case "If we want to return the character from a specific index which method is used?":
                answer = InterviewAnswers.answer77;
                break;
            case "What is the use of window object?":
                answer = InterviewAnswers.answer78;
                break;
            case "What is the use of history object?":
                answer = InterviewAnswers.answer79;
                break;
            case "How to set the cursor to wait in JavaScript?":
                answer = InterviewAnswers.answer80;
                break;
            case "What is this [[[]]]?":
                answer = InterviewAnswers.answer81;
                break;
            case "What is the use of Math object in JavaScript?":
                answer = InterviewAnswers.answer82;
                break;
            case "What is the use of a Date object in JavaScript?":
                answer = InterviewAnswers.answer83;
                break;
            case "What is the use of a Number object in JavaScript?":
                answer = InterviewAnswers.answer84;
                break;
            case "What is the use of a Boolean object in JavaScript?":
                answer = InterviewAnswers.answer85;
                break;
            case "What is the use of a TypedArray object in JavaScript?":
                answer = InterviewAnswers.answer86;
                break;
            case "What is the use of a Set object in JavaScript?":
                answer = InterviewAnswers.answer87;
                break;
            case "What is the use of a WeakSet object in JavaScript?":
                answer = InterviewAnswers.answer88;
                break;
            case "What is the use of a Map object in JavaScript?":
                answer = InterviewAnswers.answer89;
                break;
            case "What is the use of a WeakMap object in JavaScript?":
                answer = InterviewAnswers.answer90;
                break;
            case "What is OOPS Concept in JavaScript?":
                answer = InterviewAnswers.answer91;
                break;
            case "How are event handlers utilized in JavaScript?":
                answer = InterviewAnswers.answer92;
                break;
            case "What is the role of deferred scripts in JavaScript?":
                answer = InterviewAnswers.answer93;
                break;
            case "What are the various functional components in JavaScript?":
                answer = InterviewAnswers.answer94;
                break;
            case "Write about the errors shown in JavaScript?":
                answer = InterviewAnswers.answer95;
                break;
            case "What is unescape() and escape() functions?":
                answer = InterviewAnswers.answer96;
                break;
            case "What are the decodeURI() and encodeURI()?":
                answer = InterviewAnswers.answer97;
                break;
            case "What is JavaScript Unit Testing, and what are the challenges in JavaScript Unit Testing?":
                answer = InterviewAnswers.answer98;
                break;
            case "What are some important JavaScript Unit Testing Frameworks?":
                answer = InterviewAnswers.answer99;
                break;
            case "What is QuickSort Algorithm in JavaScript?":
                answer = InterviewAnswers.answer100;
                break;
            case "How does QuickSort Work?":
                answer = InterviewAnswers.answer101;
                break;
            case "Difference between Client side JavaScript and Server side JavaScript?":
                answer = InterviewAnswers.answer102;
                break;
            case "In which location cookies are stored on the hard disk?":
                answer = InterviewAnswers.answer103;
                break;
            case "What is the requirement of debugging in JavaScript?":
                answer = InterviewAnswers.answer104;
                break;
            case "What is the use of debugger keyword in JavaScript?":
                answer = InterviewAnswers.answer105;
                break;
            case "How do you define a class and its constructor?":
                answer = InterviewAnswers.answer106;
                break;
            case "What is function overloading in JavaScript?":
                answer = InterviewAnswers.answer107;
                break;
            case "What is  associative arrays in JavaScript?":
                answer = InterviewAnswers.answer108;
                break;
            case "Why \"self\" is needed instead of \"this\" in JavaScript?":
                answer = InterviewAnswers.answer109;
                break;
            case "Understanding JavaScript Inheritance with Example":
                answer = InterviewAnswers.answer110;
                break;
            case "Why asynchronous code is important in JavaScript?":
                answer = InterviewAnswers.answer111;
                break;
            case "How to empty an array in JavaScript?":
                answer = InterviewAnswers.answer112;
                break;
            case "What is the difference between let, var, and const?":
                answer = InterviewAnswers.answer113;
                break;
            case "Is it possible to use JavaScript to change the meta-tags of the page?":
                answer = InterviewAnswers.answer114;
                break;
            case "How To modify the URL of page without reloading the page?":
                answer = InterviewAnswers.answer115;
                break;
            case "Name two ways two change the context of a JavaScript method?":
                answer = InterviewAnswers.answer116;
                break;
            case "How are DOM utilized in JavaScript?":
                answer = InterviewAnswers.answer117;
                break;
            case "What is DOM in JavaScript?":
                answer = InterviewAnswers.answer118;
                break;
            case "How to use DOM and Events?":
                answer = InterviewAnswers.answer119;
                break;
            case "What is External JavaScript?":
                answer = InterviewAnswers.answer120;
                break;
            case "When to Use Internal and External JavaScript Code?":
                answer = InterviewAnswers.answer121;
                break;
            case "Is there any difference between window and document?":
                answer = InterviewAnswers.answer122;
                break;
            case "Does document.onload and window.onload fire at the same time?":
                answer = InterviewAnswers.answer123;
                break;
            case "Is attribute similar to property?":
                answer = InterviewAnswers.answer124;
                break;
            case "What are the different ways to get an element from DOM?":
                answer = InterviewAnswers.answer125;
                break;
            case "What is the fastest way to select elements by using css selectors?":
                answer = InterviewAnswers.answer126;
                break;
            case "How come, I can't use forEach or similar array methods on a NodeList?":
                answer = InterviewAnswers.answer127;
                break;
            case "If you need to implement getElementByAttribute, how would you implement it?":
                answer = InterviewAnswers.answer128;
                break;
            case "How would you add a class to an element by query selector?":
                answer = InterviewAnswers.answer129;
                break;
            case "How could I verify whether one element is child of another?":
                answer = InterviewAnswers.answer130;
                break;
            case "What is the best way to create a DOM element? Set innherHTML or use createElement?":
                answer = InterviewAnswers.answer131;
                break;
            case "What is createDocumentFragment and why you might use it?":
                answer = InterviewAnswers.answer132;
                break;
            case "What is reflow? What causes reflow? How could you reduce reflow?":
                answer = InterviewAnswers.answer133;
                break;
            case "What is repaint and when does this happen?":
                answer = InterviewAnswers.answer134;
                break;
            case "How could you make sure to run some javaScript when DOM is ready like $(document).ready?":
                answer = InterviewAnswers.answer135;
                break;
            case "How would you destroy multiple list items with one click handler?":
                answer = InterviewAnswers.answer136;
                break;
            case "Create a button that is destroyed by clicking on it but two new buttons are created in it's place.":
                answer = InterviewAnswers.answer137;
                break;
            case "How could you capture all clicks in a page?":
                answer = InterviewAnswers.answer138;
                break;
            case "How can you get all the texts in a web page?":
                answer = InterviewAnswers.answer139;
                break;
            case "What is BOM?":
                answer = InterviewAnswers.answer140;
                break;
            case "Which is the root element of Bom?":
                answer = InterviewAnswers.answer141;
                break;
            case "Which object is the top object in BOM?":
                answer = InterviewAnswers.answer142;
                break;
            case "Why window object is used on BOM?":
                answer = InterviewAnswers.answer143;
                break;
            case "What is full form of Bom?":
                answer = InterviewAnswers.answer144;
                break;
            case "Which object is the most important object in the BOM model?":
                answer = InterviewAnswers.answer145;
                break;
            case "Which object is at the top of the hierarchy in document object model?\n":
                answer = InterviewAnswers.answer146;
                break;
            case "What is the window object?":
                answer = InterviewAnswers.answer147;
                break;
            case "How to get web browser window size?":
                answer = InterviewAnswers.answer148;
                break;
            case "How to detect web browser information?":
                answer = InterviewAnswers.answer149;
                break;
            case "What is IIFEs (Immediately Invoked Function Expressions)?":
                answer = InterviewAnswers.answer150;
                break;
            case "Explain the difference between Object.freeze() vs const":
                answer = InterviewAnswers.answer151;
                break;
            case "What is generator in JS?":
                answer = InterviewAnswers.answer152;
                break;
            case "When should we use generators in ES6?":
                answer = InterviewAnswers.answer153;
                break;
            case "What will be the output of the following code?":
                answer = InterviewAnswers.answer154;
                break;
            case "Explain the Prototype Design Pattern":
                answer = InterviewAnswers.answer155;
                break;
            case "What is the Temporal Dead Zone in ES6?":
                answer = InterviewAnswers.answer156;
                break;
            case "Can you describe the main difference between a .forEach loop and a .map() loop and why you would pick one versus the other?":
                answer = InterviewAnswers.answer157;
                break;
            case "Describe the Revealing Module Pattern design pattern":
                answer = InterviewAnswers.answer158;
                break;
            case "What is Ajax?":
                answer = InterviewAnswers.answer159;
                break;
            case "What are Ajax applications?":
                answer = InterviewAnswers.answer160;
                break;
            case "How many types of triggers are present in update panel?":
                answer = InterviewAnswers.answer161;
                break;
            case "What are all the controls of Ajax?":
                answer = InterviewAnswers.answer162;
                break;
            case "What is the name of the DLL that contains Ajax control tool kit?":
                answer = InterviewAnswers.answer163;
                break;
            case "What role of #&& in querystring?":
                answer = InterviewAnswers.answer164;
                break;
            case "How to control the duration of an Ajax request?":
                answer = InterviewAnswers.answer165;
                break;
            case "What are the advantages of Ajax?":
                answer = InterviewAnswers.answer166;
                break;
            case "What are the disadvantages of Ajax?":
                answer = InterviewAnswers.answer167;
                break;
            case "What is update panel?":
                answer = InterviewAnswers.answer168;
                break;
            case "Which are the two methods used for cross domain Ajax calls?":
                answer = InterviewAnswers.answer169;
                break;
            case "What are all the technologies used by Ajax?":
                answer = InterviewAnswers.answer170;
                break;
            case "What are all the features of Ajax?":
                answer = InterviewAnswers.answer171;
                break;
            case "What is JSON in Ajax?":
                answer = InterviewAnswers.answer172;
                break;
            case "What are the components of the ASP.NET AJAX architecture?":
                answer = InterviewAnswers.answer173;
                break;
            case "What is AJAX Control Extender Toolkit?":
                answer = InterviewAnswers.answer174;
                break;
            case "Where AJAX cannot be used?":
                answer = InterviewAnswers.answer175;
                break;
            case "What are the pre-requisites to execute AJAX applications on a server?":
                answer = InterviewAnswers.answer176;
                break;
            case "What is AJAX Framework?":
                answer = InterviewAnswers.answer177;
                break;
            case "Does Ajax work with another language?":
                answer = InterviewAnswers.answer178;
                break;
            case "What is an asynchronous request in AJAX?":
                answer = InterviewAnswers.answer179;
                break;
            case "What is a synchronous request in AJAX?":
                answer = InterviewAnswers.answer180;
                break;
            case "Did adaptive path invent Ajax? Did Google? Did adaptive path help build Google’s Ajax Applications?":
                answer = InterviewAnswers.answer181;
                break;
            case "What do you need to know to create my own Ajax Functionality?":
                answer = InterviewAnswers.answer182;
                break;
            case "Should I use Xml or Text, Javascript, or Html as a Return Type?":
                answer = InterviewAnswers.answer183;
                break;
            case "Are there usability issues with Ajax?":
                answer = InterviewAnswers.answer184;
                break;
            case "Should I use an Http get or Post for my Ajax Calls?":
                answer = InterviewAnswers.answer185;
                break;
            case "How do we Debug Javascript?":
                answer = InterviewAnswers.answer186;
                break;
            case "How do I provide Internationalized Ajax Interactions?":
                answer = InterviewAnswers.answer187;
                break;
            case "What is TypeScript?":
                answer = InterviewAnswers.answer188;
                break;
            case "What are the Differences between TypeScript and JavaScript?":
                answer = InterviewAnswers.answer189;
                break;
            case "Why do we need TypeScript?":
                answer = InterviewAnswers.answer190;
                break;
            case "Mention some of the features of TypeScript":
                answer = InterviewAnswers.answer191;
                break;
            case "What are the Benefits of using TypeScript?":
                answer = InterviewAnswers.answer192;
                break;
            case "What are the Disadvantages of TypeScript?":
                answer = InterviewAnswers.answer193;
                break;
            case "What are the Components of TypeScript?":
                answer = InterviewAnswers.answer194;
                break;
            case "Who developed Typescript and what is the current stable version available?":
                answer = InterviewAnswers.answer195;
                break;
            case "How to install TypeScript?":
                answer = InterviewAnswers.answer196;
                break;
            case "How do you compile TypeScript files?":
                answer = InterviewAnswers.answer197;
                break;
            case "Can we combine multiple .ts files into a single .js file?":
                answer = InterviewAnswers.answer198;
                break;
            case "What are the different types of TypeScript?":
                answer = InterviewAnswers.answer199;
                break;
            case "List out the built-in data types in TypeScript.":
                answer = InterviewAnswers.answer200;
                break;
            case "What are Variables in TypeScript and how to create them?":
                answer = InterviewAnswers.answer201;
                break;
            case "What are the object-oriented terms supported by TypeScript?":
                answer = InterviewAnswers.answer202;
                break;
            case "What are Interfaces in TypeScript?":
                answer = InterviewAnswers.answer203;
                break;
            case "What are Classes in TypeScript? List out some of the features.":
                answer = InterviewAnswers.answer204;
                break;
            case "What are the access modifiers supported by TypeScript?":
                answer = InterviewAnswers.answer205;
                break;
            case "How is TypeScript an optionally statically typed language?":
                answer = InterviewAnswers.answer206;
                break;
            case "What are modules in TypeScript?":
                answer = InterviewAnswers.answer207;
                break;
            case "What is namespace in Typescript and how to declare it?":
                answer = InterviewAnswers.answer208;
                break;
            case "Does TypeScript support function overloading?":
                answer = InterviewAnswers.answer209;
                break;
            case "Explain Decorators in TypeScript.":
                answer = InterviewAnswers.answer210;
                break;
            case "What are Mixins?":
                answer = InterviewAnswers.answer211;
                break;
            case "How does TypeScript support optional parameters in function?":
                answer = InterviewAnswers.answer212;
                break;
            case "What is Scope variable?":
                answer = InterviewAnswers.answer213;
                break;
            case "What is TypeScript Definition Manager and why do we need it?":
                answer = InterviewAnswers.answer214;
                break;
            case "What is TypeScript Declare Keyword?":
                answer = InterviewAnswers.answer215;
                break;
            case "What is the Default Parameters Function in TypeScript?":
                answer = InterviewAnswers.answer216;
                break;
            case "What is tsconfig.json file?":
                answer = InterviewAnswers.answer217;
                break;
            case "What are Generics in TypeScript?":
                answer = InterviewAnswers.answer218;
                break;
            case "What is JSX in TypeScript?":
                answer = InterviewAnswers.answer219;
                break;
            case "What are all the JSX modes TypeScript supports?":
                answer = InterviewAnswers.answer220;
                break;
            case "What are Ambients in TypeScripts and when to use them?":
                answer = InterviewAnswers.answer221;
                break;
            case "What is a TypeScript Map file?":
                answer = InterviewAnswers.answer222;
                break;
            case "What is Type assertions in TypeScript?":
                answer = InterviewAnswers.answer223;
                break;
            case "Explain Enum in TypeScript.":
                answer = InterviewAnswers.answer224;
                break;
            case "What is method overriding in TypeScript?":
                answer = InterviewAnswers.answer225;
                break;
            case "What is Lambda/Arrow function?":
                answer = InterviewAnswers.answer226;
                break;
            case "What is Angular? Why was it introduced?":
                answer = InterviewAnswers.answer227;
                break;
            case "What is data binding? Which type of data binding does Angular deploy?":
                answer = InterviewAnswers.answer228;
                break;
            case "What are Single Page Applications (SPA)?":
                answer = InterviewAnswers.answer229;
                break;
            case "What are decorators in Angular?":
                answer = InterviewAnswers.answer230;
                break;
            case "Mention some advantages of Angular.":
                answer = InterviewAnswers.answer231;
                break;
            case "What are the new updates with Angular10?":
                answer = InterviewAnswers.answer232;
                break;
            case "What are Templates in Angular?":
                answer = InterviewAnswers.answer233;
                break;
            case "What are Annotations in Angular?":
                answer = InterviewAnswers.answer234;
                break;
            case "What are Directives in Angular?":
                answer = InterviewAnswers.answer235;
                break;
            case "What is an AOT compilation? What are its advantages?":
                answer = InterviewAnswers.answer236;
                break;
            case "What are Components in Angular?":
                answer = InterviewAnswers.answer237;
                break;
            case "What are Pipes in Angular?":
                answer = InterviewAnswers.answer238;
                break;
            case "What is an ngModule?":
                answer = InterviewAnswers.answer239;
                break;
            case "What are filters in Angular? Name a few of them.":
                answer = InterviewAnswers.answer240;
                break;
            case "What is view encapsulation in Angular?":
                answer = InterviewAnswers.answer241;
                break;
            case "What are controllers?":
                answer = InterviewAnswers.answer242;
                break;
            case "Explain the lifecycle hooks in Angular":
                answer = InterviewAnswers.answer243;
                break;
            case "What is String Interpolation in Angular?":
                answer = InterviewAnswers.answer244;
                break;
            case "What is the difference between AOT and JIT?":
                answer = InterviewAnswers.answer245;
                break;
            case "Explain the @Component Decorator.":
                answer = InterviewAnswers.answer246;
                break;
            case "What are Services in Angular?":
                answer = InterviewAnswers.answer247;
                break;
            case "What are Promises and Observables in Angular?":
                answer = InterviewAnswers.answer248;
                break;
            case "What are Template and Reactive forms?":
                answer = InterviewAnswers.answer249;
                break;
            case "What is Bootstrap? How is it embedded into Angular?":
                answer = InterviewAnswers.answer250;
                break;
            case "What type of DOM does Angular implement?":
                answer = InterviewAnswers.answer251;
                break;
            case "What is Vue.js?":
                answer = InterviewAnswers.answer252;
                break;
            case "List some features of Vue.js?":
                answer = InterviewAnswers.answer253;
                break;
            case "Explain Life cycle of Vue Instance?":
                answer = InterviewAnswers.answer254;
                break;
            case "How to create an instance of Vue js?":
                answer = InterviewAnswers.answer255;
                break;
            case "Explain the differences between one-way data flow and two-way data binding?":
                answer = InterviewAnswers.answer256;
                break;
            case "How to create Two-Way Bindings in Vue.js?":
                answer = InterviewAnswers.answer257;
                break;
            case "What are filters in VUE.js?":
                answer = InterviewAnswers.answer258;
                break;
            case "How to create a custom filter in Vue.js?":
                answer = InterviewAnswers.answer259;
                break;
            case "What are Components in Vue.js? How to register a component inside other component?":
                answer = InterviewAnswers.answer260;
                break;
            case "What are Directives in VUE.js, List some of them you used?":
                answer = InterviewAnswers.answer261;
                break;
            case "List type of Directive are available in Vue.js?":
                answer = InterviewAnswers.answer262;
                break;
            case "What is VUE-resource, how can you install Vue Resource?":
                answer = InterviewAnswers.answer263;
                break;
            case "How to create Constants in Vue.js?":
                answer = InterviewAnswers.answer264;
                break;
            case "What is virtual dom in Vue.js?":
                answer = InterviewAnswers.answer265;
                break;
            case "Why we need Vue.js mixins?":
                answer = InterviewAnswers.answer266;
                break;
            case "What is Vuex?":
                answer = InterviewAnswers.answer267;
                break;
            case "What are filters in Vue.js?":
                answer = InterviewAnswers.answer268;
                break;
            case "How to create a component in Vue.js?":
                answer = InterviewAnswers.answer269;
                break;
            case "How to import js file in the Vue component?":
                answer = InterviewAnswers.answer270;
                break;
            case "How to call rest API from Vue js?":
                answer = InterviewAnswers.answer271;
                break;
            case "What is Next.js?":
                answer = InterviewAnswers.answer272;
                break;
            case "Why is Next.js used for? / Why do world's leading companies prefer Next.js?":
                answer = InterviewAnswers.answer273;
                break;
            case "What is the process to install Next.js? / How to install Next.js?":
                answer = InterviewAnswers.answer274;
                break;
            case "What are the most prominent features of Next.js?":
                answer = InterviewAnswers.answer275;
                break;
            case "Which types of websites most popularly use Next.js?":
                answer = InterviewAnswers.answer276;
                break;
            case "Is it possible to use Next.js with Redux?":
                answer = InterviewAnswers.answer277;
                break;
            case "What is the recommended method to fetch data in Next.js?":
                answer = InterviewAnswers.answer278;
                break;
            case "Give an example to demonstrate how do you set up CDN in Next.js?":
                answer = InterviewAnswers.answer279;
                break;
            case "Are Create-React-App and Next.js used for the same thing?":
                answer = InterviewAnswers.answer280;
                break;
            case "How can you disable the etag generation in Next.js?":
                answer = InterviewAnswers.answer281;
                break;
            case "How can you configure the build-id in Next.js?":
                answer = InterviewAnswers.answer282;
                break;
            case "How can you create a page directory inside your project?":
                answer = InterviewAnswers.answer283;
                break;
            case "Give an example to demonstrate how to create a custom error page in Next.js?":
                answer = InterviewAnswers.answer284;
                break;
            case "What do you understand by code splitting in Next.js?":
                answer = InterviewAnswers.answer285;
                break;
            case "How can you enable AMP in Next.js?":
                answer = InterviewAnswers.answer286;
                break;
            case "Is it possible to host Next.js in a web server like Nginx?":
                answer = InterviewAnswers.answer287;
                break;
            case "Next.js vs gatsby?":
                answer = InterviewAnswers.answer288;
                break;
            case "":
                answer = InterviewAnswers.answer;
                break;

        }
        //textAnswer.setText(answer);
        questionDes.setText(answer);


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
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(EditProfileActivity.CONNECTIVITY_SERVICE);
            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                //we are connected to a network
                startActivity(new Intent(InterviewAnswerActivity.this, CodesActivity.class));
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