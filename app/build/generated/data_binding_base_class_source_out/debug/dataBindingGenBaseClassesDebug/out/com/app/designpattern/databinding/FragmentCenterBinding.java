package com.app.designpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.designpattern.util.Toolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCenterBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar appToolbar;

  @NonNull
  public final BottomNavigationView bottomNav;

  @NonNull
  public final FrameLayout navHostContainer;

  protected FragmentCenterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Toolbar appToolbar, BottomNavigationView bottomNav, FrameLayout navHostContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appToolbar = appToolbar;
    this.bottomNav = bottomNav;
    this.navHostContainer = navHostContainer;
  }

  @NonNull
  public static FragmentCenterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_center, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCenterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCenterBinding>inflateInternal(inflater, com.app.designpattern.R.layout.fragment_center, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCenterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_center, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCenterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCenterBinding>inflateInternal(inflater, com.app.designpattern.R.layout.fragment_center, null, false, component);
  }

  public static FragmentCenterBinding bind(@NonNull View view) {
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
  public static FragmentCenterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCenterBinding)bind(component, view, com.app.designpattern.R.layout.fragment_center);
  }
}
