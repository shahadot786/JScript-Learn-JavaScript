package com.javascript.jscript.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.javascript.jscript.databinding.ActivityNext3Binding;

public class NextActivity3 extends AppCompatActivity {

    ActivityNext3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //binding
        binding = ActivityNext3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //Button Get Started listener
        binding.btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity3.this, GoogleSignInActivity.class);
                startActivity(intent);
            }
        });
    }
}