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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.auth.FirebaseAuth;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Fragment.DiscussFragment;
import com.javascript.jscript.Fragment.HomeFragment;
import com.javascript.jscript.Fragment.ProFragment;
import com.javascript.jscript.Fragment.ProfileFragment;
import com.javascript.jscript.Fragment.QuizFragment;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityMainBinding;


import me.ibrahimsn.lib.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {

    private long exitTime = 0;
    ActivityMainBinding binding;
    private AdView bannerAd;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        auth = FirebaseAuth.getInstance();

        //by default fragment code
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        binding.toolbar.setVisibility(View.VISIBLE);
        MainActivity.this.setTitle(getResources().getString(R.string.jscript_learn_javascript));
        transaction.replace(R.id.container, new HomeFragment());
        transaction.commit();

        //ad request
        bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);

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
                            bannerAd.setVisibility(View.GONE);
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
    }//finished onCreate

    //on create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        //after upgrade to pro
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            menu.findItem(R.id.upgrade_pro).setVisible(true);
        } else {
            menu.findItem(R.id.upgrade_pro).setVisible(false);
        }

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
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)));
                return true;
            //follow us
            case R.id.follow_us:
                Intent intent4 = new Intent(MainActivity.this, FollowUsActivity.class);
                startActivity(intent4);
                return true;
            //more apps
            case R.id.more_apps:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_more_apps))));
                return true;
            //privacy policy
            case R.id.privacy:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy)));
                startActivity(intent1);
                return true;
            //contact us
            case R.id.contact_us:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:" + "info@shrcreation.com")));
                return true;
            //logout
            case R.id.logout:
                Intent intent;
                //if user upgrade to pro
                if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
                    intent = new Intent(MainActivity.this, SignOutActivity.class);
                } else {
                    intent = new Intent(MainActivity.this, GoogleSignInActivity.class);
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