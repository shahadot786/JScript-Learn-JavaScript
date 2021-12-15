package com.javascript.jscript.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
import com.javascript.jscript.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Objects;

public class DiscussFragment extends Fragment {

    RecyclerView recyclerView;
    FirebaseAuth auth;
    FirebaseDatabase database;
    ArrayList<DiscussModel> dashboardList;

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
        //pro status
        View proView2 = view.findViewById(R.id.proTextView);
        TextView proText2 = view.findViewById(R.id.proText2);
        //conditions
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW){
            proView2.setVisibility(View.GONE);
            proText2.setVisibility(View.GONE);
        }else {
            proView2.setVisibility(View.VISIBLE);
            proText2.setVisibility(View.VISIBLE);
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
                        if (snapshot.exists()){
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

        //recyclerview
        recyclerView = view.findViewById(R.id.rv_discuss);
        dashboardList = new ArrayList<>();

        DiscussAdapter discussAdapter = new DiscussAdapter(dashboardList,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(discussAdapter);


        database.getReference().child("Discuss")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        dashboardList.clear();
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                            DiscussModel model = dataSnapshot.getValue(DiscussModel.class);
                            dashboardList.add(model);
                        }

                        discussAdapter.notifyDataSetChanged();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


        return view;
    }

    //on create option menu

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        MenuItem menuItem = menu.findItem(R.id.settings);
        menuItem.setVisible(false);
        inflater.inflate(R.menu.menu_discuss,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}