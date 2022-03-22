package com.javascript.jscript.Books;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityReadBooksBinding;

import java.net.URISyntaxException;
import java.util.Map;
import java.util.Objects;


public class ReadBooksActivity extends AppCompatActivity {
    ActivityReadBooksBinding binding;
    WebView webView;

    @SuppressLint({"SetJavaScriptEnabled", "MissingPermission"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReadBooksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //find id
        webView = findViewById(R.id.booksWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setBackgroundColor(getResources().getColor(R.color.colorBlack));
        webView.setWebViewClient(new Callback());
        //ad request
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                Map<String, AdapterStatus> statusMap = initializationStatus.getAdapterStatusMap();
                for (String adapterClass : statusMap.keySet()) {
                    AdapterStatus status = statusMap.get(adapterClass);
                    Log.d("JScript", String.format(
                            "Adapter name: %s, Description: %s, Latency: %d",
                            adapterClass, status.getDescription(), status.getLatency()));
                }

                // Start loading ads here...
                //ad request
                AdView bannerAd = findViewById(R.id.adView);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAd.loadAd(adRequest);
                if (UiConfig.BANNER_AD_VISIBILITY) {
                    bannerAd.setVisibility(View.VISIBLE);
                } else {
                    bannerAd.setVisibility(View.GONE);
                }
            }
        });
        //toolbar
        setSupportActionBar(binding.toolbar2);
        ReadBooksActivity.this.setTitle("Read Online Ebooks");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //loads books uri
        loadBooksURI();

    }//on create ends

    private void loadBooksURI() {
        String uri = null;
        switch (getIntent().getStringExtra("booksUri")) {
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
            case "Angular in Action":
                uri = BooksURI.AngularinAction;
                break;
            case "Pro Angular":
                uri = BooksURI.ProAngular;
                break;
            case "Pro Angular 9 Build Powerful and Dynamic Web Apps":
                uri = BooksURI.ProAngular9BuildPowerful;
                break;
            case "Angular for Enterprise Ready Web Applications":
                uri = BooksURI.AngularforEnterpriseReadyWebApplications;
                break;
            case "Angular: Up and Running: Learning Angular":
                uri = BooksURI.AngularUpandRunningLearningAngular;
                break;
            case "Learn With: Angular 4: Collected Essays: Angular CLI, Unit Testing, Debugging TypeScript, and Angular":
                uri = BooksURI.LearnWithAngular4CollectedEssaysAngularCLI;
                break;
            case "Angular 5 Projects: Learn to Build Single Page Web Applications Using 70+ Projects":
                uri = BooksURI.Angular5ProjectsLearntoBuildSinglePage;
                break;
            case "Essential Angular for ASP.NET Core MVC":
                uri = BooksURI.EssentialAngularforASPNETCoreMVC;
                break;
            case "Getting MEAN with Mongo, Express, Angular, and Node":
                uri = BooksURI.GettingMEANMongoExpressAngularNode;
                break;
            case "Vue.js in Action":
                uri = BooksURI.VuejsinAction;
                break;
            case "Fullstack VueJS":
                uri = BooksURI.FullstackVueJS;
                break;
            case "Vue.js Up and Running: Building Accessible and Performant Web Apps":
                uri = BooksURI.VuejsUpandRunning;
                break;
            case "Pro Vue.js 2":
                uri = BooksURI.ProVuejs2;
                break;
            case "Learning Vue.js 2":
                uri = BooksURI.LearningVuejs2;
                break;
            case "The Next.js Handbook":
                uri = BooksURI.TheNextHandbook;
                break;
            case "Learning React: Modern Patterns for Developing React Apps":
                uri = BooksURI.LearningReactModernPatternsforDeveloping;
                break;
            case "Fullstack React:The Complete Guide to ReactJS and Friends":
                uri = BooksURI.FullstackReactTheCompleteGuide;
                break;
            case "React in Action":
                uri = BooksURI.ReactAction;
                break;
            case "Learning React: Functional Web Development with React and Redux":
                uri = BooksURI.LearningReactFunctionalWebDevelopment;
                break;
            case "The Road to React":
                uri = BooksURI.TheRoadtoReact;
                break;
            case "React Quickly: Painless Web Apps with React, JSX, Redux and GraphQL":
                uri = BooksURI.ReactQuicklyPainlessWebAppswithReact;
                break;
            case "React Cookbook: Recipes for Mastering the React Framework":
                uri = BooksURI.ReactCookbookRecipesforMasteringtheReactFramework;
                break;
            case "Mastering Full-Stack React Web Development":
                uri = BooksURI.MasteringFullStackReactWebDevelopment;
                break;
            case "React.js Essentials":
                uri = BooksURI.ReactjsEssentials;
                break;
            case "Ember.js in Action":
                uri = BooksURI.EmberjsinAction;
                break;
            case "Ember.js Guides":
                uri = BooksURI.EmberjsGuides;
                break;
            case "Web App Development Book Guide to Ember.js":
                uri = BooksURI.WebAppDevelopmentBookGuide;
                break;
            case "Building Web Apps with Ember.js":
                uri = BooksURI.BuildingWebAppswithEmberjs;
                break;
            case "Mastering Ember.js":
                uri = BooksURI.MasteringEmberjs;
                break;
            case "Bootstrap: Responsive Web Development":
                uri = BooksURI.BootstrapResponsiveWebDevelopment;
                break;
            case "Mastering Bootstrap 4":
                uri = BooksURI.MasteringBootstrap4;
                break;
            case "Introducing Bootstrap 4":
                uri = BooksURI.IntroducingBootstrap4;
                break;
            case "Learning Bootstrap 4":
                uri = BooksURI.LearningBootstrap4;
                break;
            case "An introduction to the bootstrap":
                uri = BooksURI.Anintroductiontothebootstrap;
                break;
            case "Practical Bootstrap: Learn to Develop Responsively with One of the Most Popular CSS Frameworks":
                uri = BooksURI.PracticalBootstrapLearntoDevelopResponsively;
                break;
            case "Pro MERN Stack Full Stack Web App Development with Mongo, Express, React, and Node":
                uri = BooksURI.ProMERNStackFullStackWebAppDevelopment;
                break;
            case "Front-end Development with ASP.NET Core, Angular, and Bootstrap":
                uri = BooksURI.FrontendDevelopmentwithASPNETCore;
                break;
            case "Beginning Node.js":
                uri = BooksURI.BeginningNodejs;
                break;
            case "Web Development with Node and Express Leveraging the javascript Stack":
                uri = BooksURI.WebDevelopmentwithNodeandExpress;
                break;
            case "Node.js 8 the Right Way: Practical, Server-Side JavaScript That Scales":
                uri = BooksURI.Nodejs8theRightWayPractical;
                break;
            case "Node.js in Action":
                uri = BooksURI.NodejsinAction;
                break;
            case "Practical Node.Js: Building Real-World Scalable Web Apps":
                uri = BooksURI.PracticalNodeJsBuildingRealWorldScalableWebApps;
                break;
            case "Manning Node.js in Practice":
                uri = BooksURI.ManningNodejsinPractice;
                break;
            case "Node.js Design Patterns":
                uri = BooksURI.NodejsDesignPatterns;
                break;
            case "SitePoint Full Stack JavaScript Development with MEAN, MongoDB Express AngularJS and Node.js":
                uri = BooksURI.SitePointFullStackJavaScriptDevelopmentwithMEAN;
                break;
            case "Pro REST API Development with Node.js":
                uri = BooksURI.ProRESTAPIDevelopmentwithNodejs;
                break;
            case "Node.js for PHP Developers: Porting PHP to Node.js":
                uri = BooksURI.NodejsforPHPDevelopersPortingPHP;
                break;
            case "Node.js, MongoDB and Angular Web Development":
                uri = BooksURI.NodejsMongoDBandAngularWebDevelopment;
                break;
            case "Express in Action":
                uri = BooksURI.ExpressinAction;
                break;
            case "Express.js Guide":
                uri = BooksURI.ExpressjsGuide;
                break;
            case "Pro Express.js":
                uri = BooksURI.ProExpressjs;
                break;
            case "Express.js: Guide Book on Web framework for Node.js":
                uri = BooksURI.ExpressjsGuideBookonWebframework;
                break;
            case "Laravel 5 Essentials":
                uri = BooksURI.Laravel5Essentials;
                break;
            case "Laravel: Up & Running: A Framework for Building Modern PHP Apps":
                uri = BooksURI.LaravelUpRunningAFrameworkfor;
                break;
            case "Mastering Laravel":
                uri = BooksURI.MasteringLaravel;
                break;
            case "Laravel for Beginners":
                uri = BooksURI.LaravelforBeginners;
                break;
            case "Beginning Laravel":
                uri = BooksURI.BeginningLaravel;
                break;
            case "Laravel 5.1 Beauty: Creating Beautiful Web Apps with Laravel 5.1":
                uri = BooksURI.Laravel51BeautyCreating;
                break;
            case "Learning Laravel Eloquent":
                uri = BooksURI.LearningLaravelEloquent;
                break;
            case "Design Patterns in PHP and Laravel":
                uri = BooksURI.DesignPatternsinPHPandLaravel;
                break;
            case "Easy Laravel 5":
                uri = BooksURI.EasyLaravel5;
                break;
            case "Laravel 5 Cookbook":
                uri = BooksURI.Laravel5Cookbook;
                break;
            case "Laravel: Code Bright":
                uri = BooksURI.LaravelCodeBright;
                break;
            case "JavaScript and JQuery: Interactive Front-End Web Development":
                uri = BooksURI.JavaScriptandJQueryInteractiveFront;
                break;
            case "Learning jQuery":
                uri = BooksURI.LearningjQuery;
                break;
            case "jQuery in Action":
                uri = BooksURI.jQueryinAction;
                break;
            case "JQuery Cookbook":
                uri = BooksURI.JQueryCookbook;
                break;
            case "JQuery Pocket Reference":
                uri = BooksURI.JQueryPocketReference;
                break;
            case "jQuery UI in Action":
                uri = BooksURI.jQueryUIinAction;
                break;
            case "Head First jQuery":
                uri = BooksURI.HeadFirstjQuery;
                break;
            case "Pro PHP and jQuery, 2nd Edition":
                uri = BooksURI.ProPHPjQuery2ndEdition;
                break;
            case "JQuery 1.4 animation techniques beginner's guide":
                uri = BooksURI.JQuery14animationtechniques;
                break;
            case "Beginning jQuery":
                uri = BooksURI.BeginningjQuery;
                break;
            case "jQuery UI 1.6 - The User Interface Library for jQuery":
                uri = BooksURI.jQueryUI16TheUserInterfaceLibraryjQuery;
                break;
            case "Web Development with jQuery":
                uri = BooksURI.WebDevelopmentwithjQuery;
                break;
            case "Beginning jQuery 2 for ASP.NET Developers":
                uri = BooksURI.BeginningjQuery2forASPNETDevelopers;
                break;
            case "jQuery For Dummies":
                uri = BooksURI.jQueryForDummies;
                break;
            case "Learning PHP, MySQL & JavaScript: With jQuery, CSS & HTML5":
                uri = BooksURI.LearningPHPMySQLJavaScriptWithjQueryCSSHTML5;
                break;
        }
        webView.loadUrl(uri);

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


}