package com.javascript.jscript.Interview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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
    TextView textQuestion,questionDes;
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
        toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //firebase instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //ad request
        AdView bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY){
            bannerAd.setVisibility(View.VISIBLE);
        }else {
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
        switch (getIntent().getStringExtra("Interview Questions")){
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
            case "":
                question = InterviewQuestions.question;
                break;

        }
        textQuestion.setText(question);

    }
    //load output
    private void loadAnswer() {
        String answer = null;
        switch (getIntent().getStringExtra("Interview Answers")){
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
            }else {
                toastText.setText(R.string.no_connection_text);
                toast.show();
            }

        }else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}