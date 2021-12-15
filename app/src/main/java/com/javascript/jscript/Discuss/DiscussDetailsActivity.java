package com.javascript.jscript.Discuss;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityDiscussDetailsBinding;

import java.util.Objects;

public class DiscussDetailsActivity extends AppCompatActivity {
    ActivityDiscussDetailsBinding binding;
    private AdView bannerAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscussDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        DiscussDetailsActivity.this.setTitle("Q&A Discussions");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //banner
        bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY){
            bannerAd.setVisibility(View.VISIBLE);
        }else {
            bannerAd.setVisibility(View.GONE);
        }
    }

    //option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_discuss_share, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.shareQA) {
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT, "This is a discuss share");
            shareIntent.setType("text/plain");
            startActivity(shareIntent);
            return true;
        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}