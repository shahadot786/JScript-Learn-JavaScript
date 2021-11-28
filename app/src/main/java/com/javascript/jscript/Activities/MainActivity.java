package com.javascript.jscript.Activities;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.javascript.jscript.Fragment.DiscussFragment;
import com.javascript.jscript.Fragment.FeedsFragment;
import com.javascript.jscript.Fragment.LearnFragment;
import com.javascript.jscript.Fragment.ProFragment;
import com.javascript.jscript.Fragment.ProfileFragment;
import com.javascript.jscript.R;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    AdView bannerAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //by default fragment code
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new FeedsFragment());
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
                        transaction.replace(R.id.container, new FeedsFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 1:
                        transaction.replace(R.id.container, new LearnFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.GONE);
                        }
                        break;
                    case 2:
                        transaction.replace(R.id.container, new DiscussFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 3:
                        transaction.replace(R.id.container, new ProfileFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.GONE);
                        }
                        break;
                    case 4:
                        transaction.replace(R.id.container, new ProFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY){
                            bannerAd.setVisibility(View.GONE);
                        }
                        break;
                }
                transaction.commit();
                return false;
            }
        });



    }
}