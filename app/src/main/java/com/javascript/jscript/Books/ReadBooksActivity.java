package com.javascript.jscript.Books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityReadBooksBinding;

import java.net.URISyntaxException;
import java.util.Objects;



public class ReadBooksActivity extends AppCompatActivity {
    ActivityReadBooksBinding binding;
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReadBooksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //find id
        webView = findViewById(R.id.booksWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new Callback());
        //ad request
        AdView bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY){
            bannerAd.setVisibility(View.VISIBLE);
        }else {
            bannerAd.setVisibility(View.GONE);
        }
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ReadBooksActivity.this.setTitle("Read Books");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        loadBooksURI();

    }//on create ends

    private void loadBooksURI() {
        String uri = null;
        switch (getIntent().getStringExtra("booksUri")){
            case "Books":
                uri = BooksURI.uri;
                break;
            case "Books1":
                uri = BooksURI.uri1;
                break;
            case "angular":
                uri = BooksURI.uri2;
                break;
        }
        webView.loadUrl(uri);

    }

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
            return true;
        }

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }


}