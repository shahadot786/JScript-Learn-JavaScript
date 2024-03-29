package com.javascript.jscript.Discuss;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
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
import com.javascript.jscript.Fragment.DiscussFragment;
import com.javascript.jscript.Model.DiscussModel;
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
    TextInputLayout question, descriptions;
    ProgressDialog dialog;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddDiscussBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout, findViewById(R.id.toastLayout));
        toastText = toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
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
        ImageView proBadge = findViewById(R.id.proBadge);
        if (UiConfig.PRO_VISIBILITY_STATUS_SHOW) {
            proBadge.setVisibility(View.GONE);
        } else {
            proBadge.setVisibility(View.VISIBLE);
        }
        //firebase instance
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        //get firebase value
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

        //post button click
        binding.postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(AddDiscussActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    //check first if the fields are empty
                    if (questionValidation()) {
                        //show dialog
                        dialog.show();
                        DiscussModel post = new DiscussModel();
                        post.setPostedBy(FirebaseAuth.getInstance().getUid());
                        post.setQuestions(Objects.requireNonNull(binding.questionEditText.getText()).toString());
                        post.setDescription(Objects.requireNonNull(binding.descriptionEditText.getText()).toString());
                        post.setPostedAt(new Date().getTime());
                        //set database value
                        database.getReference().child("Discuss")
                                .push()
                                .setValue(post).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(@NonNull Void unused) {
                                dialog.dismiss();
                                toastText.setText(R.string.PostedSuccessfully);
                                toast.show();
                                Intent intent = new Intent(AddDiscussActivity.this, DiscussFragment.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                finish();
                            }
                        });

                    }
                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                }
            }
        });


    }//ends of onCreate

    //question validation
    public boolean questionValidation() {
        String questionText = Objects.requireNonNull(question.getEditText()).getText().toString().trim();
        if (questionText.isEmpty()) {
            question.setError("Question is required");
            return false;
        } else {
            question.setError(null);
            return true;
        }
    }

    /*//descriptions validation
    public boolean descriptionsValidation() {
        String descriptionsText = Objects.requireNonNull(descriptions.getEditText()).getText().toString().trim();
        if (descriptionsText.isEmpty()) {
            descriptions.setError("Descriptions is required");
            return false;
        } else {
            descriptions.setError(null);
            return true;
        }
    }*/


    //option menu item select
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}