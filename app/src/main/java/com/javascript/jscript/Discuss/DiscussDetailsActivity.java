package com.javascript.jscript.Discuss;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Adapter.CommentAdapter;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.CommentModel;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.NotificationsModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityDiscussDetailsBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class DiscussDetailsActivity extends AppCompatActivity {
    ActivityDiscussDetailsBinding binding;
    Intent intent;
    String postId, postedBy, question, description;
    FirebaseDatabase database;
    FirebaseAuth auth;
    ArrayList<CommentModel> list = new ArrayList<>();
    SwipeRefreshLayout swipeRefreshLayout;
    ShimmerRecyclerView commentShimmer;
    private boolean connected = false;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscussDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //swipe refresh
        swipeRefreshLayout = findViewById(R.id.swipeRefreshComment);
        commentShimmer = findViewById(R.id.commentRv);
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
                //for share data
                assert discuss != null;
                question = discuss.getQuestions();
                description = discuss.getDescription();
                //check description is empty
                if (description.isEmpty()){
                    binding.descriptions.setVisibility(View.GONE);
                }else {
                    binding.descriptions.setVisibility(View.VISIBLE);
                }
                //set data to id's
                String time = TimeAgo.using(discuss.getPostedAt());
                String views = discuss.getPostViews()+"";
                String comments = discuss.getCommentCount() + "";
                String shares = discuss.getShareCount() + "";
                binding.time.setText(time);
                binding.question.setText(question);
                binding.descriptions.setText(description);
                //1K and 1M views logic
                int view = Integer.parseInt(views);
                if (view >= 1000){
                    binding.views.setText((view / 1000)+"."+((view % 1000)/100)+"K");
                }else {
                    binding.views.setText(views);
                }
                if (view >= 1000000){
                    binding.views.setText((view / 1000000)+"."+((view % 1000000)/10000)+"M");
                }
                //1K and 1M comments logic
                int comment = Integer.parseInt(comments);
                if (comment >= 1000){
                    binding.comment.setText((comment / 1000)+"."+((comment % 1000)/100)+"K");
                }else {
                    binding.comment.setText(comments);
                }
                if (comment >= 1000000){
                    binding.comment.setText((comment / 1000000)+"."+((comment % 1000000)/10000)+"M");
                }
                //1K and 1M shares logic
                int share = Integer.parseInt(shares);
                if (share >= 1000){
                    binding.share.setText((share / 1000)+"."+((share % 1000)/100)+"K");
                }else {
                    binding.share.setText(shares);
                }
                if (share >= 1000000){
                    binding.share.setText((share / 1000000)+"."+((share % 1000000)/10000)+"M");
                }

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
        //reply codes
        binding.commentPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(DiscussDetailsActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                    if (commentValidation()) {
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
                                                binding.commentET.setText("");
                                                NotificationsModel notifications = new NotificationsModel();
                                                notifications.setNotificationBy(FirebaseAuth.getInstance().getUid());
                                                notifications.setNotificationAt(new Date().getTime());
                                                notifications.setPostId(postId);
                                                notifications.setPostedBy(postedBy);
                                                notifications.setType("comment");

                                                FirebaseDatabase.getInstance().getReference()
                                                        .child("Notifications")
                                                        .child(postedBy)
                                                        .push()
                                                        .setValue(notifications).addOnSuccessListener(new OnSuccessListener<Void>() {
                                                    @Override
                                                    public void onSuccess(@NonNull Void unused) {
                                                    }
                                                });

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

                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                    connected = false;
                }
            }
        });
        //get commented data
        CommentAdapter adapter = new CommentAdapter(this, list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        binding.commentRv.setLayoutManager(layoutManager);
        binding.commentRv.setAdapter(adapter);
        //get database data
        database.getReference()
                .child("Discuss")
                .child(postId)
                .child("comments")
                .addValueEventListener(new ValueEventListener() {
                    @SuppressLint("NotifyDataSetChanged")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        list.clear();
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                            CommentModel comment = dataSnapshot.getValue(CommentModel.class);
                            assert comment != null;
                            comment.setPostID(postId);
                            comment.setPostedBy(postedBy);
                            comment.setCommentID(dataSnapshot.getKey());
                            list.add(comment);
                        }
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //swipe refresh layout
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onRefresh() {
                commentShimmer.showShimmerAdapter();
                database.getReference()
                        .child("Discuss")
                        .child(postId)
                        .child("comments")
                        .addValueEventListener(new ValueEventListener() {
                            @SuppressLint("NotifyDataSetChanged")
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                list.clear();
                                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                                    CommentModel comment = dataSnapshot.getValue(CommentModel.class);
                                    assert comment != null;
                                    comment.setPostID(postId);
                                    comment.setPostedBy(postedBy);
                                    comment.setCommentID(dataSnapshot.getKey());
                                    list.add(comment);
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                adapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
                commentShimmer.hideShimmerAdapter();
            }
        });
    }//ends of OnCreate

    //comment button empty validation
    public boolean commentValidation() {
        String comment = binding.commentET.getText().toString();
        if (comment.isEmpty()) {
            binding.commentET.setError("Text is required");
            return false;
        } else {
            binding.commentET.setError(null);
            return true;
        }
    }

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
            addShareData();
            return true;
        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    //share data intent method
    public void addShareData() {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Q&A Discussions");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Question: "+question + "\n\n" + "Descriptions: \n\n"+description +
                "\n\nLearn JavaScript in JScript & solve problems.\n" +
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

    }


}