// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
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

public final class ActivityReadBooksBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaxAdView adView;

  @NonNull
  public final WebView booksWebView;

  @NonNull
  public final Toolbar toolbar2;

  private ActivityReadBooksBinding(@NonNull ConstraintLayout rootView, @NonNull MaxAdView adView,
      @NonNull WebView booksWebView, @NonNull Toolbar toolbar2) {
    this.rootView = rootView;
    this.adView = adView;
    this.booksWebView = booksWebView;
    this.toolbar2 = toolbar2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityReadBooksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityReadBooksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_read_books, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityReadBooksBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adView;
      MaxAdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.booksWebView;
      WebView booksWebView = ViewBindings.findChildViewById(rootView, id);
      if (booksWebView == null) {
        break missingId;
      }

      id = R.id.toolbar2;
      Toolbar toolbar2 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar2 == null) {
        break missingId;
      }

      return new ActivityReadBooksBinding((ConstraintLayout) rootView, adView, booksWebView,
          toolbar2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
