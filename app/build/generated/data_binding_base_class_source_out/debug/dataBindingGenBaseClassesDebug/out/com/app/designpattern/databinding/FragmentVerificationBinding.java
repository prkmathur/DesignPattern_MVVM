package com.app.designpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.designpattern.viewmodel.auth.VerificationViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentVerificationBinding extends ViewDataBinding {
  @NonNull
  public final Button btnVerify;

  @NonNull
  public final EditText edtVerificationCode;

  @Bindable
  protected VerificationViewModel mData;

  protected FragmentVerificationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnVerify, EditText edtVerificationCode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnVerify = btnVerify;
    this.edtVerificationCode = edtVerificationCode;
  }

  public abstract void setData(@Nullable VerificationViewModel data);

  @Nullable
  public VerificationViewModel getData() {
    return mData;
  }

  @NonNull
  public static FragmentVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_verification, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentVerificationBinding>inflateInternal(inflater, com.app.designpattern.R.layout.fragment_verification, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentVerificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_verification, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentVerificationBinding>inflateInternal(inflater, com.app.designpattern.R.layout.fragment_verification, null, false, component);
  }

  public static FragmentVerificationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentVerificationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentVerificationBinding)bind(component, view, com.app.designpattern.R.layout.fragment_verification);
  }
}
