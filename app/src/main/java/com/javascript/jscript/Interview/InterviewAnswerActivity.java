package com.javascript.jscript.Interview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityInterviewAnswerBinding;

import java.util.Objects;

public class InterviewAnswerActivity extends AppCompatActivity {
    ActivityInterviewAnswerBinding binding;
    FirebaseDatabase database;
    FirebaseAuth auth;
    TextView textQuestion,questionDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInterviewAnswerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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
        switch (getIntent().getStringExtra("question")){
            case "Questions":
                question = BasicInterviewQA.question1;
                break;
            case "Questions 2":
                question = BasicInterviewQA.question2;
                break;
            case "Questions 1":
            case "Questions Angular":
                question = BasicInterviewQA.question3;
                break;

        }
        textQuestion.setText(question);

    }
    //load output
    private void loadAnswer() {
        String answer = null;
        switch (getIntent().getStringExtra("answer")){
            case "Questions":
                answer = BasicInterviewQA.answer1;
                break;
            case "Questions 2":
                answer = BasicInterviewQA.answer2;
                break;
            case "Questions 1":
            case "Questions Angular":
                answer = BasicInterviewQA.answer3;
                break;
        }
        //textAnswer.setText(answer);
        questionDes.setText(answer);


    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

}