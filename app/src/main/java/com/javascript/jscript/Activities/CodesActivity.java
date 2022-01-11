package com.javascript.jscript.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityCodesBinding;

import java.net.URISyntaxException;
import java.util.Objects;

public class CodesActivity extends AppCompatActivity {

    ActivityCodesBinding binding;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCodesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        CodesActivity.this.setTitle("Online Compiler");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //webview
        web = findViewById(R.id.webView);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new Callback());
        //Codepen
        web.loadUrl("https://codepen.io/shrcreation/pen/mdBpEYd");
        //web.loadUrl("https://rextester.com/l/js_online_compiler");

    }//ends of OnCreate

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack()) {
            web.goBack();
        } else {
            super.onBackPressed();
        }
    }

    //callback method
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith("intent")) {
                try {
                    Intent intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);
                    String fallbackUrl = intent.getStringExtra("browser_fallback_url");
                    if (fallbackUrl != null) {
                        view.loadUrl(fallbackUrl);
                        return true;
                    }
                } catch (URISyntaxException e) {
                    // Syntax problem with uri
                }
            }
            if (url.startsWith("tel:")) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
                startActivity(intent);
            } else if (url.startsWith("mailto:")) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(url));
                startActivity(intent);
            }
            view.loadUrl(url);
            return false;
        }

    }
}