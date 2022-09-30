// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.applovin.mediation.ads.MaxAdView;
import com.javascript.jscript.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.ibrahimsn.lib.SmoothBottomBar;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaxAdView adView;

  @NonNull
  public final SmoothBottomBar bottomBar;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final ConstraintLayout mainContent;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull MaxAdView adView,
      @NonNull SmoothBottomBar bottomBar, @NonNull FrameLayout container,
      @NonNull ConstraintLayout mainContent, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.adView = adView;
    this.bottomBar = bottomBar;
    this.container = container;
    this.mainContent = mainContent;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adView;
      MaxAdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.bottomBar;
      SmoothBottomBar bottomBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomBar == null) {
        break missingId;
      }

      id = R.id.container;
      FrameLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      ConstraintLayout mainContent = (ConstraintLayout) rootView;

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, adView, bottomBar, container,
          mainContent, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}