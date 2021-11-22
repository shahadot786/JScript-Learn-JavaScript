package com.javascript.learnonline;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.javascript.learnonline.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //change status bar color
        //getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.main_background_color));
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}