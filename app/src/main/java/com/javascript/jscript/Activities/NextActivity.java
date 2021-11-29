package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityNextBinding;

public class NextActivity extends AppCompatActivity {

    ActivityNextBinding binding;
    FirebaseUser currentUser;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //binding
        binding = ActivityNextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //instance
        auth = FirebaseAuth.getInstance();
        currentUser = auth.getCurrentUser();
        binding.btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextActivity.this,NextActivity2.class);
                startActivity(intent);
            }
        });



    }

    //check user currently sign in or not
    @Override
    protected void onStart() {
        super.onStart();
        if (currentUser != null){
            Intent intent = new Intent(NextActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}