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
        //loads books uri
        loadBooksURI();

    }//on create ends

    private void loadBooksURI() {
        String uri = null;
        switch (getIntent().getStringExtra("booksUri")){
            case "A Smarter Way to Learn JavaScript":
                uri = BooksURI.ASmarterWaytoLearnJavaScript;
                break;
            case "Eloquent Javascript":
                uri = BooksURI.EloquentJavascript;
                break;
            case "JavaScript The Good Parts":
                uri = BooksURI.JavaScriptTheGoodParts;
                break;
            case "JavaScript and JQuery Interactive":
                uri = BooksURI.JavaScriptandJQueryInteractive;
                break;
            case "JavaScript The Definitive Guide":
                uri = BooksURI.JavaScriptTheDefinitiveGuide;
                break;
            case "JavaScript For Beginners":
                uri = BooksURI.JavaScriptForBeginners;
                break;
            case "Beginning HTML, XHTML, CSS and JavaScript":
                uri = BooksURI.BeginningHTMLXHTMLCSSandJavaScript;
                break;
            case "Head First JavaScript Programming":
                uri = BooksURI.HeadFirstJavaScriptProgramming;
                break;
            case "O'Reilly Head First JavaScript":
                uri = BooksURI.OReillyHeadFirstJavaScript;
                break;
            case "Learn Javascript Visually":
                uri = BooksURI.LearnJavascriptVisually;
                break;
            case "You Don’t Know JS":
                uri = BooksURI.YouDontKnowJS;
                break;
            case "Understanding ECMAScript 6":
                uri = BooksURI.UnderstandingECMAScript6;
                break;
            case "Effective JavaScript":
                uri = BooksURI.EffectiveJavaScript;
                break;
            case "Core JavaScript Objects, and Functions":
                uri = BooksURI.CoreJavaScriptObjectsandFunctions;
                break;
            case "JavaScript Objects":
                uri = BooksURI.JavaScriptObjects;
                break;
            case "JavaScript Object Programming":
                uri = BooksURI.JavaScriptObjectProgramming;
                break;
            case "JavaScript Functions objects and Arrays":
                uri = BooksURI.JavaScriptFunctionsobjectsandArrays;
                break;
            case "The Principles of Object Oriented JavaScript":
                uri = BooksURI.ThePrinciplesofObjectOrientedJavaScript;
                break;
            case "Object Oriented JavaScript 2nd Edition":
                uri = BooksURI.ObjectOrientedJavaScript2ndEdition;
                break;
            case "Object Oriented JavaScript 3rd Edition":
                uri = BooksURI.ObjectOrientedJavaScript3ndEdition;
                break;
            case "Mastering JavaScript Object-Oriented Programming":
                uri = BooksURI.MasteringJavaScriptObjectOrientedProgramming;
                break;
            case "Object-Oriented JavaScript-Stefanov":
                uri = BooksURI.ObjectOrientedJavaScriptStefanov;
                break;
            case "The Object-Oriented Thought Process":
                uri = BooksURI.TheObjectOrientedThoughtProcess;
                break;
            case "Functional Programming in JavaScript":
                uri = BooksURI.FunctionalProgramminginJavaScript;
                break;
            case "DOM Enlightenment":
                uri = BooksURI.DOMEnlightenment;
                break;
            case "DOM Scripting Web Design with JavaScript":
                uri = BooksURI.DOMScriptingWebDesignwithJavaScript;
                break;
            case "Beginning JavaScript with DOM Scripting and Ajax":
                uri = BooksURI.BeginningJavaScriptwithDOMScriptingandAjax;
                break;
            case "JavaScript, DOM Scripting and Ajax Projects":
                uri = BooksURI.JavaScriptDOMScriptingandAjaxProjects;
                break;
            case "DOM Scripting: Web Design with JavaScript and Model":
                uri = BooksURI.DOMScriptingWebDesignwithJavaScriptandModel;
                break;
            case "Professional JavaScript for Web Developers":
                uri = BooksURI.ProfessionalJavaScriptforWebDevelopers;
                break;
            case "JavaScript Creativity: Exploring the Modern Capabilities of JavaScript and HTML5":
                uri = BooksURI.JavaScriptCreativityExploringtheModernCapabilitiesofJavaScriptandHTML5;
                break;
            case "HTML, CSS & JavaScript Web Publishing in One Hour a Day":
                uri = BooksURI.HTMLCSSJavaScriptWebPublishingOneHourDay;
                break;
            case "The Advanced Game Developer's Toolkit: Create Amazing Web-based Games with JavaScript":
                uri = BooksURI.TheAdvancedGameDevelopersToolkit;
                break;
            case "Introduction to JavaScript Object Notation":
                uri = BooksURI.IntroductiontoJavaScriptObjectNotation;
                break;
            case "JavaScript Bible":
                uri = BooksURI.JavaScriptBible;
                break;
            case "JavaScript Patterns":
                uri = BooksURI.JavaScriptPatterns;
                break;
            case "Advanced JavaScript Essentials":
                uri = BooksURI.AdvancedJavaScriptEssentials;
                break;
            case "Sam's Teach Yourself HTML, CSS, and JavaScript All in One":
                uri = BooksURI.SamsTeachYourselfHTML;
                break;
            case "Learn Javascript by Chuck Easttom":
                uri = BooksURI.LearnJavascriptbyChuckEasttom;
                break;
            case "JavaScript The Complete Reference":
                uri = BooksURI.JavaScriptTheCompleteReference;
                break;
            case "Ajax: The Complete Reference":
                uri = BooksURI.AjaxTheCompleteReference;
                break;
            case "Head First Ajax":
                uri = BooksURI.HeadFirstAjax;
                break;
            case "Ajax The Definitive Guide Anthony T. Holdener III":
                uri = BooksURI.AjaxTheDefinitiveGuide;
                break;
            case "Professional Ajax":
                uri = BooksURI.ProfessionalAjax;
                break;
            case "Foundations of Ajax":
                uri = BooksURI.FoundationsofAjax;
                break;
            case "AJAX and PHP":
                uri = BooksURI.AJAXandPHP;
                break;
            case "AJAX: A Beginner’s Guide":
                uri = BooksURI.AJAXABeginnersGuide;
                break;
            case "JavaScript & AJAX for Dummies":
                uri = BooksURI.JavaScriptAJAXforDummies;
                break;
            case "Programming ASP.NET AJAX: Build rich, Web 2.0-style UI with ASP.NET AJAX":
                uri = BooksURI.ProgrammingASPBuild;
                break;
            case "Wordpress and Ajax: An In-Depth Guide on Using Ajax With WordPress":
                uri = BooksURI.WordpressandAjax;
                break;
            case "What is TypeScript?":
                uri = BooksURI.WhatisTypeScript;
                break;
            case "TypeScript Essentials":
                uri = BooksURI.TypeScriptEssentials;
                break;
            case "Programming TypeScript: Making Your JavaScript Applications Scale":
                uri = BooksURI.ProgrammingTypeScriptMakingYour;
                break;
            case "Effective TypeScript: 62 Specific Ways to Improve Your TypeScript":
                uri = BooksURI.EffectiveTypeScript;
                break;
            case "Mastering TypeScript: Build Enterprise-ready, Modular Web Applications Using TypeScript 4":
                uri = BooksURI.MasteringTypeScriptBuildEnterprise;
                break;
            case "Essential Typescript: From Beginner To Pro":
                uri = BooksURI.EssentialTypescriptFromBeginnerToPro;
                break;
            case "TypeScript Microservices: Build, deploy, and secure Microservices using TypeScript":
                uri = BooksURI.TypeScriptMicroservicesBuild;
                break;
            case "TypeScript Quickly":
                uri = BooksURI.TypeScriptQuickly;
                break;
            case "Angular 2 Development with TypeScript":
                uri = BooksURI.Angular2DevelopmentwithTypeScript;
                break;
            case "Pro TypeScript: Application-Scale JavaScript Development":
                uri = BooksURI.ProTypeScriptApplicationScaleJavaScriptDevelopment;
                break;
            case "Mastering TypeScript 2nd Edition":
                uri = BooksURI.MasteringTypeScript2ndEdition;
                break;
            case "TypeScript Modern JavaScript Development":
                uri = BooksURI.TypeScriptModernJavaScriptDevelopment;
                break;
            case "Decorators in TypeScript":
                uri = BooksURI.DecoratorsTypeScript;
                break;
            case "":
                uri = BooksURI.uri3;
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