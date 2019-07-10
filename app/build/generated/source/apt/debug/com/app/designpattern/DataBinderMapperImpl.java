package com.app.designpattern;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.designpattern.databinding.ActivityAuthBindingImpl;
import com.app.designpattern.databinding.ActivityMainBindingImpl;
import com.app.designpattern.databinding.ActivityViewPagerBindingImpl;
import com.app.designpattern.databinding.AppToolbarBindingImpl;
import com.app.designpattern.databinding.FragmentCenterBindingImpl;
import com.app.designpattern.databinding.FragmentChangePasswordBindingImpl;
import com.app.designpattern.databinding.FragmentHomeBindingImpl;
import com.app.designpattern.databinding.FragmentJobsBindingImpl;
import com.app.designpattern.databinding.FragmentLeftBindingImpl;
import com.app.designpattern.databinding.FragmentLoginBindingImpl;
import com.app.designpattern.databinding.FragmentNotificationsBindingImpl;
import com.app.designpattern.databinding.FragmentProfileBindingImpl;
import com.app.designpattern.databinding.FragmentRegisterBindingImpl;
import com.app.designpattern.databinding.FragmentRightBindingImpl;
import com.app.designpattern.databinding.FragmentSettingBindingImpl;
import com.app.designpattern.databinding.FragmentSplashBindingImpl;
import com.app.designpattern.databinding.FragmentVerificationBindingImpl;
import com.app.designpattern.databinding.FragmentWebViewBindingImpl;
import com.app.designpattern.databinding.RowItemSettingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAUTH = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYVIEWPAGER = 3;

  private static final int LAYOUT_APPTOOLBAR = 4;

  private static final int LAYOUT_FRAGMENTCENTER = 5;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 6;

  private static final int LAYOUT_FRAGMENTHOME = 7;

  private static final int LAYOUT_FRAGMENTJOBS = 8;

  private static final int LAYOUT_FRAGMENTLEFT = 9;

  private static final int LAYOUT_FRAGMENTLOGIN = 10;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 11;

  private static final int LAYOUT_FRAGMENTPROFILE = 12;

  private static final int LAYOUT_FRAGMENTREGISTER = 13;

  private static final int LAYOUT_FRAGMENTRIGHT = 14;

  private static final int LAYOUT_FRAGMENTSETTING = 15;

  private static final int LAYOUT_FRAGMENTSPLASH = 16;

  private static final int LAYOUT_FRAGMENTVERIFICATION = 17;

  private static final int LAYOUT_FRAGMENTWEBVIEW = 18;

  private static final int LAYOUT_ROWITEMSETTING = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.activity_auth, LAYOUT_ACTIVITYAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.activity_view_pager, LAYOUT_ACTIVITYVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.app_toolbar, LAYOUT_APPTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_center, LAYOUT_FRAGMENTCENTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_jobs, LAYOUT_FRAGMENTJOBS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_left, LAYOUT_FRAGMENTLEFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_notifications, LAYOUT_FRAGMENTNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_right, LAYOUT_FRAGMENTRIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_verification, LAYOUT_FRAGMENTVERIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.fragment_web_view, LAYOUT_FRAGMENTWEBVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.designpattern.R.layout.row_item_setting, LAYOUT_ROWITEMSETTING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAUTH: {
          if ("layout/activity_auth_0".equals(tag)) {
            return new ActivityAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIEWPAGER: {
          if ("layout/activity_view_pager_0".equals(tag)) {
            return new ActivityViewPagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_view_pager is invalid. Received: " + tag);
        }
        case  LAYOUT_APPTOOLBAR: {
          if ("layout/app_toolbar_0".equals(tag)) {
            return new AppToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCENTER: {
          if ("layout/fragment_center_0".equals(tag)) {
            return new FragmentCenterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_center is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
          if ("layout/fragment_change_password_0".equals(tag)) {
            return new FragmentChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTJOBS: {
          if ("layout/fragment_jobs_0".equals(tag)) {
            return new FragmentJobsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_jobs is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLEFT: {
          if ("layout/fragment_left_0".equals(tag)) {
            return new FragmentLeftBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_left is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTIFICATIONS: {
          if ("layout/fragment_notifications_0".equals(tag)) {
            return new FragmentNotificationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_notifications is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRIGHT: {
          if ("layout/fragment_right_0".equals(tag)) {
            return new FragmentRightBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_right is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVERIFICATION: {
          if ("layout/fragment_verification_0".equals(tag)) {
            return new FragmentVerificationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_verification is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWEBVIEW: {
          if ("layout/fragment_web_view_0".equals(tag)) {
            return new FragmentWebViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_web_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWITEMSETTING: {
          if ("layout/row_item_setting_0".equals(tag)) {
            return new RowItemSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_item_setting is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "firstName");
      sKeys.put(2, "lastName");
      sKeys.put(3, "password");
      sKeys.put(4, "data");
      sKeys.put(5, "phone");
      sKeys.put(6, "callback");
      sKeys.put(7, "oTP");
      sKeys.put(8, "model");
      sKeys.put(9, "error");
      sKeys.put(10, "userId");
      sKeys.put(11, "email");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(19);

    static {
      sKeys.put("layout/activity_auth_0", com.app.designpattern.R.layout.activity_auth);
      sKeys.put("layout/activity_main_0", com.app.designpattern.R.layout.activity_main);
      sKeys.put("layout/activity_view_pager_0", com.app.designpattern.R.layout.activity_view_pager);
      sKeys.put("layout/app_toolbar_0", com.app.designpattern.R.layout.app_toolbar);
      sKeys.put("layout/fragment_center_0", com.app.designpattern.R.layout.fragment_center);
      sKeys.put("layout/fragment_change_password_0", com.app.designpattern.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_home_0", com.app.designpattern.R.layout.fragment_home);
      sKeys.put("layout/fragment_jobs_0", com.app.designpattern.R.layout.fragment_jobs);
      sKeys.put("layout/fragment_left_0", com.app.designpattern.R.layout.fragment_left);
      sKeys.put("layout/fragment_login_0", com.app.designpattern.R.layout.fragment_login);
      sKeys.put("layout/fragment_notifications_0", com.app.designpattern.R.layout.fragment_notifications);
      sKeys.put("layout/fragment_profile_0", com.app.designpattern.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", com.app.designpattern.R.layout.fragment_register);
      sKeys.put("layout/fragment_right_0", com.app.designpattern.R.layout.fragment_right);
      sKeys.put("layout/fragment_setting_0", com.app.designpattern.R.layout.fragment_setting);
      sKeys.put("layout/fragment_splash_0", com.app.designpattern.R.layout.fragment_splash);
      sKeys.put("layout/fragment_verification_0", com.app.designpattern.R.layout.fragment_verification);
      sKeys.put("layout/fragment_web_view_0", com.app.designpattern.R.layout.fragment_web_view);
      sKeys.put("layout/row_item_setting_0", com.app.designpattern.R.layout.row_item_setting);
    }
  }
}
