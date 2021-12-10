package com.javascript.jscript.Interview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Programs.BasicProgramsCodes;
import com.javascript.jscript.Programs.ProgramsCodeActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityInterviewAnswerBinding;

import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class InterviewAnswerActivity extends AppCompatActivity {
    ActivityInterviewAnswerBinding binding;
    TextView textQuestion;
    CodeView ansCodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInterviewAnswerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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
        ansCodeView = findViewById(R.id.answerCodeView);
        ansCodeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();

        loadQuestion();
        loadAnswer();
    }
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
        ansCodeView.showCode(answer);


    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

}