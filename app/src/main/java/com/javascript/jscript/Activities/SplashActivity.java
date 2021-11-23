package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.javascript.jscript.R;

public class SplashActivity extends AppCompatActivity {

    //Variables
    private static int SPLASH_SCREEN = 400000;
    Animation topAmin,bottomAnim;
    ImageView image;
    TextView slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //change status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashActivity.this, R.color.colorStatusBarDark));
        setContentView(R.layout.activity_splash);
        //animations
        topAmin = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        //hooks
        image = findViewById(R.id.splash_logo);
        slogan = findViewById(R.id.slogan_text);
        //set animations
        image.setAnimation(topAmin);
        slogan.setAnimation(bottomAnim);
        //handler for change activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,NextActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}