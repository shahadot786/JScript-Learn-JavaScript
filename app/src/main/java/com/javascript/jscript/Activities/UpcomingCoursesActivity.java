package com.javascript.jscript.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityUpcomingCoursesBinding;

import java.util.Objects;

public class UpcomingCoursesActivity extends AppCompatActivity {
    ActivityUpcomingCoursesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpcomingCoursesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        UpcomingCoursesActivity.this.setTitle("Upcoming Courses");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}