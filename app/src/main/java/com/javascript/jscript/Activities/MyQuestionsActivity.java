package com.javascript.jscript.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.applovin.mediation.ads.MaxAdView;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
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
import com.javascript.jscript.Adapter.DiscussAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
import com.javascript.jscript.databinding.ActivityMyQuestionsBinding;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class MyQuestionsActivity extends AppCompatActivity {

    ActivityMyQuestionsBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;
    View empty;
    TextView emptyText,emptySubText;
    ShimmerRecyclerView recyclerView;
    ArrayList<DiscussModel> dashboardList;
    SwipeRefreshLayout swipeRefreshLayout;
    private AdNetwork adNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyQuestionsBinding.inflate(getLayoutInflater());
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
        MyQuestionsActivity.this.setTitle("Questions");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

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

        //empty view
        empty = findViewById(R.id.emptyList);
        emptyText = findViewById(R.id.empty);
        emptySubText = findViewById(R.id.emptyListText);
        //recyclerview
        recyclerView = findViewById(R.id.rv_discuss);
        recyclerView.showShimmerAdapter();
        //database instance
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        dashboardList = new ArrayList<>();
        DiscussAdapter discussAdapter = new DiscussAdapter(dashboardList, MyQuestionsActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MyQuestionsActivity.this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);

        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(MyQuestionsActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            toastText.setText(R.string.network_connected);
        } else {
            toastText.setText(R.string.no_connection_text);
            toast.show();
        }

        database.getReference().child("Discuss")
                .addValueEventListener(new ValueEventListener() {
                    @SuppressLint("NotifyDataSetChanged")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        dashboardList.clear();
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                            DiscussModel model = dataSnapshot.getValue(DiscussModel.class);
                            assert model != null;
                            model.setPostId(dataSnapshot.getKey());
                            String posted = FirebaseAuth.getInstance().getUid();
                            String postedBy = model.getPostedBy();
                            assert posted != null;
                            if (posted.equals(postedBy)){
                                dashboardList.add(model);
                            }
                        }
                        recyclerView.setAdapter(discussAdapter);
                        recyclerView.hideShimmerAdapter();
                        discussAdapter.notifyDataSetChanged();

                        if (dashboardList.isEmpty()){
                            emptyText.setVisibility(View.VISIBLE);
                            emptySubText.setVisibility(View.VISIBLE);
                            empty.setVisibility(View.VISIBLE);
                        }else {
                            emptyText.setVisibility(View.GONE);
                            emptySubText.setVisibility(View.GONE);
                            empty.setVisibility(View.GONE);
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //find swipe refresh
        swipeRefreshLayout = findViewById(R.id.swipeRefreshDiscuss);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onRefresh() {
                recyclerView.showShimmerAdapter();
                database.getReference().child("Discuss")
                        .addValueEventListener(new ValueEventListener() {
                            @SuppressLint("NotifyDataSetChanged")
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                dashboardList.clear();
                                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                                    DiscussModel model = dataSnapshot.getValue(DiscussModel.class);
                                    assert model != null;
                                    model.setPostId(dataSnapshot.getKey());
                                    String posted = FirebaseAuth.getInstance().getUid();
                                    String postedBy = model.getPostedBy();
                                    assert posted != null;
                                    if (posted.equals(postedBy)){
                                        dashboardList.add(model);
                                    }
                                }
                                recyclerView.setAdapter(discussAdapter);
                                recyclerView.hideShimmerAdapter();
                                discussAdapter.notifyDataSetChanged();

                                if (dashboardList.isEmpty()){
                                    emptyText.setVisibility(View.VISIBLE);
                                    emptySubText.setVisibility(View.VISIBLE);
                                    empty.setVisibility(View.VISIBLE);
                                }else {
                                    emptyText.setVisibility(View.GONE);
                                    emptySubText.setVisibility(View.GONE);
                                    empty.setVisibility(View.GONE);
                                }

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                discussAdapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });






    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}