package com.javascript.jscript.Fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.javascript.jscript.Activities.EditProfileActivity;
import com.javascript.jscript.Activities.FeedBackActivity;
import com.javascript.jscript.Activities.GoogleSignInActivity;
import com.javascript.jscript.Activities.PremiumActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.CourseProgress;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.FragmentProfileBinding;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class ProfileFragment extends Fragment {

    //fixed count
    private final int listCountLearn = 300;//230
    private final int listCountQuiz = 800;
    private final int listCountPrograms = 1000;
    private final int listCountInterview = 500;//475
    //note: all divided result is 100(listCount / dividedCount = 100)
    private final int dividedLearn = 3;
    private final int dividedQuiz = 8;
    private final int dividedPrograms = 10;
    private final int dividedInterview = 5;
    FragmentProfileBinding binding;
    FirebaseAuth auth;
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog dialog;
    TextView toastText;
    View toastLayout;
    Toast toast;


    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        auth = FirebaseAuth.getInstance();
        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        dialog = new ProgressDialog(getContext(), ProgressDialog.THEME_DEVICE_DEFAULT_DARK);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        //Toast
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, view.findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getActivity().getBaseContext());
        toast.setGravity(Gravity.BOTTOM, 0, 200);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //dialog
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Image Uploading");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        //pro status
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            binding.proBadge.setVisibility(View.GONE);
        } else {
            binding.proBadge.setVisibility(View.VISIBLE);
        }
        //promotion visibility
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            binding.promotion.setVisibility(View.VISIBLE);
        } else {
            binding.promotion.setVisibility(View.GONE);
        }
        /*check if user is sign in or sign out*/
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser == null) {
            Intent intent = new Intent(getActivity(), GoogleSignInActivity.class);
            startActivity(intent);
        } else {
            //google sign in data fetch with image
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
                                        .into(binding.profileImage);
                                binding.userName.setText(user.getUserName());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
            //cover and profile update images
            database.getReference().child("UserImages").child(Objects.requireNonNull(auth.getUid()))
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

                                //set profession and bio
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
        }


        //upload cover
        binding.uploadCoverImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(FeedBackActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    intent.setType("image/*");
                    startActivityForResult(intent, 11);
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }

            }
        });
        //upload profile image
        binding.profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(FeedBackActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    intent.setType("image/*");
                    startActivityForResult(intent, 22);
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
            }
        });
        //edit profile
        binding.editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(intent);
            }
        });
        //promo start button
        binding.promotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PremiumActivity.class);
                startActivity(intent);
            }
        });
        //code of learn progress
        database.getReference().child("Progress")
                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
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


        return binding.getRoot();
    }//end onCreate


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 11) {
            assert data != null;
            if (data.getData() != null) {
                Uri uri = data.getData();
                binding.coverPhoto.setImageURI(uri);
                dialog.show();
                final StorageReference reference = storage.getReference().child("cover_photo")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()));
                reference.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                        dialog.dismiss();
                        toastText.setText(R.string.UploadSuccessfully);
                        toast.show();
                        reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(@NonNull Uri uri) {
                                database.getReference()
                                        .child("UserImages")
                                        .child(Objects.requireNonNull(auth.getUid()))
                                        .child("coverPhoto")
                                        .setValue(uri.toString());
                            }
                        });
                    }
                });
            }
        } else if (requestCode == 22) {
            assert data != null;
            if (data.getData() != null) {
                Uri uri = data.getData();
                binding.profileImage.setImageURI(uri);
                dialog.show();
                final StorageReference reference = storage.getReference().child("profile_image")
                        .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()));
                reference.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                        dialog.dismiss();
                        toastText.setText(R.string.UploadSuccessfully);
                        toast.show();
                        reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(@NonNull Uri uri) {
                                database.getReference()
                                        .child("UserData")
                                        .child(Objects.requireNonNull(auth.getUid()))
                                        .child("profile")
                                        .setValue(uri.toString());
                            }
                        });
                    }
                });
            }
        } else {
            toastText.setText(R.string.WrongImageUpload);
            toast.show();
        }
    }


}