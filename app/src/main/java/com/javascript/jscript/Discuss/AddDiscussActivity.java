package com.javascript.jscript.Discuss;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
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
import com.javascript.jscript.Activities.GoogleSignInActivity;
import com.javascript.jscript.Config.UiConfig;
import com.javascript.jscript.Fragment.DiscussFragment;
import com.javascript.jscript.Model.AddDiscussModel;
import com.javascript.jscript.Model.ProfileModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityAddDiscussBinding;
import com.squareup.picasso.Picasso;

import java.util.Date;
import java.util.Objects;

public class AddDiscussActivity extends AppCompatActivity {

    ActivityAddDiscussBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;
    TextInputLayout question,descriptions;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddDiscussBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //progress dialog
        dialog = new ProgressDialog(AddDiscussActivity.this, ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Post uploading");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        //find id
        question = findViewById(R.id.text_input_question);
        descriptions = findViewById(R.id.text_input_description);
        //toolbar
        setSupportActionBar(binding.toolbar2);
        AddDiscussActivity.this.setTitle("Add Post");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //check pro status
        View proView2 = findViewById(R.id.proTextView);
        TextView proText2 = findViewById(R.id.proText2);

        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proView2.setVisibility(View.GONE);
            proText2.setVisibility(View.GONE);
        } else {
            proView2.setVisibility(View.VISIBLE);
            proText2.setVisibility(View.VISIBLE);
        }
        //firebase instance
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        //get firebase value
        database.getReference().child("UpdateProfile").child(Objects.requireNonNull(auth.getUid()))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            ProfileModel profileModel = snapshot.getValue(ProfileModel.class);
                            assert profileModel != null;
                            binding.userName.setText(profileModel.getUsername());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //fetch update image
        database.getReference().child("UserImages").child(auth.getUid())
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
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //post button click
        binding.postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check first if the fields are empty
                if (questionValidation() && descriptionsValidation()){
                    //show dialog
                    dialog.show();
                    int count = 0;
                    AddDiscussModel discussModel = new AddDiscussModel();
                    discussModel.setQuestion(Objects.requireNonNull(binding.questionEditText.getText()).toString());
                    discussModel.setDescriptions(Objects.requireNonNull(binding.descriptionEditText.getText()).toString());
                    discussModel.setPostAt(new Date().getTime());
                    discussModel.setPostedBy(FirebaseAuth.getInstance().getUid());
                    database.getReference().child("Discuss")
                            .child(auth.getUid())
                            .push()
                            .setValue(discussModel).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(@NonNull Void unused) {

                            database.getReference()
                                    .child("Discuss")
                                    .child(auth.getUid())
                                    .child("postCount").addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot) {
                                    int postCount = 0;
                                    if (snapshot.exists()){
                                        postCount = snapshot.getValue(Integer.class);
                                    }

                                    database.getReference()
                                            .child("Discuss")
                                            .child(auth.getUid())
                                            .child("postCount")
                                            .setValue(postCount + 1).addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(@NonNull Void unused) {
                                            dialog.dismiss();
                                            Intent intent = new Intent(AddDiscussActivity.this,DiscussFragment.class);
                                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                            finish();
                                            Toast.makeText(AddDiscussActivity.this, "Posted Successfully", Toast.LENGTH_SHORT).show();
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
        });


    }//ends of onCreate
    //question validation
    public boolean questionValidation(){
        String questionText = Objects.requireNonNull(question.getEditText()).getText().toString().trim();
        if (questionText.isEmpty()) {
            question.setError("Question is required");
            return false;
        }else {
            question.setError(null);
            return true;
        }
    }
    //descriptions validation
    public boolean descriptionsValidation(){
        String descriptionsText = Objects.requireNonNull(descriptions.getEditText()).getText().toString().trim();
        if (descriptionsText.isEmpty()) {
            descriptions.setError("Descriptions is required");
            return false;
        }else {
            descriptions.setError(null);
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