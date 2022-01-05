package com.javascript.jscript.Model;

public class PremiumModel {
    boolean BannerAd = true;
    boolean InterstitialAd = true;
    int AdInterval = 4;
    boolean ProVisibility = true;

    public PremiumModel() {
    }

    public boolean isBannerAd() {
        return BannerAd;
    }

    public void setBannerAd(boolean bannerAd) {
        BannerAd = bannerAd;
    }

    public boolean isInterstitialAd() {
        return InterstitialAd;
    }

    public void setInterstitialAd(boolean interstitialAd) {
        InterstitialAd = interstitialAd;
    }

    public int getAdInterval() {
        return AdInterval;
    }

    public void setAdInterval(int adInterval) {
        AdInterval = adInterval;
    }

    public boolean isProVisibility() {
        return ProVisibility;
    }

    public void setProVisibility(boolean proVisibility) {
        ProVisibility = proVisibility;
    }
}
