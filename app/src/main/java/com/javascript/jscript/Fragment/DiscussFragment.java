package com.javascript.jscript.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.FeedBackActivity;
import com.javascript.jscript.Adapter.DiscussAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Discuss.AddDiscussActivity;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.NotificationsModel;
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
    TextView toastText;
    View toastLayout;
    Toast toast;
    View dotView;

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
        //find dot view
        dotView = view.findViewById(R.id.dotViews);
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) view.findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getActivity().getBaseContext());
        toast.setGravity(Gravity.BOTTOM, 0, 200);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
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

        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(FeedBackActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
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
    //on create option menu

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        MenuItem menuItem = menu.findItem(R.id.settings);
        menuItem.setVisible(false);
        inflater.inflate(R.menu.menu_discuss, menu);
        final MenuItem menuItem1 = menu.findItem(R.id.notification);
        menuItem1.setVisible(true);
        //notification icon change
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
                                menuItem1.setIcon(R.drawable.ic_notification_active_24);
                            }else {
                                menuItem1.setIcon(R.drawable.ic_notification_icon);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.notification) {
            startActivity(new Intent(getContext(), NotificationsActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
   /* SearchView searchView = (SearchView) item.getActionView();
        searchView.setQueryHint("Search questions...");
        searchView.setBackgroundResource(R.drawable.ic_programs_image_bg);
    //text
    EditText txtSearch = ((EditText)searchView.findViewById(androidx.appcompat.R.id.search_src_text));
        txtSearch.setHintTextColor(getResources().getColor(R.color.textColorPlaceholder));
        txtSearch.setTextColor(Color.WHITE);
    //query listener
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String s) {
            processsearch(s);
            return false;
        }

        @Override
        public boolean onQueryTextChange(String s) {
            processsearch(s);
            return false;
        }
    });
        super.onCreateOptionsMenu(menu, inflater);

}

    private void processsearch(String s) {
    }*/

