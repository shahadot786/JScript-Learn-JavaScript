// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.applovin.mediation.ads.MaxAdView;
import com.javascript.jscript.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityQuizResultBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView correctAns;

  @NonNull
  public final MaxAdView mRec;

  @NonNull
  public final LottieAnimationView quizAnimation;

  @NonNull
  public final TextView quizMessage;

  @NonNull
  public final ImageView quizTrophy;

  @NonNull
  public final AppCompatButton startNewQuizBtn;

  @NonNull
  public final TextView textView27;

  @NonNull
  public final TextView textView41;

  @NonNull
  public final Toolbar toolbar2;

  @NonNull
  public final TextView wrongAns;

  private ActivityQuizResultBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView correctAns, @NonNull MaxAdView mRec,
      @NonNull LottieAnimationView quizAnimation, @NonNull TextView quizMessage,
      @NonNull ImageView quizTrophy, @NonNull AppCompatButton startNewQuizBtn,
      @NonNull TextView textView27, @NonNull TextView textView41, @NonNull Toolbar toolbar2,
      @NonNull TextView wrongAns) {
    this.rootView = rootView;
    this.correctAns = correctAns;
    this.mRec = mRec;
    this.quizAnimation = quizAnimation;
    this.quizMessage = quizMessage;
    this.quizTrophy = quizTrophy;
    this.startNewQuizBtn = startNewQuizBtn;
    this.textView27 = textView27;
    this.textView41 = textView41;
    this.toolbar2 = toolbar2;
    this.wrongAns = wrongAns;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityQuizResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityQuizResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_quiz_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityQuizResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.correctAns;
      TextView correctAns = ViewBindings.findChildViewById(rootView, id);
      if (correctAns == null) {
        break missingId;
      }

      id = R.id.mRec;
      MaxAdView mRec = ViewBindings.findChildViewById(rootView, id);
      if (mRec == null) {
        break missingId;
      }

      id = R.id.quizAnimation;
      LottieAnimationView quizAnimation = ViewBindings.findChildViewById(rootView, id);
      if (quizAnimation == null) {
        break missingId;
      }

      id = R.id.quizMessage;
      TextView quizMessage = ViewBindings.findChildViewById(rootView, id);
      if (quizMessage == null) {
        break missingId;
      }

      id = R.id.quizTrophy;
      ImageView quizTrophy = ViewBindings.findChildViewById(rootView, id);
      if (quizTrophy == null) {
        break missingId;
      }

      id = R.id.startNewQuizBtn;
      AppCompatButton startNewQuizBtn = ViewBindings.findChildViewById(rootView, id);
      if (startNewQuizBtn == null) {
        break missingId;
      }

      id = R.id.textView27;
      TextView textView27 = ViewBindings.findChildViewById(rootView, id);
      if (textView27 == null) {
        break missingId;
      }

      id = R.id.textView41;
      TextView textView41 = ViewBindings.findChildViewById(rootView, id);
      if (textView41 == null) {
        break missingId;
      }

      id = R.id.toolbar2;
      Toolbar toolbar2 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar2 == null) {
        break missingId;
      }

      id = R.id.wrongAns;
      TextView wrongAns = ViewBindings.findChildViewById(rootView, id);
      if (wrongAns == null) {
        break missingId;
      }

      return new ActivityQuizResultBinding((ConstraintLayout) rootView, correctAns, mRec,
          quizAnimation, quizMessage, quizTrophy, startNewQuizBtn, textView27, textView41, toolbar2,
          wrongAns);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}