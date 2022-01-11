package com.javascript.jscript.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityFollowUsBinding;

import java.util.Calendar;
import java.util.Objects;

public class FollowUsActivity extends AppCompatActivity {

    ActivityFollowUsBinding binding;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFollowUsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //pro status
        ImageView proBadge = findViewById(R.id.proBadge);
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proBadge.setVisibility(View.GONE);
        } else {
            proBadge.setVisibility(View.VISIBLE);
        }
        //toolbar
        setSupportActionBar(binding.toolbar3);
        FollowUsActivity.this.setTitle("Follow Us");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //work with version
        binding.fwVersion.setText(BuildConfig.VERSION_NAME);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        binding.fwCopyrights.setText("© " + year + " All Rights Reserved");

        //work with link
        binding.viewInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_instagram))));
            }
        });
        binding.viewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_facebook))));
            }
        });
        binding.viewLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_linkedin))));
            }
        });
        binding.viewTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_twitter))));
            }
        });
        binding.viewPlayStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_more_apps))));
            }
        });
        binding.viewGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_github))));
            }
        });
        binding.viewWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.play_website))));
            }
        });
        binding.contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(FollowUsActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "info@shrcreation.com")));
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
            }
        });
    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

}