package com.javascript.jscript.Activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.textfield.TextInputLayout;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivitySignUpBinding;

import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {
    //password validation patterns
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    //"(?=.*[@#$%^&+=])" +    //at least 1 special character
                    //"(?=\\S+$)" +           //no white spaces
                    ".{8,15}" +               //at least 8 characters
                    "$");

    ActivitySignUpBinding binding;//binding
    //InputVariables
    private TextInputLayout textInputUserName;
    private TextInputLayout textInputProfession;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //initialize id
        textInputUserName = findViewById(R.id.text_input_username);
        textInputProfession = findViewById(R.id.text_input_profession);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);

        //Register Button OnClickListener
        binding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //input fields validations check
                if (!validateUsername() | !validateProfession() | !validateEmail() | !validatePassword()) {
                    return;
                }
                //hide keyboard
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

                //other code start here
                Toast.makeText(SignUpActivity.this, "Registration Complete", Toast.LENGTH_SHORT).show();

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
            textInputUserName.setError("Field can't be empty");
            return false;
        } else if (usernameInput.length() > 12) {
            textInputUserName.setError("Username too long, 12 character only");
            return false;
        }else {
            textInputUserName.setError(null);
            return true;
        }
    }
    //profession Validation
    private boolean validateProfession() {
        String professionInput = textInputProfession.getEditText().getText().toString().trim();
        if (professionInput.isEmpty()) {
            textInputProfession.setError("Field can't be empty");
            return false;
        } else if (professionInput.length() > 20) {
            textInputProfession.setError("Profession too long, 20 character only");
            return false;
        } else {
            textInputProfession.setError(null);
            return true;
        }
    }
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
            }else{
                textInputPassword.setError("Password too weak");
            }
            return false;
        } else {
            textInputPassword.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }

    }

}