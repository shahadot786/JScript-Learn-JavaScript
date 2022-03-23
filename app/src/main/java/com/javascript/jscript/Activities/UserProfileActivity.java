package com.javascript.jscript.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Adapter.DiscussAdapter;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Discuss.DiscussDetailsActivity;
import com.javascript.jscript.Model.CourseProgress;
import com.javascript.jscript.Model.DiscussModel;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityUserProfileBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class UserProfileActivity extends AppCompatActivity {

    //fixed count
    private final int listCountLearn = 300;//230
    private final int listCountQuiz = 1000;//1010
    private final int listCountPrograms = 300;//236
    private final int listCountInterview = 500;//475
    //note: all divided result is 100(listCount / dividedCount = 100)
    private final int dividedLearn = 3;
    private final int dividedQuiz = 10;
    private final int dividedPrograms = 3;
    private final int dividedInterview = 5;
    ActivityUserProfileBinding binding;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    FirebaseDatabase database;
    FirebaseAuth auth;
    Toast toast;
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    ArrayList<DiscussModel> dashboardList;
    Intent intent;
    String postedBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //get intent data
        intent = getIntent();
        postedBy = intent.getStringExtra("postedBy");
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
        UserProfileActivity.this.setTitle("Profile");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //swipe refresh
        swipeRefreshLayout = findViewById(R.id.swipPostRefresh);

        //database instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();

        //recyclerview
        recyclerView = findViewById(R.id.questionsRV);

        dashboardList = new ArrayList<>();
        DiscussAdapter discussAdapter = new DiscussAdapter(dashboardList, UserProfileActivity.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(UserProfileActivity.this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);

        //banner
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
                Map<String, AdapterStatus> statusMap = initializationStatus.getAdapterStatusMap();
                for (String adapterClass : statusMap.keySet()) {
                    AdapterStatus status = statusMap.get(adapterClass);
                    Log.d("JScript", String.format(
                            "Adapter name: %s, Description: %s, Latency: %d",
                            adapterClass, status.getDescription(), status.getLatency()));
                }

                // Start loading ads here...
                //ad request
                AdView bannerAd = findViewById(R.id.adView);
                AdRequest adRequest = new AdRequest.Builder().build();
                bannerAd.loadAd(adRequest);
                if (UiConfig.BANNER_AD_VISIBILITY) {
                    bannerAd.setVisibility(View.VISIBLE);
                } else {
                    bannerAd.setVisibility(View.GONE);
                }
            }
        });

        //network check
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(DiscussDetailsActivity.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network

        } else {
            toastText.setText(R.string.no_connection_text);
            toast.show();
        }

        /*check if user is sign in or sign out*/
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser == null) {
            Intent intent = new Intent(UserProfileActivity.this, GoogleSignInActivity.class);
            startActivity(intent);
        } else {
            //google sign in data fetch with image
            database.getReference().child("UserData").child(postedBy)
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                UserModel user = snapshot.getValue(UserModel.class);
                                assert user != null;
                                Picasso.get()
                                        .load(user.getProfile())
                                        .placeholder(R.drawable.ic_profile_default_image)
                                        .into(binding.profileImage);
                                binding.userName.setText(user.getUserName());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
            //cover and profile update images
            database.getReference().child("UserImages").child(postedBy)
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                UserModel user = snapshot.getValue(UserModel.class);
                                assert user != null;
                                Picasso.get()
                                        .load(user.getCoverPhoto())
                                        .placeholder(R.drawable.ic_placeholder_dark)
                                        .into(binding.coverPhoto);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

            //other information data fetch
            //update profile data fetch
            database.getReference().child("UpdateProfile")
                    .child(Objects.requireNonNull(auth.getUid()))
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                ProfileModel profile = snapshot.getValue(ProfileModel.class);
                                assert profile != null;
                                String profession = profile.getProfession();
                                String bio = profile.getUserBio();
                                String fb = profile.getFbLink();
                                String insta = profile.getInstaLink();
                                String github = profile.getGithubLink();
                                String linkedin = profile.getLinkedinLink();
                                String twitter = profile.getTwitterLink();
                                if (profession.isEmpty()) {
                                    binding.profession.setText(getResources().getString(R.string.profession));
                                } else {
                                    binding.profession.setText(profession);
                                }

                                //set bio
                                binding.userBioText.setText(bio);
                                //insert link data
                                binding.linkFacebook.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (fb.isEmpty()) {
                                            toastText.setText(R.string.Pleaseupdateyourprofilefirst);
                                            toast.show();
                                        } else if (fb.startsWith("https://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(fb)));
                                        } else if (fb.startsWith("http://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(fb)));
                                        } else {
                                            toastText.setText(R.string.valid_input);
                                            toast.show();
                                        }
                                    }
                                });//facebook
                                binding.linkInstagram.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (insta.isEmpty()) {
                                            toastText.setText(R.string.Pleaseupdateyourprofilefirst);
                                            toast.show();
                                        } else if (insta.startsWith("https://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(insta)));
                                        } else if (insta.startsWith("http://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(insta)));
                                        } else {
                                            toastText.setText(R.string.valid_input);
                                            toast.show();
                                        }
                                    }
                                });//instagram
                                binding.linkGithub.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (github.isEmpty()) {
                                            toastText.setText(R.string.Pleaseupdateyourprofilefirst);
                                            toast.show();
                                        } else if (github.startsWith("https://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(github)));
                                        } else if (github.startsWith("http://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(github)));
                                        } else {
                                            toastText.setText(R.string.valid_input);
                                            toast.show();
                                        }
                                    }
                                });//github
                                binding.linkLinkedIn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (linkedin.isEmpty()) {
                                            toastText.setText(R.string.Pleaseupdateyourprofilefirst);
                                            toast.show();
                                        } else if (linkedin.startsWith("https://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(linkedin)));
                                        } else if (linkedin.startsWith("http://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(linkedin)));
                                        } else {
                                            toastText.setText(R.string.valid_input);
                                            toast.show();
                                        }
                                    }
                                });//linkedin
                                binding.linkTwitter.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (twitter.isEmpty()) {
                                            toastText.setText(R.string.Pleaseupdateyourprofilefirst);
                                            toast.show();
                                        } else if (twitter.startsWith("https://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(twitter)));
                                        } else if (twitter.startsWith("http://")) {
                                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(twitter)));
                                        } else {
                                            toastText.setText(R.string.valid_input);
                                            toast.show();
                                        }
                                    }
                                });//twitter


                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


            //code of learn progress
            database.getReference().child("Progress")
                    .child(postedBy)
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.exists()) {
                                CourseProgress progress = snapshot.getValue(CourseProgress.class);
                                assert progress != null;
                                int learnProgress = progress.getLearnCount();
                                int quizProgress = progress.getQuizCount();
                                int programProgress = progress.getProgramsCount();
                                int interviewProgress = progress.getInterviewCount();
                                //learn progress
                                if (learnProgress <= listCountLearn) {
                                    binding.learnProgressBar.setProgress(learnProgress / dividedLearn);
                                    binding.learnText.setText(String.format("%s%%", learnProgress / dividedLearn));
                                } else {
                                    binding.learnProgressBar.setProgress(100);
                                    binding.learnText.setText(String.format("%s%%", 100));
                                }
                                //quiz progress
                                if (quizProgress <= listCountQuiz) {
                                    binding.quizProgressBar.setProgress(quizProgress / dividedQuiz);
                                    binding.quizText.setText(String.format("%s%%", quizProgress / dividedQuiz));
                                } else {
                                    binding.quizProgressBar.setProgress(100);
                                    binding.quizText.setText(String.format("%s%%", 100));
                                }
                                //programs progress
                                if (programProgress <= listCountPrograms) {
                                    binding.programsProgressBar.setProgress(programProgress / dividedPrograms);
                                    binding.programsText.setText(String.format("%s%%", programProgress / dividedPrograms));
                                } else {
                                    binding.programsProgressBar.setProgress(100);
                                    binding.programsText.setText(String.format("%s%%", 100));
                                }
                                //interview progress
                                if (interviewProgress <= listCountInterview) {
                                    binding.interviewProgressBar.setProgress(interviewProgress / dividedInterview);
                                    binding.interviewText.setText(String.format("%s%%", interviewProgress / dividedInterview));
                                } else {
                                    binding.interviewProgressBar.setProgress(100);
                                    binding.interviewText.setText(String.format("%s%%", 100));
                                }

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

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
                                String postBy = model.getPostedBy();
                                if (postedBy.equals(postBy)) {
                                    dashboardList.add(model);
                                }
                            }
                            recyclerView.setAdapter(discussAdapter);
                            discussAdapter.notifyDataSetChanged();

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @SuppressLint("NotifyDataSetChanged")
                @Override
                public void onRefresh() {
                    //google sign in data fetch with image
                    database.getReference().child("UserData").child(postedBy)
                            .addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot) {
                                    if (snapshot.exists()) {
                                        UserModel user = snapshot.getValue(UserModel.class);
                                        assert user != null;
                                        Picasso.get()
                                                .load(user.getProfile())
                                                .placeholder(R.drawable.ic_profile_default_image)
                                                .into(binding.profileImage);
                                        binding.userName.setText(user.getUserName());
                                    }
                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });
                    //cover and profile update images
                    database.getReference().child("UserImages").child(postedBy)
                            .addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot) {
                                    if (snapshot.exists()) {
                                        UserModel user = snapshot.getValue(UserModel.class);
                                        assert user != null;
                                        Picasso.get()
                                                .load(user.getCoverPhoto())
                                                .placeholder(R.drawable.ic_placeholder_dark)
                                                .into(binding.coverPhoto);
                                    }
                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });
                    //other information data fetch
                    //update profile data fetch
                    database.getReference().child("UpdateProfile")
                            .child(Objects.requireNonNull(auth.getUid()))
                            .addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot) {
                                    if (snapshot.exists()) {
                                        ProfileModel profile = snapshot.getValue(ProfileModel.class);
                                        assert profile != null;
                                        String profession = profile.getProfession();
                                        String bio = profile.getUserBio();
                                        String fb = profile.getFbLink();
                                        String insta = profile.getInstaLink();
                                        String github = profile.getGithubLink();
                                        String linkedin = profile.getLinkedinLink();
                                        String twitter = profile.getTwitterLink();
                                        if (profession.isEmpty()) {
                                            binding.profession.setText(getResources().getString(R.string.profession));
                                        } else {
                                            binding.profession.setText(profession);
                                        }

                                        //set bio
                                        binding.userBioText.setText(bio);
                                        //insert link data
                                        binding.linkFacebook.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                if (fb.isEmpty()) {
                                                    toastText.setText(R.string.link_not_found);
                                                    toast.show();
                                                } else if (fb.startsWith("https://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(fb)));
                                                } else if (fb.startsWith("http://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(fb)));
                                                } else {
                                                    toastText.setText(R.string.valid_input);
                                                    toast.show();
                                                }
                                            }
                                        });//facebook
                                        binding.linkInstagram.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                if (insta.isEmpty()) {
                                                    toastText.setText(R.string.link_not_found);
                                                    toast.show();
                                                } else if (insta.startsWith("https://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(insta)));
                                                } else if (insta.startsWith("http://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(insta)));
                                                } else {
                                                    toastText.setText(R.string.valid_input);
                                                    toast.show();
                                                }
                                            }
                                        });//instagram
                                        binding.linkGithub.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                if (github.isEmpty()) {
                                                    toastText.setText(R.string.link_not_found);
                                                    toast.show();
                                                } else if (github.startsWith("https://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(github)));
                                                } else if (github.startsWith("http://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(github)));
                                                } else {
                                                    toastText.setText(R.string.valid_input);
                                                    toast.show();
                                                }
                                            }
                                        });//github
                                        binding.linkLinkedIn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                if (linkedin.isEmpty()) {
                                                    toastText.setText(R.string.link_not_found);
                                                    toast.show();
                                                } else if (linkedin.startsWith("https://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(linkedin)));
                                                } else if (linkedin.startsWith("http://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(linkedin)));
                                                } else {
                                                    toastText.setText(R.string.valid_input);
                                                    toast.show();
                                                }
                                            }
                                        });//linkedin
                                        binding.linkTwitter.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                if (twitter.isEmpty()) {
                                                    toastText.setText(R.string.link_not_found);
                                                    toast.show();
                                                } else if (twitter.startsWith("https://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(twitter)));
                                                } else if (twitter.startsWith("http://")) {
                                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(twitter)));
                                                } else {
                                                    toastText.setText(R.string.valid_input);
                                                    toast.show();
                                                }
                                            }
                                        });//twitter


                                    }
                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });

                    //code of learn progress
                    database.getReference().child("Progress")
                            .child(postedBy)
                            .addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot) {
                                    if (snapshot.exists()) {
                                        CourseProgress progress = snapshot.getValue(CourseProgress.class);
                                        assert progress != null;
                                        int learnProgress = progress.getLearnCount();
                                        int quizProgress = progress.getQuizCount();
                                        int programProgress = progress.getProgramsCount();
                                        int interviewProgress = progress.getInterviewCount();
                                        //learn progress
                                        if (learnProgress <= listCountLearn) {
                                            binding.learnProgressBar.setProgress(learnProgress / dividedLearn);
                                            binding.learnText.setText(String.format("%s%%", learnProgress / dividedLearn));
                                        } else {
                                            binding.learnProgressBar.setProgress(100);
                                            binding.learnText.setText(String.format("%s%%", 100));
                                        }
                                        //quiz progress
                                        if (quizProgress <= listCountQuiz) {
                                            binding.quizProgressBar.setProgress(quizProgress / dividedQuiz);
                                            binding.quizText.setText(String.format("%s%%", quizProgress / dividedQuiz));
                                        } else {
                                            binding.quizProgressBar.setProgress(100);
                                            binding.quizText.setText(String.format("%s%%", 100));
                                        }
                                        //programs progress
                                        if (programProgress <= listCountPrograms) {
                                            binding.programsProgressBar.setProgress(programProgress / dividedPrograms);
                                            binding.programsText.setText(String.format("%s%%", programProgress / dividedPrograms));
                                        } else {
                                            binding.programsProgressBar.setProgress(100);
                                            binding.programsText.setText(String.format("%s%%", 100));
                                        }
                                        //interview progress
                                        if (interviewProgress <= listCountInterview) {
                                            binding.interviewProgressBar.setProgress(interviewProgress / dividedInterview);
                                            binding.interviewText.setText(String.format("%s%%", interviewProgress / dividedInterview));
                                        } else {
                                            binding.interviewProgressBar.setProgress(100);
                                            binding.interviewText.setText(String.format("%s%%", 100));
                                        }

                                    }
                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });

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
                                        String postBy = model.getPostedBy();
                                        if (postedBy.equals(postBy)) {
                                            dashboardList.add(model);
                                        }
                                    }
                                    recyclerView.setAdapter(discussAdapter);
                                    discussAdapter.notifyDataSetChanged();

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


    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}