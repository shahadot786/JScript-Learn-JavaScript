package com.javascript.jscript.Quiz;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.airbnb.lottie.LottieAnimationView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxRewardedAd;
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
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.QuizListModel;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityQuizDetailsBinding;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class QuizDetailsActivity extends AppCompatActivity implements MaxRewardedAdListener {

    ActivityQuizDetailsBinding binding;
    FirebaseDatabase database;
    FirebaseAuth auth;
    TextView quizCount, question;
    TextView quizTimer;
    LayoutInflater inflater;
    TextView toastText, qTimer;
    View toastLayout;
    Toast toast;
    int time;
    LottieAnimationView timerView;
    private List<QuizListModel> questionList;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";
    private AppCompatButton option1;
    private AppCompatButton option2;
    private AppCompatButton option3;
    private AppCompatButton option4;
    private AppCompatButton nextBtn;
    private AppCompatButton prevBtn;
    private AdNetwork adNetwork;
    private MaxRewardedAd rewardedAd;
    private int retryAttempt;
    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = QuizDetailsActivity.this;
        //find id
        qTimer = findViewById(R.id.qTimer);
        timerView = findViewById(R.id.timerView);
        quizTimer = findViewById(R.id.removeTimer);
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
        //toolbar
        setSupportActionBar(binding.toolbar2);
        QuizDetailsActivity.this.setTitle("Quiz");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //ad request
        //interstitial ads
        //banner
        //ad request.
        adNetwork = new AdNetwork(this);
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

        rewardedAd = MaxRewardedAd.getInstance(getResources().getString(R.string.rewarded_ad_unit_id), this);
        rewardedAd.setListener(this);
        rewardedAd.loadAd();

        //check premium time
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            //true
            time = 2;
            qTimer.setVisibility(View.VISIBLE);
            timerView.setVisibility(View.VISIBLE);
        } else {
            //false
            time = 1000;
            qTimer.setVisibility(View.GONE);
            timerView.setVisibility(View.GONE);
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
        prevBtn = findViewById(R.id.prevBtn);
        AppCompatButton shareBtn = findViewById(R.id.quizShareBtn);
        //all caps
        option1.setAllCaps(false);
        option2.setAllCaps(false);
        option3.setAllCaps(false);
        option4.setAllCaps(false);
        //text size
        option1.setTextSize(15);
        option2.setTextSize(15);
        option3.setTextSize(15);
        option4.setTextSize(15);

        final String getSelectedTopicName = getIntent().getStringExtra("question");

        questionList = QuizQuestionsBank.getQuestions(getSelectedTopicName);

        String count = currentQuestionPosition + 1 + " - " + questionList.size();
        quizCount.setText(count);
        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOption1());
        option2.setText(questionList.get(0).getOption2());
        option3.setText(questionList.get(0).getOption3());
        option4.setText(questionList.get(0).getOption4());
        //options
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.ic_quiz_option_bg_red);
                    option1.setTextColor(getResources().getColor(R.color.colorPrimary));

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
                    option2.setTextColor(getResources().getColor(R.color.colorPrimary));

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
                    option3.setTextColor(getResources().getColor(R.color.colorPrimary));

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
                    option4.setTextColor(getResources().getColor(R.color.colorPrimary));

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);

                }

            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    toastText.setText(R.string.Please_select_an_option);
                    toast.show();
                } else {
                    prevBtn.setVisibility(View.VISIBLE);
                    adNetwork.showInterstitialAd();
                    changeNextQuestion();
                }

            }
        });
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentQuestionPosition == 0){
                    prevBtn.setVisibility(View.GONE);
                }else {
                    adNetwork.showInterstitialAd();
                    backToPrevQuestion();
                }
            }
        });
        //share
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
        //timer
        //Initialize timer duration
        //time
        long duration = TimeUnit.MINUTES.toMillis(time);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                //When tick
                //Convert millisecond to minute and second
                String sDuration = String.format(Locale.ENGLISH, "%01d : %01d",
                        TimeUnit.MILLISECONDS.toMinutes(l),
                        TimeUnit.MILLISECONDS.toSeconds(l) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                //Set converted string to textview
                qTimer.setText(sDuration);
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFinish() {
                //When finish
                //Hide textView
                qTimer.setText("Time Finished");
                //and remove the timer icon
                timerView.setVisibility(View.GONE);
                //then show the dialog
                AlertDialog.Builder dialog = new AlertDialog.Builder(QuizDetailsActivity.this, R.style.AppCompatAlertDialogStyle);
                dialog.setCancelable(false);
                dialog.setTitle("Quiz Timer");
                dialog.setMessage("Ops! Your times are finished.");
                //retry and play quiz again
                dialog.setPositiveButton("Remove Timer", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //network check
                        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(QuizDetailsActivity.CONNECTIVITY_SERVICE);
                        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                            //we are connected to a network
                            if (rewardedAd.isReady()){
                                rewardedAd.showAd();
                            }else {
                                Toast.makeText(context, "Ad load failed, try again", Toast.LENGTH_SHORT).show();
                            }
                            /*qTimer.setVisibility(View.GONE);
                            timerView.setVisibility(View.GONE);
                            quizTimer.setVisibility(View.GONE);*/
                            dialogInterface.dismiss();

                        } else {
                            toastText.setText(R.string.no_connection_text);
                            toast.show();
                            start();
                        }
                    }
                });
                //watch ad and remove timer
                dialog.setNegativeButton("Play again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
                //dialog showed
                dialog.show();
            }
        }.start();
        //quiz timer codes
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            quizTimer.setVisibility(View.VISIBLE);
            //remove timer code
            binding.removeTimer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //network check
                    ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(QuizDetailsActivity.CONNECTIVITY_SERVICE);
                    if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                            connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                        //we are connected to a network
                        if (rewardedAd.isReady()){
                            rewardedAd.showAd();
                        }else {
                            Toast.makeText(context, "Ad load failed, try again", Toast.LENGTH_SHORT).show();
                        }
                        /*quizTimer.setVisibility(View.GONE);
                        qTimer.setVisibility(View.GONE);
                        timerView.setVisibility(View.GONE);*/

                    } else {
                        toastText.setText(R.string.no_connection_text);
                        toast.show();
                    }
                }
            });

        }else {
            //Remove quiz timer
            quizTimer.setVisibility(View.GONE);
        }

    }//on create

    @SuppressLint("SetTextI18n")
    private void backToPrevQuestion() {
        currentQuestionPosition --;
        if ((currentQuestionPosition + 2) == questionList.size()) {
            nextBtn.setText("Next");
        }
        if (currentQuestionPosition < questionList.size()) {
            selectedOptionByUser = "";

            option1.setTextColor(getResources().getColor(R.color.textColorGrey));
            option1.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option2.setTextColor(getResources().getColor(R.color.textColorGrey));
            option2.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option3.setTextColor(getResources().getColor(R.color.textColorGrey));
            option3.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option4.setTextColor(getResources().getColor(R.color.textColorGrey));
            option4.setBackgroundResource(R.drawable.ic_quiz_option_bg);


            String count = currentQuestionPosition + 1 + " - " + questionList.size();
            quizCount.setText(count);
            question.setText(questionList.get(currentQuestionPosition).getQuestion());
            option1.setText(questionList.get(currentQuestionPosition).getOption1());
            option2.setText(questionList.get(currentQuestionPosition).getOption2());
            option3.setText(questionList.get(currentQuestionPosition).getOption3());
            option4.setText(questionList.get(currentQuestionPosition).getOption4());

        }


    }

    //for change question
    @SuppressLint("SetTextI18n")
    private void changeNextQuestion() {
        currentQuestionPosition++;
        if ((currentQuestionPosition + 1) == questionList.size()) {
            nextBtn.setText("Submit Quiz");
            //prevBtn.setVisibility(View.GONE);
        }

        if (currentQuestionPosition < questionList.size()) {
            selectedOptionByUser = "";

            option1.setTextColor(getResources().getColor(R.color.textColorGrey));
            option1.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option2.setTextColor(getResources().getColor(R.color.textColorGrey));
            option2.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option3.setTextColor(getResources().getColor(R.color.textColorGrey));
            option3.setBackgroundResource(R.drawable.ic_quiz_option_bg);

            option4.setTextColor(getResources().getColor(R.color.textColorGrey));
            option4.setBackgroundResource(R.drawable.ic_quiz_option_bg);


            String count = currentQuestionPosition + 1 + " - " + questionList.size();
            quizCount.setText(count);
            question.setText(questionList.get(currentQuestionPosition).getQuestion());
            option1.setText(questionList.get(currentQuestionPosition).getOption1());
            option2.setText(questionList.get(currentQuestionPosition).getOption2());
            option3.setText(questionList.get(currentQuestionPosition).getOption3());
            option4.setText(questionList.get(currentQuestionPosition).getOption4());
            /*if (questionList.get(currentQuestionPosition).getOption1().equals("")){
                option1.setVisibility(View.GONE);
            }else {
                option1.setText(questionList.get(currentQuestionPosition).getOption1());
            }
            if (questionList.get(currentQuestionPosition).getOption2().equals("")){
                option2.setVisibility(View.GONE);
            }else {
                option2.setText(questionList.get(currentQuestionPosition).getOption2());
            }
            if (questionList.get(currentQuestionPosition).getOption3().equals("")){
                option3.setVisibility(View.GONE);
            }else {
                option3.setText(questionList.get(currentQuestionPosition).getOption3());
            }
            if (questionList.get(currentQuestionPosition).getOption4().equals("")){
                option4.setVisibility(View.GONE);
            }else {
                option4.setText(questionList.get(currentQuestionPosition).getOption4());
            }*/

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
            option1.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option2.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option3.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (option4.getText().toString().equals(getAnswer)) {
            option4.setBackgroundResource(R.drawable.ic_quiz_option_bg_green);
            option4.setTextColor(getResources().getColor(R.color.colorPrimary));
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
            //network check
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(QuizDetailsActivity.CONNECTIVITY_SERVICE);
            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                //we are connected to a network
                startActivity(new Intent(QuizDetailsActivity.this, CodesActivity.class));
            } else {
                toastText.setText(R.string.no_connection_text);
                toast.show();
            }

        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRewardedVideoStarted(MaxAd ad) {

    }

    @Override
    public void onRewardedVideoCompleted(MaxAd ad) {

    }

    @Override
    public void onUserRewarded(MaxAd ad, MaxReward reward) {
        Toast.makeText(context, "Removed timer..", Toast.LENGTH_SHORT).show();
        qTimer.setVisibility(View.GONE);
        timerView.setVisibility(View.GONE);
        quizTimer.setVisibility(View.GONE);
    }

    @Override
    public void onAdLoaded(MaxAd ad) {
        retryAttempt = 0;
    }

    @Override
    public void onAdDisplayed(MaxAd ad) {

    }

    @Override
    public void onAdHidden(MaxAd ad) {
        rewardedAd.loadAd();
    }

    @Override
    public void onAdClicked(MaxAd ad) {

    }

    @Override
    public void onAdLoadFailed(String adUnitId, MaxError error) {
        retryAttempt++;
        long delayMillis = TimeUnit.SECONDS.toMillis((long) Math.pow(2, Math.min(6, retryAttempt)));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rewardedAd.loadAd();
            }
        }, delayMillis);
    }

    @Override
    public void onAdDisplayFailed(MaxAd ad, MaxError error) {
        rewardedAd.loadAd();
    }
}