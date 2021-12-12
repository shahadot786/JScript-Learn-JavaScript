package com.javascript.jscript.Quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.javascript.jscript.Fragment.QuizFragment;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityQuizResultBinding;

import java.util.Objects;

public class QuizResultActivity extends AppCompatActivity {

    ActivityQuizResultBinding binding;
    private AppCompatButton startNewBtn;
    private TextView quizMessage,correctAns,wrongAns;
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
        quizMessage = findViewById(R.id.quizMessage);
        quizTrophy = findViewById(R.id.quizTrophy);
        correctAns = findViewById(R.id.correctAns);
        wrongAns = findViewById(R.id.wrongAns);
        startNewBtn = findViewById(R.id.startNewQuizBtn);

        //get results
        final int getCorrectAnswer = getIntent().getIntExtra("correct",0);
        final int getWrongAnswer = getIntent().getIntExtra("incorrect",0);

        //set results
        correctAns.setText(String.valueOf(getCorrectAnswer));
        wrongAns.setText(String.valueOf(getWrongAnswer));

        //check the result is bellow 10
        if (getCorrectAnswer <8){
            quizTrophy.setImageResource(R.drawable.ic_quiz_fail_64);
            quizMessage.setText(getResources().getString(R.string.quiz_fail_message));
        }else {
            quizTrophy.setImageResource(R.drawable.ic_quiz_success_64);
            quizMessage.setText(getResources().getString(R.string.quiz_success_message));
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