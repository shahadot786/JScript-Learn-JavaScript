package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityNext2Binding;

public class NextActivity2 extends AppCompatActivity {

    ActivityNext2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityNext2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity2.this,NextActivity3.class);
                startActivity(intent);
            }
        });
    }
}