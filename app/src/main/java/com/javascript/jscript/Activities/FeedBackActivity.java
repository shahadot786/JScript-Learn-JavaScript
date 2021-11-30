package com.javascript.jscript.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.javascript.jscript.databinding.ActivityFeedBackBinding;

public class FeedBackActivity extends AppCompatActivity {
    ActivityFeedBackBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeedBackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar2);
        FeedBackActivity.this.setTitle("Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }//end of onCreate
    //other codes


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}