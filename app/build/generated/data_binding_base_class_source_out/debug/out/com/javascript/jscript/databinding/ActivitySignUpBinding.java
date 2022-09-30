// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.javascript.jscript.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dataPolicy;

  @NonNull
  public final TextInputEditText editTextEmail;

  @NonNull
  public final TextInputEditText editTextPassword;

  @NonNull
  public final TextInputEditText editTextUsername;

  @NonNull
  public final TextView goToSignIn;

  @NonNull
  public final LottieAnimationView imageView3;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final TextInputLayout textInputEmail;

  @NonNull
  public final TextInputLayout textInputPassword;

  @NonNull
  public final TextInputLayout textInputUsername;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView7;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView, @NonNull TextView dataPolicy,
      @NonNull TextInputEditText editTextEmail, @NonNull TextInputEditText editTextPassword,
      @NonNull TextInputEditText editTextUsername, @NonNull TextView goToSignIn,
      @NonNull LottieAnimationView imageView3, @NonNull Button registerBtn,
      @NonNull TextInputLayout textInputEmail, @NonNull TextInputLayout textInputPassword,
      @NonNull TextInputLayout textInputUsername, @NonNull TextView textView3,
      @NonNull TextView textView5, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.dataPolicy = dataPolicy;
    this.editTextEmail = editTextEmail;
    this.editTextPassword = editTextPassword;
    this.editTextUsername = editTextUsername;
    this.goToSignIn = goToSignIn;
    this.imageView3 = imageView3;
    this.registerBtn = registerBtn;
    this.textInputEmail = textInputEmail;
    this.textInputPassword = textInputPassword;
    this.textInputUsername = textInputUsername;
    this.textView3 = textView3;
    this.textView5 = textView5;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.data_policy;
      TextView dataPolicy = ViewBindings.findChildViewById(rootView, id);
      if (dataPolicy == null) {
        break missingId;
      }

      id = R.id.editTextEmail;
      TextInputEditText editTextEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmail == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      TextInputEditText editTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextUsername;
      TextInputEditText editTextUsername = ViewBindings.findChildViewById(rootView, id);
      if (editTextUsername == null) {
        break missingId;
      }

      id = R.id.goToSignIn;
      TextView goToSignIn = ViewBindings.findChildViewById(rootView, id);
      if (goToSignIn == null) {
        break missingId;
      }

      id = R.id.imageView3;
      LottieAnimationView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.text_input_email;
      TextInputLayout textInputEmail = ViewBindings.findChildViewById(rootView, id);
      if (textInputEmail == null) {
        break missingId;
      }

      id = R.id.text_input_password;
      TextInputLayout textInputPassword = ViewBindings.findChildViewById(rootView, id);
      if (textInputPassword == null) {
        break missingId;
      }

      id = R.id.text_input_username;
      TextInputLayout textInputUsername = ViewBindings.findChildViewById(rootView, id);
      if (textInputUsername == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, dataPolicy, editTextEmail,
          editTextPassword, editTextUsername, goToSignIn, imageView3, registerBtn, textInputEmail,
          textInputPassword, textInputUsername, textView3, textView5, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}