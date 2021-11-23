package com.javascript.jscript.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.javascript.jscript.R;
import com.javascript.jscript.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    private TextInputLayout textInputUserName;
    private TextInputLayout textInputProfession;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //change status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(SignUpActivity.this, R.color.colorStatusBarDark));
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        textInputUserName = findViewById(R.id.text_input_username);
        textInputProfession = findViewById(R.id.text_input_profession);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);

        binding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateUsername() | !validateProfession() | !validateEmail() | !validatePassword()){
                    return;
                }

                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);

                Toast.makeText(SignUpActivity.this, "Registration Complete", Toast.LENGTH_SHORT).show();
            }

        });

    }

    private boolean validateUsername(){
        String usernameInput = textInputUserName.getEditText().getText().toString().trim();
        if (usernameInput.isEmpty()){
            textInputUserName.setError("Field can't be empty");
            return false;
        }else if (usernameInput.length() > 12){
            textInputUserName.setError("Username too long");
            return false;
        }else {
            textInputUserName.setError(null);
            return true;
        }
    }

    private boolean validateProfession(){
        String professionInput = textInputProfession.getEditText().getText().toString().trim();
        if (professionInput.isEmpty()){
            textInputProfession.setError("Field can't be empty");
            return false;
        }else if (professionInput.length() > 20){
            textInputProfession.setError("Profession too long");
            return false;
        }else {
            textInputProfession.setError(null);
            return true;
        }
    }

    private boolean validateEmail(){
        String emailInput = textInputEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()){
            textInputEmail.setError("Field can't be empty");
            return false;
        }else{
            textInputEmail.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validatePassword(){
        String passwordInput = textInputPassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()){
            textInputPassword.setError("Field can't be empty");
            return false;
        }else{
            textInputPassword.setError(null);
            //textInputEmail.setErrorEnabled(false);
            return true;
        }

    }

    /*private void closeKeyboard(){
        View view = this.getCurrentFocus();
        if (view != null){
            InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
        }
    }*/

}