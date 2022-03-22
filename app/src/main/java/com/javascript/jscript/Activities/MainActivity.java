package com.javascript.jscript.Activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Fragment.DiscussFragment;
import com.javascript.jscript.Fragment.HomeFragment;
import com.javascript.jscript.Fragment.ProFragment;
import com.javascript.jscript.Fragment.ProfileFragment;
import com.javascript.jscript.Fragment.QuizFragment;
import com.javascript.jscript.Model.NotificationsModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.Notifications.NotificationsActivity;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityMainBinding;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

import me.ibrahimsn.lib.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;
    FirebaseAuth auth;
    FirebaseDatabase database;
    private long exitTime = 0;
    private AdView bannerAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //toolbar
        setSupportActionBar(binding.toolbar);
        //firebase instance
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
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
                bannerAd = findViewById(R.id.adView);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAd.loadAd(adRequest);
                if (UiConfig.BANNER_AD_VISIBILITY) {
                    bannerAd.setVisibility(View.VISIBLE);
                }
            }
        });

        //MediationTestSuite.launch(MainActivity.this);
        //by default fragment code
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        binding.toolbar.setVisibility(View.VISIBLE);
        MainActivity.this.setTitle(getResources().getString(R.string.jscript_learn_javascript));
        transaction.replace(R.id.container, new HomeFragment());
        transaction.commit();


        //bottom bar fragment listener
        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                //fragment replace
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //fragment replace switch case code
                switch (i) {
                    case 0:
                        binding.toolbar.setVisibility(View.VISIBLE);
                        MainActivity.this.setTitle(getResources().getString(R.string.jscript_learn_javascript));
                        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                        transaction.replace(R.id.container, new HomeFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY) {
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 1:
                        binding.toolbar.setVisibility(View.VISIBLE);
                        MainActivity.this.setTitle("Quiz");
                        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                        transaction.replace(R.id.container, new QuizFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY) {
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 2:
                        binding.toolbar.setVisibility(View.VISIBLE);
                        MainActivity.this.setTitle("Discuss");
                        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                        transaction.replace(R.id.container, new DiscussFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY) {
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;

                    case 3:
                        binding.toolbar.setVisibility(View.VISIBLE);
                        MainActivity.this.setTitle("Profile");
                        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                        transaction.replace(R.id.container, new ProfileFragment());
                        if (UiConfig.BANNER_AD_VISIBILITY) {
                            bannerAd.setVisibility(View.VISIBLE);
                        }
                        break;
                    case 4:
                        binding.toolbar.setVisibility(View.GONE);
                        MainActivity.this.setTitle("PRO");
                        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
                            Intent intent = new Intent(MainActivity.this, PremiumActivity.class);
                            startActivity(intent);
                        } else {
                            transaction.replace(R.id.container, new ProFragment());
                        }
                        if (UiConfig.BANNER_AD_VISIBILITY) {
                            bannerAd.setVisibility(View.GONE);
                        }
                        break;

                }
                transaction.commit();
                return false;
            }
        });
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
                            String types = model.getType();
                            String question = model.getQuestion();

                            if (types.equals("likes")) {
                                boolean checkOpens = model.isCheckOpen();
                                if (!checkOpens) {
                                    String typeText = " liked your post ";
                                    //get user data
                                    database.getReference()
                                            .child("UserData")
                                            .child(model.getNotificationBy()).addValueEventListener(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                                            Activity context = MainActivity.this;
                                            UserModel notifyUserName = snapshot.getValue(UserModel.class);
                                            assert notifyUserName != null;
                                            String notificationByUserName = notifyUserName.getUserName();
                                            //get posted userName
                                            database.getReference()
                                                    .child("UserData")
                                                    .child(model.getPostedBy())
                                                    .addValueEventListener(new ValueEventListener() {
                                                        @Override
                                                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                            UserModel model1 = snapshot.getValue(UserModel.class);
                                                            assert model1 != null;
                                                            String postedByUserName = model1.getUserName();
                                                            //if build version is over oreo
                                                            //notification channel
                                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                                NotificationChannel channel = new NotificationChannel("JScript Notifications", "Discuss", NotificationManager.IMPORTANCE_DEFAULT);
                                                                NotificationManager manager = context.getSystemService(NotificationManager.class);
                                                                manager.createNotificationChannel(channel);
                                                            }
                                                            //notifications sound
                                                            Uri notifySound = RingtoneManager
                                                                    .getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                                                            //generate random number
                                                            Random random = new Random();
                                                            int notificationNumber = random.nextInt(9999 - 1000) + 1000;
                                                            //large icon
                                                            Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_main_icon_round);
                                                            //notification intent
                                                            Intent intent = new Intent(context, NotificationsActivity.class);
                                                            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_MUTABLE);
                                                            //notification builder
                                                            NotificationCompat.Builder commentBuilder = new NotificationCompat.Builder(context, "JScript Notifications");
                                                            commentBuilder.setContentTitle("Hi! " + postedByUserName + " \uD83D\uDC9A");
                                                            commentBuilder.setSmallIcon(R.drawable.jscript_notifications);
                                                            commentBuilder.setLargeIcon(largeIcon);
                                                            commentBuilder.setAutoCancel(true);
                                                            commentBuilder.setSound(notifySound);
                                                            commentBuilder.setVibrate(new long[]{100, 250, 100, 250, 100, 250});
                                                            commentBuilder.setContentIntent(pendingIntent);
                                                            commentBuilder.setContentText(Html.fromHtml("\"<span style=\"font-weight:bold; color:#15c55d\">" +
                                                                    notificationByUserName + "" + "</span>\"" + typeText + "(" + question + ")"));
                                                            //notification manager
                                                            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
                                                            managerCompat.notify(notificationNumber, commentBuilder.build());
                                                        }

                                                        @Override
                                                        public void onCancelled(@NonNull DatabaseError error) {

                                                        }
                                                    });
                                        }

                                        @Override
                                        public void onCancelled(@NonNull DatabaseError error) {

                                        }
                                    });
                                }
                            }
                            //likes
                            /*else if (types.equals("likes")){
                                boolean checkOpens = model.isCheckOpen();
                                if (!checkOpens) {
                                    String typeText = " like on your post answer";
                                    //get user data
                                    database.getReference()
                                            .child("UserData")
                                            .child(model.getNotificationBy()).addValueEventListener(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                                            Activity context = MainActivity.this;
                                            UserModel userModel = snapshot.getValue(UserModel.class);
                                            assert userModel != null;
                                            //if build version is over oreo
                                            //notification channel
                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                NotificationChannel channel = new NotificationChannel("JScript Notifications", "Discuss", NotificationManager.IMPORTANCE_DEFAULT);
                                                NotificationManager manager = context.getSystemService(NotificationManager.class);
                                                manager.createNotificationChannel(channel);
                                            }
                                            //notifications sound
                                            Uri notifySound = RingtoneManager
                                                    .getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                                            //generate random number
                                            Random random = new Random();
                                            int notificationNumber = random.nextInt(9999 - 1000) + 1000;
                                            //large icon
                                            Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_main_icon_round);
                                            //notification intent
                                            Intent intent = new Intent(context, NotificationsActivity.class);
                                            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
                                            //notification builder
                                            NotificationCompat.Builder commentBuilder = new NotificationCompat.Builder(context, "JScript Notifications");
                                            commentBuilder.setContentTitle("JScript: Learn JavaScript");
                                            commentBuilder.setSmallIcon(R.drawable.ic_notification_small_icon);
                                            commentBuilder.setLargeIcon(largeIcon);
                                            commentBuilder.setAutoCancel(true);
                                            commentBuilder.setSound(notifySound);
                                            commentBuilder.setVibrate(new long[]{100, 250, 100, 250, 100, 250});
                                            commentBuilder.setContentIntent(pendingIntent);
                                            commentBuilder.setContentText(Html.fromHtml("\"<span style=\"font-weight:bold; color:#15c55d\">" +
                                                    userModel.getUserName() + "" + "</span>\"" + typeText));
                                            //notification manager
                                            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
                                            managerCompat.notify(notificationNumber, commentBuilder.build());
                                        }

                                        @Override
                                        public void onCancelled(@NonNull DatabaseError error) {

                                        }
                                    });
                                }
                            }*/

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
        //check database value
        /*database.getReference()
                .child("UserData")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        UserModel model = snapshot.getValue(UserModel.class);
                        assert model != null;
                        boolean checkPremium = model.isCheckPremium();
                        if (checkPremium){
                            UiConfig.REWARDED__AD_VISIBILITY = false;
                            UiConfig.INTERSTITIAL__AD_VISIBILITY = false;
                            UiConfig.PRO_VISIBILITY_STATUS_SHOW = false;
                            UiConfig.BANNER_AD_VISIBILITY = false;
                            UiConfig.ENABLE_EXIT_DIALOG = false;
                        }else {
                            UiConfig.REWARDED__AD_VISIBILITY = true;
                            UiConfig.INTERSTITIAL__AD_VISIBILITY = true;
                            UiConfig.PRO_VISIBILITY_STATUS_SHOW = true;
                            UiConfig.BANNER_AD_VISIBILITY = true;
                            UiConfig.ENABLE_EXIT_DIALOG = true;
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });*/
    }//finished onCreate

    //on create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        //after upgrade to pro
        menu.findItem(R.id.upgrade_pro).setVisible(UiConfig.PRO_VISIBILITY_STATUS_SHOW);

        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            //upgrade pro
            case R.id.upgrade_pro:
                Intent proIntent = new Intent(MainActivity.this, PremiumActivity.class);
                startActivity(proIntent);
                return true;
            //share
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Learn JavaScript");
                sendIntent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.share_message) + "\n\n" +
                        "https://play.google.com/store/apps/details?id=" +
                        BuildConfig.APPLICATION_ID + "\n\n" + getResources().getString(R.string.share_message2)
                        + "\n\n" + getResources().getString(R.string.share_message3)
                        + "\n\n" + getResources().getString(R.string.share_message4));
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                return true;
            //feedback
            case R.id.feedback:
                Intent intent3 = new Intent(MainActivity.this, FeedBackActivity.class);
                startActivity(intent3);
                return true;
            //rate now
            case R.id.rate:
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(MainActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)));
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
                return true;
            //follow us
            case R.id.follow_us:
                Intent intent4 = new Intent(MainActivity.this, FollowUsActivity.class);
                startActivity(intent4);
                return true;
            //more apps
            case R.id.more_apps:
                //network check
                ConnectivityManager connectivityManager2 = (ConnectivityManager) getSystemService(MainActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager2.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager2.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_more_apps))));
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
                return true;
            //privacy policy
            case R.id.privacy:
                //network check
                ConnectivityManager connectivityManager3 = (ConnectivityManager) getSystemService(MainActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager3.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager3.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy)));
                    startActivity(intent1);
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
                return true;
            //contact us
            case R.id.contact_us:
                //network check
                ConnectivityManager connectivityManager4 = (ConnectivityManager) getSystemService(MainActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager4.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager4.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "info@shrcreation.com")));
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
                return true;
            //logout
            case R.id.logout:
                Intent intent;
                //if user upgrade to pro
                if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
                    intent = new Intent(MainActivity.this, SignOutActivity.class);
                } else {
                    intent = new Intent(MainActivity.this, SignInActivity.class);
                    auth.signOut();
                }
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //on back pressed
    @Override
    public void onBackPressed() {
        if (UiConfig.ENABLE_EXIT_DIALOG) {
            exitDialog();
        } else {
            exitApp();
        }
    }

    //on exit app
    public void exitApp() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, getString(R.string.press_again_to_exit), Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finishAffinity();
        }
    }

    //on Exit Dialog
    public void exitDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this, R.style.AppCompatAlertDialogStyle);
        dialog.setTitle(R.string.dialog_close_title);
        dialog.setMessage(R.string.dialog_close_msg);
        dialog.setPositiveButton(R.string.dialog_option_quit, (dialogInterface, i) -> finishAffinity());

        dialog.setNegativeButton(R.string.dialog_option_rate_us, (dialogInterface, i) -> {
            final String appName = getPackageName();
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appName)));
            }
            finish();
        });
        dialog.setNeutralButton(R.string.feedback, ((dialogInterface, i) -> {
            startActivity(new Intent(MainActivity.this, FeedBackActivity.class));
            finish();
        }));
        /*dialog.setNeutralButton(R.string.dialog_option_more, (dialogInterface, i) -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_more_apps))));
            finish();
        });*/
        dialog.show();
    }

}