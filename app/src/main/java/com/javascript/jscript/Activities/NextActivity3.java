package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityNext3Binding;

public class NextActivity3 extends AppCompatActivity {

    ActivityNext3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //change status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(NextActivity3.this, R.color.colorStatusBarDark));
        binding = ActivityNext3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity3.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}