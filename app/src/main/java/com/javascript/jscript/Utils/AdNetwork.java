package com.javascript.jscript.Utils;

import static android.content.ContentValues.TAG;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Quiz.QuizDetailsActivity;
import com.javascript.jscript.R;

public class AdNetwork {

    private InterstitialAd mInterstitialAd;
    private RewardedAd mRewardedAd;
    private final Activity context;
    int counter = 1;

    public AdNetwork(Activity context) {
        this.context = context;
    }

    //load ad
    public void loadInterstitialAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(context, context.getString(R.string.interstitial_ad_unit_id), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                Log.d(TAG, "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                mInterstitialAd = null;
                                Log.d(TAG, "The ad was shown.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                loadInterstitialAd();
                            }
                        });
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                        Log.d(TAG, "Failed load AdMob Interstitial Ad");
                    }
                });
    }

    //show ad
    public void showInterstitialAd(){
        if (UiConfig.INTERSTITIAL__AD_VISIBILITY){
            if (mInterstitialAd != null){
                if (counter == UiConfig.INTERSTITIAL_AD_INTERVAL){
                    mInterstitialAd.show(context);
                    counter = 1;
                }else {
                    counter++;
                }
            }
        }
        /*if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            if (mInterstitialAd !=null){
                if (counter == UiConfig.INTERSTITIAL_AD_INTERVAL){
                    mInterstitialAd.show(context);
                    counter = 1;
                }else {
                    counter++;
                }
            }
        }*/

    }

    //load rewarded ad
    public void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(context, context.getString(R.string.rewarded_ad_unit_id),
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                    }
                });
    }
    //show rewarded ad
    public void showRewardedAd() {
        if (UiConfig.REWARDED__AD_VISIBILITY){
            if (mRewardedAd != null){
                mRewardedAd.show(context, new OnUserEarnedRewardListener() {
                    @Override
                    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                        Toast.makeText(context, "Remove Time", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }



}
