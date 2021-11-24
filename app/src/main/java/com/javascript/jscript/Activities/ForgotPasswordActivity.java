package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.javascript.jscript.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //change status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(ForgotPasswordActivity.this, R.color.activeGreen));
        setContentView(R.layout.activity_forgot_password);
    }
}