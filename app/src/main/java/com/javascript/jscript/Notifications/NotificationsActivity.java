package com.javascript.jscript.Notifications;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.EditProfileActivity;
import com.javascript.jscript.Adapter.NotificationsAdapter;
import com.javascript.jscript.Model.NotificationsModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityNotificationsBinding;

import java.util.ArrayList;
import java.util.Objects;

public class NotificationsActivity extends AppCompatActivity {
    ActivityNotificationsBinding binding;
    RecyclerView notificationRV;
    ArrayList<NotificationsModel> list;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar
        setSupportActionBar(binding.toolbar2);
        NotificationsActivity.this.setTitle("Notifications");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //find id's
        database = FirebaseDatabase.getInstance();
        notificationRV = findViewById(R.id.notificationRV);
        list = new ArrayList<>();


        NotificationsAdapter adapter = new NotificationsAdapter(list,NotificationsActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(NotificationsActivity.this,LinearLayoutManager.VERTICAL,false);
        notificationRV.setLayoutManager(layoutManager);
        notificationRV.setAdapter(adapter);

        database.getReference()
                .child("Notifications")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        list.clear();
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                            NotificationsModel notificationsModel = dataSnapshot.getValue(NotificationsModel.class);
                            assert notificationsModel != null;
                            notificationsModel.setNotificationId(dataSnapshot.getKey());
                            list.add(notificationsModel);

                        }
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

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