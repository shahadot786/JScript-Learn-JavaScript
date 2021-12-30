package com.javascript.jscript.Activities;

import static com.javascript.jscript.Activities.PremiumActivity.PURCHASE_KEY;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.R;

public class SplashActivity extends AppCompatActivity {

    Animation bottomAnim;
    TextView slogan;
    FirebaseUser currentUser;
    FirebaseAuth auth;
    FirebaseDatabase database;
    private boolean connected = false;
    final String PREFS_NAME = "JScript_for_new_user";//change every update
    public static final String PREF_FILE = "JScript_Learn_JavaScript";
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,40);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(FeedBackActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }else {
            toastText.setText(R.string.no_connection_text);
            toast.show();
            connected = false;
        }
        //animations
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //hooks
        slogan = findViewById(R.id.slogan_text);
        //set animations
        slogan.setAnimation(bottomAnim);
        auth = FirebaseAuth.getInstance();
        currentUser = auth.getCurrentUser();
        database = FirebaseDatabase.getInstance();
        database.setPersistenceEnabled(true);
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
        ///check first time installer
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        //Variables
        int SPLASH_SCREEN = 40000;
        if (settings.getBoolean("my_first_time", true)) {
            //the app is being launched for first time, do something
            //Log.d("Comments", "First time");
            // first time task
            //handler for change activity
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashActivity.this, NextActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_SCREEN);

            // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).apply();
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent;
                    //check user currently sign in or not
                    if (currentUser != null) {
                        //after upgrade to pro
                        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
                            intent = new Intent(SplashActivity.this, PremiumActivity.class);
                        } else {
                            intent = new Intent(SplashActivity.this, MainActivity.class);
                        }
                    } else {
                        intent = new Intent(SplashActivity.this, SignInActivity.class);
                    }
                    startActivity(intent);
                }
            }, SPLASH_SCREEN);
        }
    }

    private SharedPreferences getPreferenceObject() {
        return getApplicationContext().getSharedPreferences(PREF_FILE, 0);
    }

    private boolean getPurchaseValueFromPref() {
        return getPreferenceObject().getBoolean(PURCHASE_KEY, false);
    }

}