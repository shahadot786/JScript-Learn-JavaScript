package com.javascript.jscript.Quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.CodesActivity;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Learn.LearnDetailsActivity;
import com.javascript.jscript.Model.QuizListModel;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityQuizDetailsBinding;

import java.util.List;
import java.util.Objects;

public class QuizDetailsActivity extends AppCompatActivity {

    ActivityQuizDetailsBinding binding;
    FirebaseDatabase database;
    FirebaseAuth auth;
    private AdView bannerAd;
    private AdNetwork adNetwork;
    private List<QuizListModel> questionList;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";
    TextView quizCount, question;
    private AppCompatButton option1, option2, option3, option4, nextBtn, shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //firebase instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //toolbar
        setSupportActionBar(binding.toolbar2);
        QuizDetailsActivity.this.setTitle("Quiz");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //ad request
        //interstitial ads
        adNetwork = new AdNetwork(QuizDetailsActivity.this);
        adNetwork.loadInterstitialAd();
        //banner
        bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
        } else {
            bannerAd.setVisibility(View.GONE);
        }
        //quiz code
        quizCount = findViewById(R.id.quizCount);
        question = findViewById(R.id.question);
        //options
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        nextBtn = findViewById(R.id.nextBtn);
        shareBtn = findViewById(R.id.quizShareBtn);

        final String getSelectedTopicName = getIntent().getStringExtra("question");

        questionList = QuizQuestionsBank.getQuestions(getSelectedTopicName);

        String count = currentQuestionPosition + 1 + " - " + questionList.size();
        quizCount.setText(count);
        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOption1());
        option2.setText(questionList.get(0).getOption2());
        option3.setText(questionList.get(0).getOption3());
        option4.setText(questionList.get(0).getOption4());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.ic_quiz_option_bg_red);
                    option1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }

            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.ic_quiz_option_bg_red);
                    option2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }

            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.ic_quiz_option_bg_red);
                    option3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.ic_quiz_option_bg_red);
                    option4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }

            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    Toast.makeText(QuizDetailsActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                } else {
                    adNetwork.showInterstitialAd();
                    changeNextQuestion();
                }

            }
        });

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody =
                        "Question: " + questionList.get(currentQuestionPosition).getQuestion() + "\n\n" +
                                "1. " + questionList.get(currentQuestionPosition).getOption1() + "\n" +
                                "2. " + questionList.get(currentQuestionPosition).getOption2() + "\n" +
                                "3. " + questionList.get(currentQuestionPosition).getOption3() + "\n" +
                                "4. " + questionList.get(currentQuestionPosition).getOption4() + "\n\n\n\n" +
                                "Play Quiz in JScript" + "\n" +
                                "https://play.google.com/store/apps/details?id=" +
                                BuildConfig.APPLICATION_ID;

                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "JavaScript Quiz");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });

    }//on create

    //for change question
    @SuppressLint("SetTextI18n")
    private void changeNextQuestion() {
        currentQuestionPosition++;
        if ((currentQuestionPosition + 1) == questionList.size()) {
            nextBtn.setText("Submit Quiz");
        }

        if (currentQuestionPosition < questionList.size()) {
            selectedOptionByUser = "";

            option1.setTextColor(Color.WHITE);
            option1.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option2.setTextColor(Color.WHITE);
            option2.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option3.setTextColor(Color.WHITE);
            option3.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option4.setTextColor(Color.WHITE);
            option4.setBackgroundResource(R.drawable.ic_quiz_option_bg);


            String count = currentQuestionPosition + 1 + " - " + questionList.size();
            quizCount.setText(count);
            question.setText(questionList.get(currentQuestionPosition).getQuestion());
            option1.setText(questionList.get(currentQuestionPosition).getOption1());
            option2.setText(questionList.get(currentQuestionPosition).getOption2());
            option3.setText(questionList.get(currentQuestionPosition).getOption3());
            option4.setText(questionList.get(currentQuestionPosition).getOption4());

        } else {
            //send progress value
            database.getReference()
                    .child("Progress")
                    .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                    .child("quizCount")
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            int quizCount = 0;
                            if (snapshot.exists()) {
                                quizCount = snapshot.getValue(Integer.class);
                            }
                            database.getReference()
                                    .child("Progress")
                                    .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                    .child("quizCount")
                                    .setValue(quizCount + 1)
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
            Intent intent = new Intent(QuizDetailsActivity.this, QuizResultActivity.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getInCorrectAnswers());
            startActivity(intent);
            finish();
        }

    }

    //get correct answer
    private int getCorrectAnswers() {
        int correctAnswers = 0;

        for (int i = 0; i < questionList.size(); i++) {
            final String getUserSelectedAnswer = questionList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionList.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }

        }
        return correctAnswers;
    }

    //get wrong answer
    private int getInCorrectAnswers() {
        int correctAnswers = 0;

        for (int i = 0; i < questionList.size(); i++) {
            final String getUserSelectedAnswer = questionList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionList.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }

        }
        return correctAnswers;
    }

    //for answer
    private void revealAnswer() {
        final String getAnswer = questionList.get(currentQuestionPosition).getAnswer();
        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option4.setTextColor(Color.WHITE);
        }
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
            startActivity(new Intent(QuizDetailsActivity.this, CodesActivity.class));
        }else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}