package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.WindowManager;

import com.javascript.jscript.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //change status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashActivity.this, R.color.colorStatusBarDark));
        setContentView(R.layout.activity_splash);
    }
}