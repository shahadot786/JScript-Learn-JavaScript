package com.javascript.jscript.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivitySignOutBinding;
import com.squareup.picasso.Picasso;

public class SignOutActivity extends AppCompatActivity {
    ActivitySignOutBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;
    private AdView mRecAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignOutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //instance of firebase
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        //toolbar
        setSupportActionBar(binding.toolbar4);
        SignOutActivity.this.setTitle("Sign Out");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //get database value
        database.getReference().child("Users").child(auth.getUid())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            UserModel user = snapshot.getValue(UserModel.class);
                            assert user != null;
                            binding.userName.setText(user.getUserName());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //ad initialization
        mRecAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mRecAd.loadAd(adRequest);

        //cancel button
        binding.cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                Intent intent = new Intent(SignOutActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

        //ads disabled code
        if (UiConfig.BANNER_AD_VISIBILITY){
            mRecAd.setVisibility(View.VISIBLE);
        }


    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}