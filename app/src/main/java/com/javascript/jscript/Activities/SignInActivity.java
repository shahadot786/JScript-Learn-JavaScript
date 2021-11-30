package com.javascript.jscript.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivitySignInBinding;


import java.util.regex.Pattern;

public class SignInActivity extends AppCompatActivity {
    //password validation patterns
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    //"(?=.*[@#$%^&+=])" +    //at least 1 special character
                    //"(?=\\S+$)" +           //no white spaces
                    ".{8,15}" +               //at least 6 characters
                    "$");

    //binding
    ActivitySignInBinding binding;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    //Firebase Code
    FirebaseAuth auth;
    FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivitySignInBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        //Initialize id
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);
        //firebase auth
        auth = FirebaseAuth.getInstance();
        currentUser = auth.getCurrentUser();

        //Goto sign in activity
        binding.goToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
        //Data Policy OnClickListener
        binding.dataPolicy.setOnClickListener
                (View -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy)))));

        //goto log in button
        binding.signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateEmail() | !validatePassword()) {
                    return;
                }
                //hide keyboard
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                //other codes start here
                String email = binding.editTextEmail.getText().toString();
                String password = binding.editTextPassword.getText().toString();
                auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent = new Intent(SignInActivity.this,MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(SignInActivity.this, "Sign In Successfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }

        });
    }//end of onCreate
    //other codes and method here
    //email Validation
    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()) {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            textInputEmail.setError("Please enter a valid email address");
            return false;
        } else {
            textInputEmail.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }
    }
    //password Validation
    private boolean validatePassword() {
        String passwordInput = textInputPassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()) {
            textInputPassword.setError("Field can't be empty");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            if (passwordInput.length() < 8){
                textInputPassword.setError("At least 8 Characters");
            }else if (passwordInput.length() > 15){
                textInputPassword.setError("Password too long");
            }
            else{
                textInputPassword.setError("Password too weak");
            }
            return false;
        } else {
            textInputPassword.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }

    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}