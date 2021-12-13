package com.javascript.jscript.Activities;

import static com.android.billingclient.api.BillingClient.SkuType.INAPP;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.Security;
import com.javascript.jscript.databinding.ActivityPremiumBinding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PremiumActivity extends AppCompatActivity implements PurchasesUpdatedListener {

    ActivityPremiumBinding binding;
    private BillingClient billingClient;
    public static final String PREF_FILE= "JScript";
    public static final String PURCHASE_KEY= "one_time_product";
    public static final String PRODUCT_ID= "jscript_life_time";
    TextView itemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPremiumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        itemPrice = findViewById(R.id.itemPrice);
        //pro cancel button
        binding.proCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PremiumActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //privacy
        binding.privacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy))));
            }
        });
        //refund policy
        binding.refundPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(PremiumActivity.this, R.style.AppCompatAlertDialogStyle);
                dialog.setTitle(R.string.refund_policy);
                dialog.setMessage(R.string.refund_message);
                dialog.setPositiveButton(R.string.dialog_ok, (dialogInterface, i) -> finishActivity(11));
                dialog.show();
            }
        });

        // Establish connection to billing client
        //check subscription status from google play store cache
        //to check if item is already Subscribed or subscription is not renewed and cancelled
        billingClient = BillingClient.newBuilder(this).enablePendingPurchases().setListener(this).build();
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                if(billingResult.getResponseCode()==BillingClient.BillingResponseCode.OK){
                    billingClient.queryPurchasesAsync(INAPP, new PurchasesResponseListener() {
                        @Override
                        public void onQueryPurchasesResponse(@NonNull BillingResult billingResult, @NonNull List<Purchase> myPurchase) {
                            if (!myPurchase.isEmpty()){
                                handlePurchases(myPurchase);
                            }
                            //if no item in purchase list means subscription is not subscribed
                            //Or subscription is cancelled and not renewed for next month
                            // so update pref in both cases
                            // so next time on app launch our premium content will be locked
                            else{
                                savePurchaseValueToPref(false);
                            }
                        }
                    });
                }
            }

            @Override
            public void onBillingServiceDisconnected() {
                Toast.makeText(getApplicationContext(),"Service Disconnected",Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if service is already connected
                if (billingClient.isReady()) {
                    initiatePurchase();
                }
                //else reconnect service
                else{
                    billingClient = BillingClient.newBuilder(PremiumActivity.this).enablePendingPurchases().setListener(PremiumActivity.this).build();
                    billingClient.startConnection(new BillingClientStateListener() {
                        @Override
                        public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                            if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                                initiatePurchase();
                            } else {
                                Toast.makeText(getApplicationContext(),"Error "+billingResult.getDebugMessage(),Toast.LENGTH_SHORT).show();
                            }
                        }
                        @Override
                        public void onBillingServiceDisconnected() {
                            Toast.makeText(getApplicationContext(),"Service Disconnected ",Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

        //item subscribed
        if(getPurchaseValueFromPref()){
            UiConfig.INTERSTITIAL__AD_VISIBILITY = false;
            UiConfig.PRO_VISIBILITY_STATUS_SHOW = false;
            UiConfig.BANNER_AD_VISIBILITY = false;
            UiConfig.ENABLE_EXIT_DIALOG = false;
        }
        //item not subscribed
        else{
            UiConfig.INTERSTITIAL__AD_VISIBILITY = true;
            UiConfig.PRO_VISIBILITY_STATUS_SHOW = true;
            UiConfig.BANNER_AD_VISIBILITY = true;
            UiConfig.ENABLE_EXIT_DIALOG = true;
        }
    }

    private SharedPreferences getPreferenceObject() {
        return getApplicationContext().getSharedPreferences(PREF_FILE, 0);
    }
    private SharedPreferences.Editor getPreferenceEditObject() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences(PREF_FILE, 0);
        return pref.edit();
    }
    private boolean getPurchaseValueFromPref(){
        return getPreferenceObject().getBoolean( PURCHASE_KEY,false);
    }
    private void savePurchaseValueToPref(boolean value){
        getPreferenceEditObject().putBoolean(PURCHASE_KEY,value).commit();
    }

    private void initiatePurchase() {
        List<String> skuList = new ArrayList<>();
        skuList.add(PRODUCT_ID);
        SkuDetailsParams.Builder params = SkuDetailsParams.newBuilder();
        params.setSkusList(skuList).setType(INAPP);
        billingClient.querySkuDetailsAsync(params.build(),
                new SkuDetailsResponseListener() {
                    @Override
                    public void onSkuDetailsResponse(@NonNull BillingResult billingResult,
                                                     List<SkuDetails> skuDetailsList) {
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                            if (skuDetailsList != null && skuDetailsList.size() > 0) {
                                SkuDetails itemInfo = skuDetailsList.get(0);
                                BillingFlowParams flowParams = BillingFlowParams.newBuilder()
                                        .setSkuDetails(skuDetailsList.get(0))
                                        .build();
                                billingClient.launchBillingFlow(PremiumActivity.this, flowParams);
                                itemPrice.setText(itemInfo.getPrice());
                            } else {
                                //try to add item/product id "purchase" inside managed product in google play console
                                Toast.makeText(getApplicationContext(), "Purchase Item not Found", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    " Error " + billingResult.getDebugMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    public void onPurchasesUpdated(BillingResult billingResult, @Nullable List<Purchase> purchases) {
        //if item subscribed
        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && purchases != null) {
            handlePurchases(purchases);
            //other codes
            UiConfig.INTERSTITIAL__AD_VISIBILITY = false;
            UiConfig.PRO_VISIBILITY_STATUS_SHOW = false;
            UiConfig.BANNER_AD_VISIBILITY = false;
            UiConfig.ENABLE_EXIT_DIALOG = false;
            startActivity(new Intent(PremiumActivity.this,MainActivity.class));
        }
        //if item already purchased then check and reflect changes
        else if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.ITEM_ALREADY_OWNED) {
            Purchase.PurchasesResult queryAlreadyPurchasesResult = billingClient.queryPurchases(INAPP);

        }
        //if purchase cancelled
        else if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.USER_CANCELED) {
            Toast.makeText(getApplicationContext(), "Purchase Canceled", Toast.LENGTH_SHORT).show();
        }
        // Handle any other error msgs
        else {
            Toast.makeText(getApplicationContext(), "Error " + billingResult.getDebugMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    void handlePurchases(List<Purchase>  purchases) {
        for(Purchase purchase:purchases) {
            //if item is purchased
            if (PRODUCT_ID.equals(purchase.getSkus().get(0)) && purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED)
            {
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
                    if(!getPurchaseValueFromPref()){
                        savePurchaseValueToPref(true);
                        Toast.makeText(getApplicationContext(), "Item Purchased", Toast.LENGTH_SHORT).show();
                        this.recreate();
                    }
                }
            }
            //if purchase is pending
            else if( PRODUCT_ID.equals(purchase.getSkus().get(0)) && purchase.getPurchaseState() == Purchase.PurchaseState.PENDING)
            {
                Toast.makeText(getApplicationContext(),
                        "Purchase is Pending. Please complete Transaction", Toast.LENGTH_SHORT).show();
            }
            //if purchase is unknown mark false
            else if(PRODUCT_ID.equals(purchase.getSkus().get(0)) && purchase.getPurchaseState() == Purchase.PurchaseState.UNSPECIFIED_STATE)
            {
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
            if(billingResult.getResponseCode()==BillingClient.BillingResponseCode.OK){
                //if purchase is acknowledged
                // Grant entitlement to the user. and restart activity
                savePurchaseValueToPref(true);
                PremiumActivity.this.recreate();
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
        if(billingClient!=null){
            billingClient.endConnection();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(PremiumActivity.this,MainActivity.class);
        startActivity(intent);
    }
}