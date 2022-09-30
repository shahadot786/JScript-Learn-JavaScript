// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.javascript.jscript.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGoogleSignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView imageView14;

  @NonNull
  public final TextView privacy;

  @NonNull
  public final AppCompatTextView signInGoogle;

  @NonNull
  public final AppCompatTextView signUpEmail;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView7;

  private ActivityGoogleSignInBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView imageView14, @NonNull TextView privacy,
      @NonNull AppCompatTextView signInGoogle, @NonNull AppCompatTextView signUpEmail,
      @NonNull TextView textView2, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.imageView14 = imageView14;
    this.privacy = privacy;
    this.signInGoogle = signInGoogle;
    this.signUpEmail = signUpEmail;
    this.textView2 = textView2;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGoogleSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGoogleSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_google_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGoogleSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView14;
      LottieAnimationView imageView14 = ViewBindings.findChildViewById(rootView, id);
      if (imageView14 == null) {
        break missingId;
      }

      id = R.id.privacy;
      TextView privacy = ViewBindings.findChildViewById(rootView, id);
      if (privacy == null) {
        break missingId;
      }

      id = R.id.signInGoogle;
      AppCompatTextView signInGoogle = ViewBindings.findChildViewById(rootView, id);
      if (signInGoogle == null) {
        break missingId;
      }

      id = R.id.signUpEmail;
      AppCompatTextView signUpEmail = ViewBindings.findChildViewById(rootView, id);
      if (signUpEmail == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityGoogleSignInBinding((ConstraintLayout) rootView, imageView14, privacy,
          signInGoogle, signUpEmail, textView2, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}