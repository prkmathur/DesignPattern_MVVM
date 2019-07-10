package com.app.designpattern.di.modules.viewmodules.mainviewmodules;

import androidx.lifecycle.ViewModel;

import com.app.designpattern.di.modules.ViewModelKey;
import com.app.designpattern.viewmodel.main.NotificationViewModel;
import com.app.designpattern.viewmodel.main.SettingViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class NotificationViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NotificationViewModel.class)
    public abstract ViewModel bindNotificationViewModel(NotificationViewModel loginViewModel);
}
