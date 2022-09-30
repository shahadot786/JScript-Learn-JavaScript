// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.javascript.jscript.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomNotificationIconLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View dotViews;

  @NonNull
  public final ImageView imageView6;

  private CustomNotificationIconLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull View dotViews, @NonNull ImageView imageView6) {
    this.rootView = rootView;
    this.dotViews = dotViews;
    this.imageView6 = imageView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomNotificationIconLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomNotificationIconLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_notification_icon_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomNotificationIconLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dotViews;
      View dotViews = ViewBindings.findChildViewById(rootView, id);
      if (dotViews == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      return new CustomNotificationIconLayoutBinding((ConstraintLayout) rootView, dotViews,
          imageView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}