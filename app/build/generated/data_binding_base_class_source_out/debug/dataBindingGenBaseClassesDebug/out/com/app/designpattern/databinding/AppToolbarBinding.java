package com.app.designpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AppToolbarBinding extends ViewDataBinding {
  @NonNull
  public final TextView headerTitle;

  @NonNull
  public final ImageView leftIcon;

  @NonNull
  public final ImageView rightIcon;

  protected AppToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView headerTitle, ImageView leftIcon, ImageView rightIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerTitle = headerTitle;
    this.leftIcon = leftIcon;
    this.rightIcon = rightIcon;
  }

  @NonNull
  public static AppToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_toolbar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AppToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AppToolbarBinding>inflateInternal(inflater, com.app.designpattern.R.layout.app_toolbar, root, attachToRoot, component);
  }

  @NonNull
  public static AppToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_toolbar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AppToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AppToolbarBinding>inflateInternal(inflater, com.app.designpattern.R.layout.app_toolbar, null, false, component);
  }

  public static AppToolbarBinding bind(@NonNull View view) {
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
  public static AppToolbarBinding bind(@NonNull View view, @Nullable Object component) {
    return (AppToolbarBinding)bind(component, view, com.app.designpattern.R.layout.app_toolbar);
  }
}
