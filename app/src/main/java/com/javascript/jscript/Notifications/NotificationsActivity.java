package com.javascript.jscript.Notifications;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.applovin.mediation.ads.MaxAdView;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Adapter.NotificationsAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.NotificationsModel;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityNotificationsBinding;

import java.util.ArrayList;
import java.util.Objects;

public class NotificationsActivity extends AppCompatActivity {
    ActivityNotificationsBinding binding;
    ShimmerRecyclerView notificationRV;
    ArrayList<NotificationsModel> list;
    FirebaseDatabase database;
    SwipeRefreshLayout swipeRefreshLayout;
    Toast toast;
    TextView toastText;
    LayoutInflater inflater;
    View toastLayout;
    ImageView noNotification;
    TextView noNotifyText;
    private AdNetwork adNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationsBinding.inflate(getLayoutInflater());
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
        setSupportActionBar(binding.toolbar2);
        NotificationsActivity.this.setTitle("Notifications");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //find id's
        noNotification = findViewById(R.id.noNotifications);
        noNotifyText = findViewById(R.id.noNotifyText);
        database = FirebaseDatabase.getInstance();
        notificationRV = findViewById(R.id.notificationRV);
        notificationRV.showShimmerAdapter();
        swipeRefreshLayout = findViewById(R.id.swipeNotifications);
        list = new ArrayList<>();

        // ads
        adNetwork = new AdNetwork(this);
        adNetwork.loadBannerAd();
        //banner
        MaxAdView bannerAd = findViewById(R.id.adView);
        //check premium
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
            bannerAd.startAutoRefresh();
        } else {
            bannerAd.setVisibility(View.GONE);
            bannerAd.stopAutoRefresh();
        }

        NotificationsAdapter adapter = new NotificationsAdapter(list, NotificationsActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(NotificationsActivity.this, LinearLayoutManager.VERTICAL, false);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        notificationRV.setLayoutManager(layoutManager);
        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(NotificationsActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network

        } else {
            toastText.setText(R.string.no_connection_text);
            toast.show();
        }
        //set notification value
        database.getReference()
                .child("Notifications")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                .addValueEventListener(new ValueEventListener() {
                    @SuppressLint("NotifyDataSetChanged")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        list.clear();
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                            NotificationsModel notificationsModel = dataSnapshot.getValue(NotificationsModel.class);
                            assert notificationsModel != null;
                            notificationsModel.setNotificationId(dataSnapshot.getKey());
                            list.add(notificationsModel);

                        }
                        //check list is empty
                        if (list.isEmpty()) {
                            noNotification.setVisibility(View.VISIBLE);
                            noNotifyText.setVisibility(View.VISIBLE);
                        }else {
                            noNotification.setVisibility(View.GONE);
                            noNotifyText.setVisibility(View.GONE);
                        }
                        notificationRV.setAdapter(adapter);
                        notificationRV.hideShimmerAdapter();
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
        //set swipe refresh value
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onRefresh() {
                //check network
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(NotificationsActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    database.getReference()
                            .child("Notifications")
                            .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                            .addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot) {
                                    list.clear();
                                    for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                                        NotificationsModel notificationsModel = dataSnapshot.getValue(NotificationsModel.class);
                                        assert notificationsModel != null;
                                        notificationsModel.setNotificationId(dataSnapshot.getKey());
                                        list.add(notificationsModel);
                                    }
                                    //check list is empty
                                    if (list.isEmpty()) {
                                        noNotification.setVisibility(View.VISIBLE);
                                        noNotifyText.setVisibility(View.VISIBLE);
                                    }
                                    notificationRV.setAdapter(adapter);
                                    notificationRV.hideShimmerAdapter();

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });
                    adapter.notifyDataSetChanged();
                    swipeRefreshLayout.setRefreshing(false);
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                    notificationRV.hideShimmerAdapter();
                    swipeRefreshLayout.setRefreshing(false);
                }
            }
        });

    }//ends of onCreate

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}