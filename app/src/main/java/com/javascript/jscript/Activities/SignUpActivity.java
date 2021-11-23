package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.javascript.jscript.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //change status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(SignUpActivity.this, R.color.colorStatusBarDark));
        setContentView(R.layout.activity_sign_up);
    }
}