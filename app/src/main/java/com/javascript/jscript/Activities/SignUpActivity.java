package com.javascript.jscript.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.database.FirebaseDatabase;
import com.javascript.jscript.Model.UserModel;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivitySignUpBinding;

import java.util.Objects;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {
    //password validation patterns
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z-0-9-@#$%^!~*&+=])" + //any letter or number or special
                    //"(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{6,15}" +               //at least 6 characters
                    "$");

    ActivitySignUpBinding binding;//binding
    //InputVariables
    private TextInputLayout textInputUserName;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    ProgressDialog dialog;
    //firebase code
    FirebaseAuth auth;
    FirebaseDatabase database;
    private boolean connected = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dialog = new ProgressDialog(this, ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Sign Up");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);

        //initialize id
        textInputUserName = findViewById(R.id.text_input_username);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);

        //firebase instance code
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        //Register Button OnClickListener
        binding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(SplashActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                    //input fields validations check
                    if (!validateUsername() | !validateEmail() | !validatePassword()) {
                        return;
                    }
                    //hide keyboard
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

                    //other code start here
                    String userName = binding.editTextUsername.getText().toString();
                    String email = binding.editTextEmail.getText().toString();
                    String password = binding.editTextPassword.getText().toString();
                    auth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    if (!task.isSuccessful()) {
                                        try {
                                            throw Objects.requireNonNull(task.getException());
                                        } catch (FirebaseAuthWeakPasswordException weakPassword) {
                                            Log.d("TAG", "onComplete: weak_password");
                                            Toast.makeText(SignUpActivity.this, "Weak password", Toast.LENGTH_SHORT).show();
                                        } catch (FirebaseAuthInvalidCredentialsException malformedEmail) {
                                            Log.d("TAG", "onComplete: malformed_email");
                                        } catch (FirebaseAuthUserCollisionException existEmail) {
                                            Log.d("TAG", "onComplete: exist_email");
                                            Toast.makeText(SignUpActivity.this, "Email already exist", Toast.LENGTH_SHORT).show();
                                        } catch (Exception e) {
                                            Log.d("TAG", "onComplete: " + e.getMessage());
                                        }
                                    } else {
                                        dialog.show();
                                        UserModel userModel = new UserModel(userName, email, password);
                                        database.getReference().child("UserData")
                                                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getUid()))
                                                .setValue(userModel);
                                        Toast.makeText(SignUpActivity.this, "Sign Up Successfully", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                }
                            });
                    dialog.dismiss();

                } else {
                    Toast.makeText(SignUpActivity.this, "You\'re offline, please connect to network first", Toast.LENGTH_SHORT).show();
                    connected = false;
                }
            }

        });
        //Goto sign in activity
        binding.goToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
        //Data Policy OnClickListener
        binding.dataPolicy.setOnClickListener
                (View -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy)))));


    }

    //Other Methods
    //username Validation
    private boolean validateUsername() {
        String usernameInput = textInputUserName.getEditText().getText().toString().trim();
        if (usernameInput.isEmpty()) {
            textInputUserName.setError("Username is required.");
            return false;
        } else {
            textInputUserName.setError(null);
            return true;
        }
    }

    //email Validation
    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()) {
            textInputEmail.setError("Email is required.");
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
            textInputPassword.setError("Password is required.");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            if (passwordInput.length() < 6) {
                textInputPassword.setError("At least 6 Characters");
            } else if (passwordInput.length() > 15) {
                textInputPassword.setError("Password too long");
            } else {
                textInputPassword.setError("No white spaces");
            }
            return false;
        } else {
            textInputPassword.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }

    }

}