// Generated by view binder compiler. Do not edit!
package com.example.wambishop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wambishop.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTiendaSecundariaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addToCartButton;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final ImageButton favoriteButton;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  private ActivityTiendaSecundariaBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button addToCartButton, @NonNull BottomNavigationView bottomNavigationView,
      @NonNull ImageButton favoriteButton, @NonNull ImageView productImage,
      @NonNull TextView productName, @NonNull TextView productPrice) {
    this.rootView = rootView;
    this.addToCartButton = addToCartButton;
    this.bottomNavigationView = bottomNavigationView;
    this.favoriteButton = favoriteButton;
    this.productImage = productImage;
    this.productName = productName;
    this.productPrice = productPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTiendaSecundariaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTiendaSecundariaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tienda_secundaria, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTiendaSecundariaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addToCartButton;
      Button addToCartButton = ViewBindings.findChildViewById(rootView, id);
      if (addToCartButton == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.favoriteButton;
      ImageButton favoriteButton = ViewBindings.findChildViewById(rootView, id);
      if (favoriteButton == null) {
        break missingId;
      }

      id = R.id.productImage;
      ImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.productName;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.productPrice;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      return new ActivityTiendaSecundariaBinding((ConstraintLayout) rootView, addToCartButton,
          bottomNavigationView, favoriteButton, productImage, productName, productPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
