package com.javascript.jscript.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;

public class SplashActivity extends AppCompatActivity {

    //Variables
    private static int SPLASH_SCREEN = 4000;
    Animation topAmin, bottomAnim;
    ImageView image;
    TextView slogan;
    FirebaseUser currentUser;
    FirebaseAuth auth;

    final String PREFS_NAME = "JscriptPrefFile2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        //animations
        topAmin = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //hooks
        image = findViewById(R.id.splash_logo);
        slogan = findViewById(R.id.slogan_text);
        //set animations
        image.setAnimation(topAmin);
        slogan.setAnimation(bottomAnim);
        auth = FirebaseAuth.getInstance();
        currentUser = auth.getCurrentUser();

        ///check first time installer
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if (settings.getBoolean("my_first_time", true)) {
            //the app is being launched for first time, do something
            //Log.d("Comments", "First time");
            // first time task
            //handler for change activity
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashActivity.this, NextActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_SCREEN);

            // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).apply();
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent;
                    //check user currently sign in or not
                    if (currentUser != null) {
                        //after upgrade to pro
                        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
                            intent = new Intent(SplashActivity.this, PremiumActivity.class);
                        } else {
                            intent = new Intent(SplashActivity.this, MainActivity.class);
                        }
                    } else {
                        intent = new Intent(SplashActivity.this, SignInActivity.class);
                    }
                    startActivity(intent);
                }
            }, SPLASH_SCREEN);
        }


    }

}