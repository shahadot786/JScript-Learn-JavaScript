package com.javascript.jscript.Programs;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.javascript.jscript.Model.AddProgramsModel;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityAddProgramsBinding;
import com.squareup.picasso.Picasso;

import java.util.Objects;

public class AddProgramsActivity extends AppCompatActivity {

    ActivityAddProgramsBinding binding;
    ProgressDialog dialog;
    FirebaseDatabase database;
    FirebaseAuth auth;
    private TextInputLayout subject, programTitle, program, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddProgramsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //find id
        subject = findViewById(R.id.text_input_subject);
        programTitle = findViewById(R.id.text_input_program_title);
        program = findViewById(R.id.text_input_program);
        output = findViewById(R.id.text_input_program_output);
        //instance
        database = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        //toolbar
        setSupportActionBar(binding.toolbar2);
        AddProgramsActivity.this.setTitle("Add Program");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //progress dialog
        dialog = new ProgressDialog(AddProgramsActivity.this, ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Add Program");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        //get database value
        //google sign in data fetch with image
        database.getReference().child("UserData").child(Objects.requireNonNull(auth.getUid()))
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


        //add program button click listener
        binding.addProgramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check fields aren't empty
                if (!addSubjectValidation() | !addProgramTitleValidation() | !addProgramValidation() | !addProgramOutputValidation()) {
                    return;
                }
                //import value to firebase database
                dialog.show();
                AddProgramsModel programsModel = new AddProgramsModel();
                programsModel.setSubject(Objects.requireNonNull(binding.subjectEdit.getText()).toString());
                programsModel.setProgramTitle(Objects.requireNonNull(binding.programTitleEditText.getText()).toString());
                programsModel.setProgram(Objects.requireNonNull(binding.programEditText.getText()).toString());
                programsModel.setOutput(Objects.requireNonNull(binding.outputEditText.getText()).toString());
                //send data to database
                database.getReference().child("Programs")
                        .child(auth.getUid())
                        .setValue(programsModel).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(@NonNull Void unused) {
                        dialog.dismiss();
                        finish();
                    }
                });

                //hide keyboard
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });
    }//on create ends

    //add subject validation
    private boolean addSubjectValidation() {
        String addSubject = subject.getEditText().getText().toString().trim();
        //subject
        if (addSubject.isEmpty()) {
            subject.setError("Subject is required!");
            return false;
        } else {
            subject.setError(null);
            return true;
        }
    }

    //add program title validation
    private boolean addProgramTitleValidation() {
        String addProgramTitle = programTitle.getEditText().getText().toString().trim();
        if (addProgramTitle.isEmpty()) {
            programTitle.setError("Program title is required!");
            return false;
        } else {
            programTitle.setError(null);
            return true;
        }
    }

    //add program  validation
    private boolean addProgramValidation() {
        String addProgram = program.getEditText().getText().toString().trim();
        if (addProgram.isEmpty()) {
            program.setError("Program is required!");
            return false;
        } else {
            program.setError(null);
            return true;
        }
    }

    //add program  output validation
    private boolean addProgramOutputValidation() {
        String addOutput = output.getEditText().getText().toString().trim();
        if (addOutput.isEmpty()) {
            output.setError("Output is required!");
            return false;
        } else {
            output.setError(null);
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