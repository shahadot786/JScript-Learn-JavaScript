package com.javascript.jscript.Quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.javascript.jscript.Programs.ProgramsCodeActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityDashboardBinding;

import java.util.Objects;

public class DashboardActivity extends AppCompatActivity {
    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        DashboardActivity.this.setTitle("Dashboard");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

}