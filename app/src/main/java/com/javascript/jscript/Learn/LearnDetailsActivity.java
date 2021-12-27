package com.javascript.jscript.Learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
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
import com.javascript.jscript.Model.LearnDetailsModel;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityLearnDetailsBinding;

import java.util.List;
import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class LearnDetailsActivity extends AppCompatActivity {

    ActivityLearnDetailsBinding binding;
    private AdNetwork adNetwork;
    private List<LearnDetailsModel> learnList;
    private int currentTopicPosition = 0;
    TextView title, details, outputTxt;
    EditText codesET;
    CodeView codes, output;
    private AppCompatButton prevBtn, nextBtn, shareBtn;
    FirebaseDatabase database;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLearnDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //firebase instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //toolbar
        setSupportActionBar(binding.toolbar2);
        LearnDetailsActivity.this.setTitle("Details");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //ad request
        //interstitial ads
        adNetwork = new AdNetwork(LearnDetailsActivity.this);
        adNetwork.loadInterstitialAd();
        //banner
        AdView bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
        } else {
            bannerAd.setVisibility(View.GONE);
        }
        //find id
        title = findViewById(R.id.learnTitle);
        details = findViewById(R.id.learnDetails);
        outputTxt = findViewById(R.id.output);
        codesET = findViewById(R.id.codesET);
        //code
        codes = findViewById(R.id.questionDes);
        output = findViewById(R.id.learnOutputView);
        codes.setTheme(CodeViewTheme.ATELIER_SAVANNA_DARK).fillColor();
        output.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();

        //button's
        prevBtn = findViewById(R.id.learnPrevBtn);
        nextBtn = findViewById(R.id.learnNextBtn);
        shareBtn = findViewById(R.id.learnShareBtn);

        final String getSelectedTopicName = getIntent().getStringExtra("learnTopics");
        learnList = LearnDetailsContent.getTopics(getSelectedTopicName);

        title.setText(learnList.get(0).getTitle());
        details.setText(learnList.get(0).getDetails());
        codes.showCode(learnList.get(0).getCodes());
        output.showCode(learnList.get(0).getOutput());
        if (learnList.get(0).getCodes().equals("")) {
            codes.setVisibility(View.GONE);
            outputTxt.setVisibility(View.GONE);
        }
        if (learnList.get(0).getOutput().equals("")) {
            output.setVisibility(View.GONE);
            outputTxt.setVisibility(View.GONE);
        }

        //run code
        binding.codesRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String getCodesET = codesET.getText().toString().trim();
                    if (getCodesET.isEmpty()){
                        Toast.makeText(LearnDetailsActivity.this, "Write your code first", Toast.LENGTH_SHORT).show();
                    }else if (getCodesET.equals(learnList.get(currentTopicPosition).getTitle())){
                        Toast.makeText(LearnDetailsActivity.this, learnList.get(currentTopicPosition).getTitle(), Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(LearnDetailsActivity.this, "Correct your code", Toast.LENGTH_SHORT).show();
                    }


            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextBtn.setBackgroundResource(R.drawable.ic_learn_next_button_bg);
                adNetwork.showInterstitialAd();
                changeNextQuestion();
                if (currentTopicPosition == 0) {
                    prevBtn.setVisibility(View.GONE);
                } else {
                    prevBtn.setVisibility(View.VISIBLE);
                }
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevBtn.setBackgroundResource(R.drawable.ic_learn_prev_button_bg);
                adNetwork.showInterstitialAd();
                changePrevQuestion();
                if (currentTopicPosition == 0) {
                    prevBtn.setVisibility(View.GONE);
                    nextBtn.setText(R.string.next);
                } else {
                    prevBtn.setVisibility(View.VISIBLE);
                }
            }
        });
        //share button click
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareBtn.setBackgroundResource(R.drawable.ic_quiz_option_bg);
                String shareBody =
                        "Topic: " + learnList.get(currentTopicPosition).getTitle() + "\n\n" +
                                "Details: " + learnList.get(currentTopicPosition).getDetails() + "\n\n\n" +
                                learnList.get(currentTopicPosition).getCodes() + "\n\n\n" +
                                learnList.get(currentTopicPosition).getOutput() + "\n" + "\n\n\n\n" +
                                "Learn JavaScript in JScript" + "\n" +
                                "https://play.google.com/store/apps/details?id=" +
                                BuildConfig.APPLICATION_ID;

                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, learnList.get(currentTopicPosition).getTitle());
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });
    }//ends of onCreate

    private void changeNextQuestion() {
        currentTopicPosition++;
        if ((currentTopicPosition + 1) == learnList.size()) {
            nextBtn.setText(R.string.complete);
        }

        if (currentTopicPosition < learnList.size()) {
            codesET.setText("");
            title.setText(learnList.get(currentTopicPosition).getTitle());
            details.setText(learnList.get(currentTopicPosition).getDetails());
            codes.showCode(learnList.get(currentTopicPosition).getCodes());
            output.showCode(learnList.get(currentTopicPosition).getOutput());
            //empty conditions
            if (learnList.get(currentTopicPosition).getCodes().equals("")) {
                codes.setVisibility(View.GONE);
                outputTxt.setVisibility(View.GONE);
            }else {
                codes.setVisibility(View.VISIBLE);
            }
            if (learnList.get(currentTopicPosition).getOutput().equals("")) {
                output.setVisibility(View.GONE);
                outputTxt.setVisibility(View.GONE);
            }else {
                output.setVisibility(View.VISIBLE);
                outputTxt.setVisibility(View.VISIBLE);
            }

        } else {
            //send progress value
            database.getReference()
                    .child("Progress")
                    .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                    .child("learnCount")
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            int learnCount = 0;
                            if (snapshot.exists()) {
                                learnCount = snapshot.getValue(Integer.class);
                            }
                            database.getReference()
                                    .child("Progress")
                                    .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                    .child("learnCount")
                                    .setValue(learnCount + 1)
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
    }

    private void changePrevQuestion() {
        currentTopicPosition--;
        if ((currentTopicPosition + 2) == learnList.size()) {
            nextBtn.setText(R.string.next);
        }
        if (currentTopicPosition < learnList.size()) {
            title.setText(learnList.get(currentTopicPosition).getTitle());
            details.setText(learnList.get(currentTopicPosition).getDetails());
            codes.showCode(learnList.get(currentTopicPosition).getCodes());
            output.showCode(learnList.get(currentTopicPosition).getOutput());
            if (learnList.get(currentTopicPosition).getCodes().equals("")) {
                codes.setVisibility(View.GONE);
                outputTxt.setVisibility(View.GONE);
            }else {
                codes.setVisibility(View.VISIBLE);
            }
            if (learnList.get(currentTopicPosition).getOutput().equals("")) {
                output.setVisibility(View.GONE);
                outputTxt.setVisibility(View.GONE);
            }else {
                output.setVisibility(View.VISIBLE);
                outputTxt.setVisibility(View.VISIBLE);
            }

        }
    }
    //write codes method
    //check is field empty
    public boolean isCodesEmpty(){
        String codesText = binding.codesET.getText().toString().trim();
        if (codesText.isEmpty()){
            Toast.makeText(LearnDetailsActivity.this, "First test code", Toast.LENGTH_SHORT).show();
            return false;
        }else {
            binding.codesET.setError(null);
            return true;
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
            startActivity(new Intent(LearnDetailsActivity.this, CodesActivity.class));
        }else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}