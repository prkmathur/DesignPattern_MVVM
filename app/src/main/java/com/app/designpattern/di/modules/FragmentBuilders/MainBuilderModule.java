package com.app.designpattern.di.modules.FragmentBuilders;

import com.app.designpattern.di.modules.viewmodules.mainviewmodules.ChangePasswordViewModelModule;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.HomeViewModelModule;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.JobViewModelModule;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.NotificationViewModelModule;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.ProfileViewModelModule;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.SettingViewModelModule;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.WebViewModelModule;
import com.app.designpattern.di.modules.viewmodules.navigatorviewmodules.CenterViewModelModule;
import com.app.designpattern.di.modules.viewmodules.navigatorviewmodules.LeftViewModelModule;
import com.app.designpattern.di.modules.viewmodules.navigatorviewmodules.RightViewModelModule;
import com.app.designpattern.view.main.HomeFragment;
import com.app.designpattern.view.main.JobFragment;
import com.app.designpattern.view.main.NotificationsFragment;
import com.app.designpattern.view.main.SettingFragment;
import com.app.designpattern.view.main.setting.ChangePasswordFragment;
import com.app.designpattern.view.main.setting.ProfileFragment;
import com.app.designpattern.view.main.setting.WebViewFragment;
import com.app.designpattern.view.navigator.CenterFragment;
import com.app.designpattern.view.navigator.LeftFragment;
import com.app.designpattern.view.navigator.RightFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainBuilderModule {

    @ContributesAndroidInjector(modules = HomeViewModelModule.class)
    abstract HomeFragment contributeHomeFragment();

    @ContributesAndroidInjector(modules = JobViewModelModule.class)
    abstract JobFragment contributeJobFragment();

    @ContributesAndroidInjector(modules = SettingViewModelModule.class)
    abstract SettingFragment contributeSettingFragment();

    @ContributesAndroidInjector(modules = ProfileViewModelModule.class)
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector(modules = WebViewModelModule.class)
    abstract WebViewFragment contributeWebViewFragment();

    @ContributesAndroidInjector(modules = ChangePasswordViewModelModule.class)
    abstract ChangePasswordFragment contributeChangePasswordFragment();

    @ContributesAndroidInjector(modules = NotificationViewModelModule.class)
    abstract NotificationsFragment contributeNotificationsFragment();


}
