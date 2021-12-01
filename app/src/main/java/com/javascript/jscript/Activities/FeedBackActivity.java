package com.javascript.jscript.Activities;

import android.os.Bundle;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Model.FeedbackModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityFeedBackBinding;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class FeedBackActivity extends AppCompatActivity {
    ActivityFeedBackBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;
    private TextInputLayout sendInput;
    private TextInputLayout emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeedBackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //find id
        sendInput = findViewById(R.id.text_input_feedback);
        emailInput = findViewById(R.id.text_input_email);
        String feedbackDescription = binding.sendEditText.getText().toString();
        String feedEmail = binding.emailFeedEdit.getText().toString();
        //instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //toolbar
        setSupportActionBar(binding.toolbar2);
        FeedBackActivity.this.setTitle("Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //get database value
        database.getReference().child("Users").child(auth.getUid())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            UserModel user = snapshot.getValue(UserModel.class);
                            assert user != null;
                            Picasso.get()
                                    .load(user.getProfile())
                                    .placeholder(R.drawable.ic_placeholder_dark)
                                    .into(binding.profileImage);
                            binding.userName.setText(user.getUserName());
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        //send button click codes
        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check first if the fields are empty

                if (sendMessageBtnValidation() && sendEmailBtnValidation()) {
                    FeedbackModel feedbackModel = new FeedbackModel(feedbackDescription,feedEmail);
                    feedbackModel.setFeedbackDescription(binding.sendEditText.getText().toString());
                    feedbackModel.setFeedEmail(binding.emailFeedEdit.getText().toString());

                    database.getReference().child("Feedback")
                            .child("User")
                            .push()
                            .setValue(feedbackModel).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(@NonNull Void unused) {

                        }
                    });
                    //after send feedback show a message
                    AlertDialog.Builder dialog = new AlertDialog.Builder(FeedBackActivity.this, R.style.AppCompatAlertDialogStyle);
                    dialog.setTitle(R.string.dialog_feedback);
                    dialog.setMessage(R.string.dialog_feed_message);
                    dialog.setPositiveButton(R.string.dialog_ok, ((dialogInterface, i) -> finish()));
                    dialog.show();

                }


            }
        });


    }//end of onCreate
    //other codes
    //send button message validation
    public boolean sendMessageBtnValidation() {
        String sendTextInput = sendInput.getEditText().getText().toString().trim();
        if (sendTextInput.isEmpty()) {
            sendInput.setError("Message is required");
            return false;
        } else if (sendTextInput.length() > 2048) {
            sendInput.setError("Message is too long, tell us shortly within 2048 Letters.");
            return false;
        } else {
            sendInput.setError(null);
            return true;
        }
    }
    //sent button email validation
    public boolean sendEmailBtnValidation() {
        String sendEmailInput = emailInput.getEditText().getText().toString().trim();
        if (sendEmailInput.isEmpty()){
            emailInput.setError("Email is required.");
            return false;
        }else if (!Patterns.EMAIL_ADDRESS.matcher(sendEmailInput).matches()){
            emailInput.setError("Please enter a valid email address");
            return false;
        }else{
            emailInput.setError(null);
            emailInput.setErrorEnabled(false);
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















