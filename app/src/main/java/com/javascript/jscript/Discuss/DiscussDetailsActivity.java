package com.javascript.jscript.Discuss;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.CommentModel;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityDiscussDetailsBinding;
import com.squareup.picasso.Picasso;

import java.util.Date;
import java.util.Objects;

public class DiscussDetailsActivity extends AppCompatActivity {
    ActivityDiscussDetailsBinding binding;
    Intent intent;
    String postId, postedBy;
    FirebaseDatabase database;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscussDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //get data by intent
        intent = getIntent();
        postId = intent.getStringExtra("postId");
        postedBy = intent.getStringExtra("postedBy");
        //database instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //toolbar
        setSupportActionBar(binding.toolbar2);
        DiscussDetailsActivity.this.setTitle("Q&A Discussions");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //banner
        AdView bannerAd = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);
        if (UiConfig.BANNER_AD_VISIBILITY) {
            bannerAd.setVisibility(View.VISIBLE);
        } else {
            bannerAd.setVisibility(View.GONE);
        }
        //get post data
        database.getReference()
                .child("Discuss")
                .child(postId).addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                DiscussModel discuss = snapshot.getValue(DiscussModel.class);
                assert discuss != null;
                String time = TimeAgo.using(discuss.getPostedAt());
                binding.question.setText(discuss.getQuestions());
                binding.descriptions.setText(discuss.getDescription());
                binding.views.setText(discuss.getPostViews() + "");
                binding.time.setText(time);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //get user data
        database.getReference()
                .child("UserData")
                .child(postedBy).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserModel user = snapshot.getValue(UserModel.class);
                assert user != null;
                Picasso.get()
                        .load(user.getProfile())
                        .placeholder(R.drawable.ic_profile_default_image)
                        .into(binding.profileImage);
                binding.userName.setText(user.getUserName());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //get user profession
        database.getReference()
                .child("UpdateProfile")
                .child(postedBy).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                ProfileModel model = snapshot.getValue(ProfileModel.class);
                assert model != null;
                binding.profession.setText(model.getProfession());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //reply codes
        binding.commentPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CommentModel comment = new CommentModel();
                comment.setCommentBody(binding.commentET.getText().toString());
                comment.setCommentAt(new Date().getTime());
                comment.setCommentedBy(FirebaseAuth.getInstance().getUid());
                //get comment data
                database.getReference()
                        .child("Discuss")
                        .child(postId)
                        .child("comments")
                        .push()
                        .setValue(comment).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(@NonNull Void unused) {
                        database.getReference()
                                .child("Discuss")
                                .child(postId)
                                .child("commentCount").addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                int commentCount = 0;
                                if (snapshot.exists()) {
                                    commentCount = snapshot.getValue(Integer.class);
                                }
                                database.getReference()
                                        .child("Discuss")
                                        .child(postId)
                                        .child("commentCount")
                                        .setValue(commentCount + 1).addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(@NonNull Void unused) {
                                        Toast.makeText(DiscussDetailsActivity.this, "Commented", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
                    }
                });

            }
        });

    }//ends of OnCreate

    //option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_discuss_share, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //share button click
        //get post data
        if (item.getItemId() == R.id.shareQA) {
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Learn JavaScript in JScript & solve problems." + "\n" +
                    "https://play.google.com/store/apps/details?id=" +
                    BuildConfig.APPLICATION_ID);
            shareIntent.setType("text/plain");
            startActivity(shareIntent);
            //fetch firebase database
            database.getReference()
                    .child("Discuss")
                    .child(postId)
                    .child("shareCount").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    int shareCount = 0;
                    if (snapshot.exists()) {
                        shareCount = snapshot.getValue(Integer.class);
                    }
                    database.getReference()
                            .child("Discuss")
                            .child(postId)
                            .child("shareCount")
                            .setValue(shareCount + 1).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(@NonNull Void unused) {

                        }
                    });
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            return true;
        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}