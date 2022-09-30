// Generated by view binder compiler. Do not edit!
package com.javascript.jscript.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.javascript.jscript.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFollowUsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View contactUs;

  @NonNull
  public final View cpView2;

  @NonNull
  public final TextView fwCopyrights;

  @NonNull
  public final TextView fwVersion;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final ImageView proBadge;

  @NonNull
  public final TextView proUserName;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final Toolbar toolbar3;

  @NonNull
  public final View view14;

  @NonNull
  public final View view16;

  @NonNull
  public final View view18;

  @NonNull
  public final View view22;

  @NonNull
  public final View view24;

  @NonNull
  public final View view4;

  @NonNull
  public final View view5;

  @NonNull
  public final View view7;

  @NonNull
  public final View viewFacebook;

  @NonNull
  public final View viewGithub;

  @NonNull
  public final View viewInstagram;

  @NonNull
  public final View viewLinkedin;

  @NonNull
  public final View viewPlayStore;

  @NonNull
  public final View viewTwitter;

  @NonNull
  public final View viewWebsite;

  private ActivityFollowUsBinding(@NonNull ConstraintLayout rootView, @NonNull View contactUs,
      @NonNull View cpView2, @NonNull TextView fwCopyrights, @NonNull TextView fwVersion,
      @NonNull ImageView imageView10, @NonNull ImageView imageView11,
      @NonNull ImageView imageView12, @NonNull ImageView imageView5, @NonNull ImageView imageView7,
      @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView proBadge,
      @NonNull TextView proUserName, @NonNull ImageView profileImage, @NonNull TextView textView10,
      @NonNull TextView textView16, @NonNull TextView textView18, @NonNull TextView textView20,
      @NonNull TextView textView21, @NonNull TextView textView22, @NonNull TextView textView23,
      @NonNull TextView textView24, @NonNull TextView textView25, @NonNull Toolbar toolbar3,
      @NonNull View view14, @NonNull View view16, @NonNull View view18, @NonNull View view22,
      @NonNull View view24, @NonNull View view4, @NonNull View view5, @NonNull View view7,
      @NonNull View viewFacebook, @NonNull View viewGithub, @NonNull View viewInstagram,
      @NonNull View viewLinkedin, @NonNull View viewPlayStore, @NonNull View viewTwitter,
      @NonNull View viewWebsite) {
    this.rootView = rootView;
    this.contactUs = contactUs;
    this.cpView2 = cpView2;
    this.fwCopyrights = fwCopyrights;
    this.fwVersion = fwVersion;
    this.imageView10 = imageView10;
    this.imageView11 = imageView11;
    this.imageView12 = imageView12;
    this.imageView5 = imageView5;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.proBadge = proBadge;
    this.proUserName = proUserName;
    this.profileImage = profileImage;
    this.textView10 = textView10;
    this.textView16 = textView16;
    this.textView18 = textView18;
    this.textView20 = textView20;
    this.textView21 = textView21;
    this.textView22 = textView22;
    this.textView23 = textView23;
    this.textView24 = textView24;
    this.textView25 = textView25;
    this.toolbar3 = toolbar3;
    this.view14 = view14;
    this.view16 = view16;
    this.view18 = view18;
    this.view22 = view22;
    this.view24 = view24;
    this.view4 = view4;
    this.view5 = view5;
    this.view7 = view7;
    this.viewFacebook = viewFacebook;
    this.viewGithub = viewGithub;
    this.viewInstagram = viewInstagram;
    this.viewLinkedin = viewLinkedin;
    this.viewPlayStore = viewPlayStore;
    this.viewTwitter = viewTwitter;
    this.viewWebsite = viewWebsite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFollowUsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFollowUsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_follow_us, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFollowUsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contactUs;
      View contactUs = ViewBindings.findChildViewById(rootView, id);
      if (contactUs == null) {
        break missingId;
      }

      id = R.id.cpView2;
      View cpView2 = ViewBindings.findChildViewById(rootView, id);
      if (cpView2 == null) {
        break missingId;
      }

      id = R.id.fwCopyrights;
      TextView fwCopyrights = ViewBindings.findChildViewById(rootView, id);
      if (fwCopyrights == null) {
        break missingId;
      }

      id = R.id.fw_version;
      TextView fwVersion = ViewBindings.findChildViewById(rootView, id);
      if (fwVersion == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = ViewBindings.findChildViewById(rootView, id);
      if (imageView12 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.proBadge;
      ImageView proBadge = ViewBindings.findChildViewById(rootView, id);
      if (proBadge == null) {
        break missingId;
      }

      id = R.id.proUserName;
      TextView proUserName = ViewBindings.findChildViewById(rootView, id);
      if (proUserName == null) {
        break missingId;
      }

      id = R.id.profileImage;
      ImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = ViewBindings.findChildViewById(rootView, id);
      if (textView24 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.toolbar3;
      Toolbar toolbar3 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar3 == null) {
        break missingId;
      }

      id = R.id.view14;
      View view14 = ViewBindings.findChildViewById(rootView, id);
      if (view14 == null) {
        break missingId;
      }

      id = R.id.view16;
      View view16 = ViewBindings.findChildViewById(rootView, id);
      if (view16 == null) {
        break missingId;
      }

      id = R.id.view18;
      View view18 = ViewBindings.findChildViewById(rootView, id);
      if (view18 == null) {
        break missingId;
      }

      id = R.id.view22;
      View view22 = ViewBindings.findChildViewById(rootView, id);
      if (view22 == null) {
        break missingId;
      }

      id = R.id.view24;
      View view24 = ViewBindings.findChildViewById(rootView, id);
      if (view24 == null) {
        break missingId;
      }

      id = R.id.view4;
      View view4 = ViewBindings.findChildViewById(rootView, id);
      if (view4 == null) {
        break missingId;
      }

      id = R.id.view5;
      View view5 = ViewBindings.findChildViewById(rootView, id);
      if (view5 == null) {
        break missingId;
      }

      id = R.id.view7;
      View view7 = ViewBindings.findChildViewById(rootView, id);
      if (view7 == null) {
        break missingId;
      }

      id = R.id.view_facebook;
      View viewFacebook = ViewBindings.findChildViewById(rootView, id);
      if (viewFacebook == null) {
        break missingId;
      }

      id = R.id.view_github;
      View viewGithub = ViewBindings.findChildViewById(rootView, id);
      if (viewGithub == null) {
        break missingId;
      }

      id = R.id.view_instagram;
      View viewInstagram = ViewBindings.findChildViewById(rootView, id);
      if (viewInstagram == null) {
        break missingId;
      }

      id = R.id.view_linkedin;
      View viewLinkedin = ViewBindings.findChildViewById(rootView, id);
      if (viewLinkedin == null) {
        break missingId;
      }

      id = R.id.view_play_store;
      View viewPlayStore = ViewBindings.findChildViewById(rootView, id);
      if (viewPlayStore == null) {
        break missingId;
      }

      id = R.id.view_twitter;
      View viewTwitter = ViewBindings.findChildViewById(rootView, id);
      if (viewTwitter == null) {
        break missingId;
      }

      id = R.id.view_website;
      View viewWebsite = ViewBindings.findChildViewById(rootView, id);
      if (viewWebsite == null) {
        break missingId;
      }

      return new ActivityFollowUsBinding((ConstraintLayout) rootView, contactUs, cpView2,
          fwCopyrights, fwVersion, imageView10, imageView11, imageView12, imageView5, imageView7,
          imageView8, imageView9, proBadge, proUserName, profileImage, textView10, textView16,
          textView18, textView20, textView21, textView22, textView23, textView24, textView25,
          toolbar3, view14, view16, view18, view22, view24, view4, view5, view7, viewFacebook,
          viewGithub, viewInstagram, viewLinkedin, viewPlayStore, viewTwitter, viewWebsite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}