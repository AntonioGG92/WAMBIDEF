// Generated by view binder compiler. Do not edit!
package com.example.wambishop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wambishop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText ContraseA;

  @NonNull
  public final EditText ContraseArConfirmar;

  @NonNull
  public final Button ModoInvitado;

  @NonNull
  public final Button botonVolverLogin;

  @NonNull
  public final Button button;

  @NonNull
  public final EditText editTextTextEmailAddress;

  @NonNull
  public final ImageView imageViewLogo;

  @NonNull
  public final ConstraintLayout registration;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textViewTitle;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull EditText ContraseA,
      @NonNull EditText ContraseArConfirmar, @NonNull Button ModoInvitado,
      @NonNull Button botonVolverLogin, @NonNull Button button,
      @NonNull EditText editTextTextEmailAddress, @NonNull ImageView imageViewLogo,
      @NonNull ConstraintLayout registration, @NonNull TextView textView2,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.ContraseA = ContraseA;
    this.ContraseArConfirmar = ContraseArConfirmar;
    this.ModoInvitado = ModoInvitado;
    this.botonVolverLogin = botonVolverLogin;
    this.button = button;
    this.editTextTextEmailAddress = editTextTextEmailAddress;
    this.imageViewLogo = imageViewLogo;
    this.registration = registration;
    this.textView2 = textView2;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Contraseña;
      EditText ContraseA = ViewBindings.findChildViewById(rootView, id);
      if (ContraseA == null) {
        break missingId;
      }

      id = R.id.ContraseñarConfirmar;
      EditText ContraseArConfirmar = ViewBindings.findChildViewById(rootView, id);
      if (ContraseArConfirmar == null) {
        break missingId;
      }

      id = R.id.Modo_Invitado;
      Button ModoInvitado = ViewBindings.findChildViewById(rootView, id);
      if (ModoInvitado == null) {
        break missingId;
      }

      id = R.id.boton_volver_login;
      Button botonVolverLogin = ViewBindings.findChildViewById(rootView, id);
      if (botonVolverLogin == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress;
      EditText editTextTextEmailAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress == null) {
        break missingId;
      }

      id = R.id.imageViewLogo;
      ImageView imageViewLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageViewLogo == null) {
        break missingId;
      }

      ConstraintLayout registration = (ConstraintLayout) rootView;

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, ContraseA,
          ContraseArConfirmar, ModoInvitado, botonVolverLogin, button, editTextTextEmailAddress,
          imageViewLogo, registration, textView2, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
