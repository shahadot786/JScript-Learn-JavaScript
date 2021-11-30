package com.javascript.jscript.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.firebase.auth.FirebaseAuth;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Fragment.ProgramsFragment;
import com.javascript.jscript.Fragment.QuizFragment;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.javascript.jscript.Fragment.LearnFragment;
import com.javascript.jscript.Fragment.ProFragment;
import com.javascript.jscript.Fragment.ProfileFragment;
import com.javascript.jscript.R;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {

    private long exitTime = 0;
    ActivityMainBinding binding;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    AdView bannerAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        //by default fragment code
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new LearnFragment());
        transaction.commit();

        //ad declarations
        bannerAd = findViewById(R.id.adView);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(getResources().getString(R.string.banner_ad_unit_id));
        //load ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });
        //ad request
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        //ad click listener
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

        //bottom bar fragment listener
        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                //fragment replace
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //fragment replace switch case code
                switch (i){
                    case 0:
                        MainActivity.this.setTitle("Learn");
                        transaction.replace(R.id.container, new LearnFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 1:
                        MainActivity.this.setTitle("Quiz");
                        transaction.replace(R.id.container, new QuizFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 2:
                        MainActivity.this.setTitle("Programs");
                        transaction.replace(R.id.container, new ProgramsFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 3:
                        MainActivity.this.setTitle("Profile");
                        transaction.replace(R.id.container, new ProfileFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 4:
                        MainActivity.this.setTitle("PRO");
                        transaction.replace(R.id.container, new ProFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;

                }
                transaction.commit();
                return false;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            //follow us
            case R.id.follow_us:
                Intent intent4 = new Intent(MainActivity.this,FollowUsActivity.class);
                startActivity(intent4);
                return true;
            //feedback
            case R.id.feedback:
                Intent intent3 = new Intent(MainActivity.this,FeedBackActivity.class);
                startActivity(intent3);
                return true;
            case R.id.logout:
                //signOut
                auth.signOut();
                Intent intent = new Intent(MainActivity.this,SignInActivity.class);
                startActivity(intent);
                return true;
            case R.id.privacy:
                // Policy
                Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse(getString(R.string.url_play_privacy_policy)));
                startActivity(intent1);
                return true;
            case R.id.rate:
                //rate
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)));
                return true;
            case R.id.more_apps:
                //more apps
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_more_apps))));
                return true;
            case R.id.share:
                //share
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,getResources().getString(R.string.share_message) +"\n\n"+
                        "https://play.google.com/store/apps/details?id=" +
                        BuildConfig.APPLICATION_ID +"\n\n"+ getResources().getString(R.string.share_message2)
                        +"\n\n"+ getResources().getString(R.string.share_message3)
                        +"\n\n"+ getResources().getString(R.string.share_message4));
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //on back pressed
    @Override
    public void onBackPressed() {
        exitApp();
    }
    //exit app
    public void exitApp() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, getString(R.string.press_again_to_exit), Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finishAffinity();

        }
    }

}