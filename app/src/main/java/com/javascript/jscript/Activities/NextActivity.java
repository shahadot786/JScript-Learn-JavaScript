package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityNextBinding;

public class NextActivity extends AppCompatActivity {

    ActivityNextBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //binding
        binding = ActivityNextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //find id
        binding.btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this,NextActivity2.class);
                startActivity(intent);
            }
        });



    }
}