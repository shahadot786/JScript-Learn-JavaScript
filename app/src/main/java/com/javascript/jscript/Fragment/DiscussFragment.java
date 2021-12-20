package com.javascript.jscript.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Adapter.DiscussAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Discuss.AddDiscussActivity;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.Notifications.NotificationsActivity;
import com.javascript.jscript.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Objects;

public class DiscussFragment extends Fragment {

    ShimmerRecyclerView recyclerView;
    FirebaseAuth auth;
    FirebaseDatabase database;
    ArrayList<DiscussModel> dashboardList;
    SwipeRefreshLayout swipeRefreshLayout;
    ImageView search,notification;

    public DiscussFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discuss, container, false);
        setHasOptionsMenu(true);
        //find id
        search = view.findViewById(R.id.search);
        notification  = view.findViewById(R.id.notification);
        //recyclerview
        recyclerView = view.findViewById(R.id.rv_discuss);
        recyclerView.showShimmerAdapter();
        //pro status
        ImageView proBadge = view.findViewById(R.id.proBadge);
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proBadge.setVisibility(View.GONE);
        } else {
            proBadge.setVisibility(View.VISIBLE);
        }
        //notification click listener
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),NotificationsActivity.class));
            }
        });
        //text input click
        View discuss_view = view.findViewById(R.id.discuss_view);
        discuss_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AddDiscussActivity.class));
            }
        });
        //firebase instance
        TextView userName = view.findViewById(R.id.userName);
        ImageView profileImage = view.findViewById(R.id.profileImage);
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        database.getReference().child("UserData").child(Objects.requireNonNull(auth.getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            UserModel user = snapshot.getValue(UserModel.class);
                            assert user != null;
                            Picasso.get()
                                    .load(user.getProfile())
                                    .placeholder(R.drawable.ic_profile_default_image)
                                    .into(profileImage);
                            userName.setText(user.getUserName());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        dashboardList = new ArrayList<>();
        DiscussAdapter discussAdapter = new DiscussAdapter(dashboardList, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);


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
                            dashboardList.add(model);
                        }
                        recyclerView.setAdapter(discussAdapter);
                        recyclerView.hideShimmerAdapter();
                        discussAdapter.notifyDataSetChanged();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //find swipe refresh
        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshDiscuss);
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
                                    dashboardList.add(model);
                                }
                                recyclerView.setAdapter(discussAdapter);
                                recyclerView.hideShimmerAdapter();
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                discussAdapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        return view;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}