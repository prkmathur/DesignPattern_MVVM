package com.app.designpattern.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityViewPagerBinding extends ViewDataBinding {
  @NonNull
  public final ViewPager viewPager;

  protected ActivityViewPagerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_view_pager, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityViewPagerBinding>inflateInternal(inflater, com.app.designpattern.R.layout.activity_view_pager, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityViewPagerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_view_pager, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityViewPagerBinding>inflateInternal(inflater, com.app.designpattern.R.layout.activity_view_pager, null, false, component);
  }

  public static ActivityViewPagerBinding bind(@NonNull View view) {
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
  public static ActivityViewPagerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityViewPagerBinding)bind(component, view, com.app.designpattern.R.layout.activity_view_pager);
  }
}
