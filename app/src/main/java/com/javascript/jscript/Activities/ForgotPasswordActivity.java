package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivityForgotPasswordBinding;

public class ForgotPasswordActivity extends AppCompatActivity {

    //binding
    ActivityForgotPasswordBinding binding;
    TextInputLayout textInputLayoutEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityForgotPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //find id
        textInputLayoutEmail = findViewById(R.id.text_input_email);
        //button forgot listener
        binding.forgotPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check first email validation
                validateEmail();
                //other codes

            }
        });

        binding.goToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPasswordActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });




    }
    //others methods
    //email Validation
    private boolean validateEmail() {
        String emailInput = textInputLayoutEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()) {
            textInputLayoutEmail.setError("Field can't be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            textInputLayoutEmail.setError("Please enter a valid email address");
            return false;
        } else {
            textInputLayoutEmail.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }
    }




}