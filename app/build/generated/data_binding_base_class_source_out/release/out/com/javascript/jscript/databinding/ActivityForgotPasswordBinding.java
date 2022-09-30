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

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText editTextEmail;

  @NonNull
  public final Button forgotPasswordBtn;

  @NonNull
  public final TextView goToSignIn;

  @NonNull
  public final LottieAnimationView imageView3;

  @NonNull
  public final TextInputLayout textInputEmail;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView7;

  private ActivityForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText editTextEmail, @NonNull Button forgotPasswordBtn,
      @NonNull TextView goToSignIn, @NonNull LottieAnimationView imageView3,
      @NonNull TextInputLayout textInputEmail, @NonNull TextView textView3,
      @NonNull TextView textView5, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.editTextEmail = editTextEmail;
    this.forgotPasswordBtn = forgotPasswordBtn;
    this.goToSignIn = goToSignIn;
    this.imageView3 = imageView3;
    this.textInputEmail = textInputEmail;
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
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextEmail;
      TextInputEditText editTextEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmail == null) {
        break missingId;
      }

      id = R.id.forgotPasswordBtn;
      Button forgotPasswordBtn = ViewBindings.findChildViewById(rootView, id);
      if (forgotPasswordBtn == null) {
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

      id = R.id.text_input_email;
      TextInputLayout textInputEmail = ViewBindings.findChildViewById(rootView, id);
      if (textInputEmail == null) {
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

      return new ActivityForgotPasswordBinding((ConstraintLayout) rootView, editTextEmail,
          forgotPasswordBtn, goToSignIn, imageView3, textInputEmail, textView3, textView5,
          textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}