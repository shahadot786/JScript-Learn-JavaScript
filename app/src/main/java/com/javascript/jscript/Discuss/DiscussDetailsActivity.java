package com.javascript.jscript.Discuss;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.applovin.mediation.ads.MaxAdView;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.github.marlonlom.utilities.timeago.TimeAgo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Activities.UserProfileActivity;
import com.javascript.jscript.Adapter.CommentAdapter;
import com.javascript.jscript.BuildConfig;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.CommentModel;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.NotificationsModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.Utils.AdNetwork;
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
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;
    private AdNetwork adNetwork;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscussDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 100);
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
        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(DiscussDetailsActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network

        } else {
            toastText.setText(R.string.no_connection_text);
            toast.show();
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
                if (description.isEmpty()) {
                    binding.descriptions.setVisibility(View.GONE);
                } else {
                    binding.descriptions.setVisibility(View.VISIBLE);
                }
                //set data to id's
                String time = TimeAgo.using(discuss.getPostedAt());
                String views = discuss.getPostViews() + "";
                String comments = discuss.getCommentCount() + "";
                String shares = discuss.getShareCount() + "";
                String likes = discuss.getLikesCount() + "";
                binding.time.setText(time);
                binding.question.setText(question);
                binding.descriptions.setText(description);

                //1K and 1M likes logic
                int like = Integer.parseInt(likes);
                if (like >= 1000) {
                    binding.likesCount.setText((like / 1000) + "." + ((like % 1000) / 100) + "K");
                } else {
                    binding.likesCount.setText(likes);
                }
                if (like >= 1000000) {
                    binding.likesCount.setText((like / 1000000) + "." + ((like % 1000000) / 10000) + "M");
                }

                //1K and 1M views logic
                int view = Integer.parseInt(views);
                if (view >= 1000) {
                    binding.views.setText((view / 1000) + "." + ((view % 1000) / 100) + "K");
                } else {
                    binding.views.setText(views);
                }
                if (view >= 1000000) {
                    binding.views.setText((view / 1000000) + "." + ((view % 1000000) / 10000) + "M");
                }
                //1K and 1M comments logic
                int comment = Integer.parseInt(comments);
                if (comment >= 1000) {
                    binding.comment.setText((comment / 1000) + "." + ((comment % 1000) / 100) + "K");
                } else {
                    binding.comment.setText(comments);
                }
                if (comment >= 1000000) {
                    binding.comment.setText((comment / 1000000) + "." + ((comment % 1000000) / 10000) + "M");
                }
                //1K and 1M shares logic
                int share = Integer.parseInt(shares);
                if (share >= 1000) {
                    binding.share.setText((share / 1000) + "." + ((share % 1000) / 100) + "K");
                } else {
                    binding.share.setText(shares);
                }
                if (share >= 1000000) {
                    binding.share.setText((share / 1000000) + "." + ((share % 1000000) / 10000) + "M");
                }

                //post likes data
                FirebaseDatabase.getInstance().getReference()
                        .child("Discuss")
                        .child(postId)
                        .child("likes")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.exists()){
                                    binding.likes.setImageResource(R.drawable.ic_like_icon_green);
                                }else {
                                    binding.likes.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            //network check
                                            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(DiscussDetailsActivity.CONNECTIVITY_SERVICE);
                                            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                                                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {

                                                FirebaseDatabase.getInstance().getReference()
                                                        .child("Discuss")
                                                        .child(postId)
                                                        .child("likes")
                                                        .child(FirebaseAuth.getInstance().getUid())
                                                        .setValue(true).addOnSuccessListener(new OnSuccessListener<Void>() {
                                                    @Override
                                                    public void onSuccess(Void unused) {
                                                        FirebaseDatabase.getInstance().getReference()
                                                                .child("Discuss")
                                                                .child(postId)
                                                                .child("likesCount")
                                                                .setValue(discuss.getLikesCount() + 1)
                                                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                                    @Override
                                                                    public void onSuccess(Void unused) {
                                                                        binding.likes.setImageResource(R.drawable.ic_like_icon_green);
                                                                        binding.likesLoves.setVisibility(View.VISIBLE);

                                                                        //for notification
                                                                        database.getReference()
                                                                                .child("Discuss")
                                                                                .child(postId)
                                                                                .addValueEventListener(new ValueEventListener() {
                                                                                    @Override
                                                                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                                                        //notifications
                                                                                        NotificationsModel notifications = new NotificationsModel();
                                                                                        notifications.setNotificationBy(FirebaseAuth.getInstance().getUid());
                                                                                        notifications.setNotificationAt(new Date().getTime());
                                                                                        notifications.setPostId(postId);
                                                                                        notifications.setPostedBy(postedBy);
                                                                                        notifications.setQuestion(question);
                                                                                        notifications.setType("likes");

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

                                                                                    @Override
                                                                                    public void onCancelled(@NonNull DatabaseError error) {

                                                                                    }
                                                                                });
                                                                    }
                                                                });
                                                    }
                                                });
                                            } else {
                                                toastText.setText(R.string.no_connection_text);
                                                toast.show();
                                            }
                                        }
                                    });
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                //saved questions
                database.getReference()
                        .child("Discuss")
                        .child(postId)
                        .child("Save")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.exists()){
                                    binding.savedQuestions.setImageResource(R.drawable.ic_bookmark_icon_active);
                                }else {
                                    binding.savedQuestions.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            //network check
                                            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(DiscussDetailsActivity.CONNECTIVITY_SERVICE);
                                            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                                                    connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {

                                                FirebaseDatabase.getInstance().getReference()
                                                        .child("Discuss")
                                                        .child(postId)
                                                        .child("Save")
                                                        .child(FirebaseAuth.getInstance().getUid())
                                                        .setValue(true)
                                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                            @Override
                                                            public void onSuccess(Void unused) {
                                                                database.getReference()
                                                                        .child("Discuss")
                                                                        .child(postId)
                                                                        .child("saved")
                                                                        .setValue(FirebaseAuth.getInstance().getUid())
                                                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                                            @Override
                                                                            public void onSuccess(Void unused) {
                                                                                binding.savedQuestions.setImageResource(R.drawable.ic_bookmark_icon_active);
                                                                                toastText.setText("✔ Question Saved");
                                                                                toast.show();
                                                                            }
                                                                        });
                                                            }
                                                        });


                                            } else {
                                                toastText.setText(R.string.no_connection_text);
                                                toast.show();
                                            }
                                        }
                                    });
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });



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

        binding.profileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscussDetailsActivity.this, UserProfileActivity.class);
                intent.putExtra("postedBy",postedBy);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
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
                                                //hide keyboard
                                                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
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
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(DiscussDetailsActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
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

                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
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
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Question: " + question + "\n\n" + "\n\n" + description +
                "\n\nLearn JavaScript in JScript & solve problems.\n" +
                "https://play.google.com/store/apps/details?id=" +
                BuildConfig.APPLICATION_ID);
        shareIntent.setType("text/plain");
        startActivity(shareIntent);
        //fetch firebase database
        //first get the share count values
        database.getReference()
                .child("Discuss")
                .child(postId)
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        DiscussModel model = snapshot.getValue(DiscussModel.class);
                        assert model != null;
                        String shares = model.getShareCount() + "";
                        //then get the shares boolean value
                        database.getReference()
                                .child("Discuss")
                                .child(postId)
                                .child("shares")
                                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                .addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        //if user shares before
                                        if (snapshot.exists()) {
                                            binding.share.setText(shares);
                                        }
                                        //else new user share
                                        else {
                                            database.getReference()
                                                    .child("Discuss")
                                                    .child(postId)
                                                    .child("shares")
                                                    .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                                    .setValue(true)
                                                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                        @Override
                                                        public void onSuccess(Void unused) {
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
                                                    });
                                        }
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error) {

                                    }
                                });
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
    }


}