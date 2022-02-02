package com.javascript.jscript.Quiz;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityQuizResultBinding;

import java.util.Objects;

public class QuizResultActivity extends AppCompatActivity {

    ActivityQuizResultBinding binding;
    ImageView quizTrophy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        QuizResultActivity.this.setTitle("Quiz Result");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //find id
        TextView quizMessage = findViewById(R.id.quizMessage);
        quizTrophy = findViewById(R.id.quizTrophy);
        TextView correctAns = findViewById(R.id.correctAns);
        TextView wrongAns = findViewById(R.id.wrongAns);
        AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        //ad initialization
        AdView mRecAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mRecAd.loadAd(adRequest);
        //conditions
        //ads disabled code
        if (UiConfig.BANNER_AD_VISIBILITY) {
            mRecAd.setVisibility(View.VISIBLE);
        } else {
            mRecAd.setVisibility(View.GONE);
        }

        //get results
        final int getCorrectAnswer = getIntent().getIntExtra("correct", 0);
        final int getWrongAnswer = getIntent().getIntExtra("incorrect", 0);

        //set results
        correctAns.setText(String.valueOf(getCorrectAnswer));
        wrongAns.setText(String.valueOf(getWrongAnswer));

        //check the result is bellow 10
        if (getCorrectAnswer < 8) {
            quizTrophy.setImageResource(R.drawable.ic_quiz_fail_64);
            quizTrophy.setVisibility(View.VISIBLE);
            quizMessage.setText(getResources().getString(R.string.quiz_fail_message));
        } else {
            quizTrophy.setImageResource(R.drawable.ic_quiz_success_64);
            quizTrophy.setVisibility(View.VISIBLE);
            quizMessage.setText(getResources().getString(R.string.quiz_success_message));
            binding.quizAnimation.setVisibility(View.VISIBLE);
        }


        //goto new quiz
        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}