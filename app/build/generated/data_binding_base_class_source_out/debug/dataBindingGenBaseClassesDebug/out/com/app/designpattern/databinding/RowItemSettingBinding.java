package com.app.designpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.designpattern.model.handler.ISettingItemEventListner;
import com.app.designpattern.model.vo.SettingModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowItemSettingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView2;

  @Bindable
  protected SettingModel mModel;

  @Bindable
  protected ISettingItemEventListner mCallback;

  protected RowItemSettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView, ImageView imageView2, TextView textView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.textView2 = textView2;
  }

  public abstract void setModel(@Nullable SettingModel model);

  @Nullable
  public SettingModel getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable ISettingItemEventListner callback);

  @Nullable
  public ISettingItemEventListner getCallback() {
    return mCallback;
  }

  @NonNull
  public static RowItemSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_item_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowItemSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowItemSettingBinding>inflateInternal(inflater, com.app.designpattern.R.layout.row_item_setting, root, attachToRoot, component);
  }

  @NonNull
  public static RowItemSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_item_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowItemSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowItemSettingBinding>inflateInternal(inflater, com.app.designpattern.R.layout.row_item_setting, null, false, component);
  }

  public static RowItemSettingBinding bind(@NonNull View view) {
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
  public static RowItemSettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowItemSettingBinding)bind(component, view, com.app.designpattern.R.layout.row_item_setting);
  }
}
