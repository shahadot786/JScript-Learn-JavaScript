package com.javascript.jscript.Activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.Security;
import com.javascript.jscript.databinding.ActivityPremium2Binding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PremiumActivity2 extends AppCompatActivity {
    ActivityPremium2Binding binding;
    BillingClient billingClient;
    public static final String PREF_FILE = "JScript";
    public static final String PURCHASE_KEY = "one_time_product";
    public static final String PRODUCT_ID = "jsctipt_test";
    Button btnSubscribe;
    TextView itemName, itemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPremium2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnSubscribe = findViewById(R.id.btnSubscribe);
        itemName = findViewById(R.id.itemTitle);
        itemPrice = findViewById(R.id.itemPrice);
        billingClient = BillingClient.newBuilder(this)
                .enablePendingPurchases()
                .setListener(new PurchasesUpdatedListener() {
                    @Override
                    public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && list != null) {
                            for (Purchase purchase : list) {
                                if (purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED &&
                                        !purchase.isAcknowledged()) {
                                    handlePurchases(list);
                                    //other codes
                                    UiConfig.INTERSTITIAL__AD_VISIBILITY = false;
                                    UiConfig.PRO_VISIBILITY_STATUS_SHOW = false;
                                    UiConfig.BANNER_AD_VISIBILITY = false;
                                    UiConfig.ENABLE_EXIT_DIALOG = false;
                                    startActivity(new Intent(PremiumActivity2.this, MainActivity.class));
                                } else {
                                    savePurchaseValueToPref(false);
                                }
                            }
                        }
                    }
                }).build();

        connectToGooglePlayBilling();

        //item subscribed
        if (getPurchaseValueFromPref()) {
            UiConfig.INTERSTITIAL__AD_VISIBILITY = false;
            UiConfig.PRO_VISIBILITY_STATUS_SHOW = false;
            UiConfig.BANNER_AD_VISIBILITY = false;
            UiConfig.ENABLE_EXIT_DIALOG = false;
        }
        //item not subscribed
        else {
            UiConfig.INTERSTITIAL__AD_VISIBILITY = true;
            UiConfig.PRO_VISIBILITY_STATUS_SHOW = true;
            UiConfig.BANNER_AD_VISIBILITY = true;
            UiConfig.ENABLE_EXIT_DIALOG = true;
        }

    }//ends of onCreate

    private SharedPreferences getPreferenceObject() {
        return getApplicationContext().getSharedPreferences(PREF_FILE, 0);
    }

    private SharedPreferences.Editor getPreferenceEditObject() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences(PREF_FILE, 0);
        return pref.edit();
    }

    private boolean getPurchaseValueFromPref() {
        return getPreferenceObject().getBoolean(PURCHASE_KEY, false);
    }

    private void savePurchaseValueToPref(boolean value) {
        getPreferenceEditObject().putBoolean(PURCHASE_KEY, value).commit();
    }


    private void connectToGooglePlayBilling() {
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingServiceDisconnected() {
                connectToGooglePlayBilling();
                Toast.makeText(getApplicationContext(), "Service Disconnected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                    getProductDetails();
                }
            }
        });
    }

    private void getProductDetails() {
        List<String> productIds = new ArrayList<>();
        productIds.add("jsctipt_test");
        SkuDetailsParams getProductDetailsQuery = SkuDetailsParams
                .newBuilder()
                .setSkusList(productIds)
                .setType(BillingClient.SkuType.INAPP)
                .build();

        Activity activity = this;
        billingClient.querySkuDetailsAsync(
                getProductDetailsQuery,
                new SkuDetailsResponseListener() {
                    @Override
                    public void onSkuDetailsResponse(@NonNull BillingResult billingResult, @Nullable List<SkuDetails> list) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && list != null) {

                            SkuDetails itemInfo = list.get(0);
                            itemName.setText(itemInfo.getTitle());
                            itemPrice.setText(itemInfo.getPrice());
                            btnSubscribe.setOnClickListener(
                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            billingClient.launchBillingFlow(
                                                    activity,
                                                    BillingFlowParams.newBuilder().setSkuDetails(itemInfo).build()
                                            );
                                        }
                                    }
                            );

                        }
                    }
                }
        );

    }

    void handlePurchases(List<Purchase> purchases) {
        for (Purchase purchase : purchases) {
            //if item is purchased
            if (PRODUCT_ID.equals(purchase.getSkus().get(0)) && purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED) {
                if (!verifyValidSignature(purchase.getOriginalJson(), purchase.getSignature())) {
                    // Invalid purchase
                    // show error to user
                    Toast.makeText(getApplicationContext(), "Error : invalid Purchase", Toast.LENGTH_SHORT).show();
                    return;
                }
                // else purchase is valid
                //if item is purchased and not acknowledged
                if (!purchase.isAcknowledged()) {
                    AcknowledgePurchaseParams acknowledgePurchaseParams =
                            AcknowledgePurchaseParams.newBuilder()
                                    .setPurchaseToken(purchase.getPurchaseToken())
                                    .build();
                    billingClient.acknowledgePurchase(acknowledgePurchaseParams, ackPurchase);
                }
                //else item is purchased and also acknowledged
                else {
                    // Grant entitlement to the user on item purchase
                    // restart activity
                    if (!getPurchaseValueFromPref()) {
                        savePurchaseValueToPref(true);
                        Toast.makeText(getApplicationContext(), "Item Purchased", Toast.LENGTH_SHORT).show();
                        this.recreate();
                    }
                }
            }
            //if purchase is pending
            else if (PRODUCT_ID.equals(purchase.getSkus().get(0)) && purchase.getPurchaseState() == Purchase.PurchaseState.PENDING) {
                Toast.makeText(getApplicationContext(),
                        "Purchase is Pending. Please complete Transaction", Toast.LENGTH_SHORT).show();
            }
            //if purchase is unknown mark false
            else if (PRODUCT_ID.equals(purchase.getSkus().get(0)) && purchase.getPurchaseState() == Purchase.PurchaseState.UNSPECIFIED_STATE) {
                savePurchaseValueToPref(false);
                UiConfig.INTERSTITIAL__AD_VISIBILITY = true;
                UiConfig.PRO_VISIBILITY_STATUS_SHOW = true;
                UiConfig.BANNER_AD_VISIBILITY = true;
                UiConfig.ENABLE_EXIT_DIALOG = true;
                Toast.makeText(getApplicationContext(), "Purchase Status Unknown", Toast.LENGTH_SHORT).show();
            }
        }
    }

    AcknowledgePurchaseResponseListener ackPurchase = new AcknowledgePurchaseResponseListener() {
        @Override
        public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
            if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                //if purchase is acknowledged
                // Grant entitlement to the user. and restart activity
                savePurchaseValueToPref(true);
                PremiumActivity2.this.recreate();
            }
        }
    };

    /**
     * Verifies that the purchase was signed correctly for this developer's public key.
     * <p>Note: It's strongly recommended to perform such check on your backend since hackers can
     * replace this method with "constant true" if they decompile/rebuild your app.
     * </p>
     */

    private boolean verifyValidSignature(String signedData, String signature) {
        try {
            // To get key go to Developer Console > Select your app > Development Tools > Services & APIs.
            String base64Key = getResources().getString(R.string.play_console_license_key);
            return Security.verifyPurchase(base64Key, signedData, signature);
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (billingClient != null) {
            billingClient.endConnection();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(PremiumActivity2.this, MainActivity.class);
        startActivity(intent);
    }

}