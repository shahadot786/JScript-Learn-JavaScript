package com.javascript.jscript.Quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityAddQuizBinding;

import java.util.Objects;

public class AddQuizActivity extends AppCompatActivity {
    ActivityAddQuizBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddQuizBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        AddQuizActivity.this.setTitle("Add Quiz");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}