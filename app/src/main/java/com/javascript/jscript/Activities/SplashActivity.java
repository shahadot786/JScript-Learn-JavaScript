package com.javascript.jscript.Activities;

import static com.javascript.jscript.Activities.PremiumActivity.PURCHASE_KEY;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.NotificationsModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.Notifications.NotificationsActivity;
import com.javascript.jscript.R;

import java.util.Objects;

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
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(FeedBackActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        } else {
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
        int SPLASH_SCREEN = 8000;
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
        //check discuss notifications
        database.getReference()
                .child("Notifications")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                            NotificationsModel model = dataSnapshot.getValue(NotificationsModel.class);
                            assert model != null;
                            boolean checkOpens = model.isCheckOpen();
                            if (!checkOpens) {
                                //get user data
                                database.getReference()
                                        .child("UserData")
                                        .child(model.getNotificationBy()).addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        Activity context = SplashActivity.this;
                                        UserModel userModel = snapshot.getValue(UserModel.class);
                                        assert userModel != null;
                                        //if build version is over oreo
                                        //notification channel
                                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                            NotificationChannel channel = new NotificationChannel("JScript Notifications", "Discuss", NotificationManager.IMPORTANCE_DEFAULT);
                                            NotificationManager manager = context.getSystemService(NotificationManager.class);
                                            manager.createNotificationChannel(channel);
                                        }
                                        //notification intent
                                        Intent intent = new Intent(context, NotificationsActivity.class);
                                        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
                                        //notification builder
                                        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "JScript Notifications");
                                        //builder.setContentTitle("JScript: Learn JavaScript");
                                        builder.setContentText(Html.fromHtml("<span style=\"font-weight:bold; color:#15c55d\">" +
                                                userModel.getUserName() + " " + "</span>" + " Reply on your question"));
                                        builder.setSmallIcon(R.drawable.ic_notification_small_icon);
                                        builder.setAutoCancel(true);
                                        builder.setContentIntent(pendingIntent);

                                        //notification manager
                                        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
                                        managerCompat.notify(1, builder.build());
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error) {

                                    }
                                });
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

    }

    private SharedPreferences getPreferenceObject() {
        return getApplicationContext().getSharedPreferences(PREF_FILE, 0);
    }

    private boolean getPurchaseValueFromPref() {
        return getPreferenceObject().getBoolean(PURCHASE_KEY, false);
    }
}