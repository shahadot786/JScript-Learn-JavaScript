package com.javascript.jscript.Activities;

import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityEditProfileBinding;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class EditProfileActivity extends AppCompatActivity {

    ActivityEditProfileBinding binding;
    FirebaseDatabase database;
    FirebaseAuth auth;
    ProgressDialog dialog;
    private TextInputLayout professionInput;
    private TextInputLayout bioInput;
    private boolean connected = false;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //find id
        professionInput = findViewById(R.id.text_input_profession);
        bioInput = findViewById(R.id.text_input_bio);
        //check pro status
        ImageView proBadge = findViewById(R.id.proBadge);
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proBadge.setVisibility(View.GONE);
        } else {
            proBadge.setVisibility(View.VISIBLE);
        }

        //instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //progress dialog
        dialog = new ProgressDialog(EditProfileActivity.this, ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Update Profile");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);

        //toolbar
        setSupportActionBar(binding.toolbar2);
        EditProfileActivity.this.setTitle("Edit Profile");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //get database value
        //fetch update image
        database.getReference().child("UserData").child(Objects.requireNonNull(auth.getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            UserModel userModel = snapshot.getValue(UserModel.class);
                            assert userModel != null;
                            Picasso.get()
                                    .load(userModel.getProfile())
                                    .placeholder(R.drawable.ic_profile_default_image)
                                    .into(binding.profileImage);
                            binding.userName.setText(userModel.getUserName());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //if existing user update data
        database.getReference().child("UpdateProfile")
                .child(auth.getUid())
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
                            //set profession,bio and link
                            binding.professionEdit.setText(profession);
                            binding.bioEditText.setText(bio);
                            binding.fblinkEditText.setText(fb);
                            binding.instalinkEditText.setText(insta);
                            binding.githublinkEditText.setText(github);
                            binding.linkedinlinkEditText.setText(linkedin);
                            binding.twitterlinkEditText.setText(twitter);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });


        binding.updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(EditProfileActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                    if (professionValidation() && bioValidation()) {
                        dialog.show();
                        ProfileModel profileModel = new ProfileModel();
                        profileModel.setUsername(Objects.requireNonNull(binding.usernameEdit.getText()).toString());
                        profileModel.setProfession(Objects.requireNonNull(binding.professionEdit.getText()).toString());
                        profileModel.setFbLink(Objects.requireNonNull(binding.fblinkEditText.getText()).toString());
                        profileModel.setInstaLink(Objects.requireNonNull(binding.instalinkEditText.getText()).toString());
                        profileModel.setGithubLink(Objects.requireNonNull(binding.githublinkEditText.getText()).toString());
                        profileModel.setLinkedinLink(Objects.requireNonNull(binding.linkedinlinkEditText.getText()).toString());
                        profileModel.setTwitterLink(Objects.requireNonNull(binding.twitterlinkEditText.getText()).toString());
                        profileModel.setUserBio(Objects.requireNonNull(binding.bioEditText.getText()).toString());
                        //send data to database
                        database.getReference().child("UpdateProfile")
                                .child(auth.getUid())
                                .setValue(profileModel).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(@NonNull Void unused) {
                                dialog.dismiss();
                                finish();
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


    }//onCreate Ends

    public boolean professionValidation() {
        String sendTextInput = Objects.requireNonNull(professionInput.getEditText()).getText().toString().trim();
        if (sendTextInput.isEmpty()) {
            professionInput.setError("Profession is required");
            return false;
        } else {
            professionInput.setError(null);
            return true;
        }
    }

    public boolean bioValidation() {
        String sendTextInput = Objects.requireNonNull(bioInput.getEditText()).getText().toString().trim();
        if (sendTextInput.isEmpty()) {
            bioInput.setError("About is required");
            return false;
        } else {
            bioInput.setError(null);
            return true;
        }
    }

    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}