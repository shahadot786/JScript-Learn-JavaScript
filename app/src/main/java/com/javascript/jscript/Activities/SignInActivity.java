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
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseUser;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivitySignInBinding;

import java.util.Objects;
import java.util.regex.Pattern;

public class SignInActivity extends AppCompatActivity {
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

    //binding
    ActivitySignInBinding binding;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    //Firebase Code
    FirebaseAuth auth;
    FirebaseUser currentUser;
    ProgressDialog dialog;
    private boolean connected = false;
    LayoutInflater inflater;
    TextView toastText;
    View toastLayout;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //custom toast
        inflater = getLayoutInflater();
        toastLayout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.toastLayout));
        toastText = (TextView) toastLayout.findViewById(R.id.toastText);
        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,150);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        //dialog
        dialog = new ProgressDialog(this, ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Sign In");
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        //Initialize id
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);
        //firebase auth
        auth = FirebaseAuth.getInstance();
        currentUser = auth.getCurrentUser();

        //google sign in
        binding.signInWithGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView signIn = findViewById(R.id.signInWithGoogle);
                signIn.setTextColor(getResources().getColor(R.color.activeGreen));
                startActivity(new Intent(SignInActivity.this, GoogleSignInActivity.class));
            }
        });

        //Goto sign in activity
        binding.goToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        //goto forgot password
        binding.forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInActivity.this,ForgotPasswordActivity.class));
            }
        });
        //Data Policy OnClickListener
        binding.dataPolicy.setOnClickListener
                (View -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url_play_privacy_policy)))));

        //goto log in button
        binding.signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //network check
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(SignInActivity.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                    if (!validateEmail() | !validatePassword()) {
                        return;
                    }
                    //hide keyboard
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    //other codes start here
                    String email = Objects.requireNonNull(binding.editTextEmail.getText()).toString();
                    String password = Objects.requireNonNull(binding.editTextPassword.getText()).toString();
                    auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                try {
                                    throw Objects.requireNonNull(task.getException());
                                } catch (FirebaseAuthInvalidUserException invalidEmail) {
                                    Log.d("TAG", "onComplete: invalid_email");
                                    toastText.setText(R.string.enter_register_email);
                                    toast.show();
                                } catch (FirebaseAuthInvalidCredentialsException wrongPassword) {
                                    Log.d("TAG", "onComplete: wrong_password");
                                    toastText.setText(R.string.PleaseCorrectPassword);
                                    toast.show();
                                } catch (Exception e) {
                                    Log.d("TAG", "onComplete: " + e.getMessage());
                                }
                            } else {
                                dialog.show();
                                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                                startActivity(intent);
                                toastText.setText(R.string.SignInSuccessfully);
                                toast.show();

                            }
                        }
                    });
                    dialog.dismiss();


                } else {
                    toastText.setText(R.string.no_connection_text);
                    toast.show();
                    connected = false;
                }
            }
        });
    }//end of onCreate

    //other codes and method here
    //email Validation
    private boolean validateEmail() {
        String emailInput = Objects.requireNonNull(textInputEmail.getEditText()).getText().toString().trim();
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
        String passwordInput = Objects.requireNonNull(textInputPassword.getEditText()).getText().toString().trim();
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

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}