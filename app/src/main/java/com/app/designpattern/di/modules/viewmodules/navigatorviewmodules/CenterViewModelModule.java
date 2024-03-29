package com.app.designpattern.di.modules.viewmodules.navigatorviewmodules;

import androidx.lifecycle.ViewModel;

import com.app.designpattern.di.modules.ViewModelKey;
import com.app.designpattern.viewmodel.main.setting.ProfileViewModel;
import com.app.designpattern.viewmodel.navigator.CenterViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class CenterViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CenterViewModel.class)
    public abstract ViewModel bindCenterViewModel(CenterViewModel centerViewModel);
}
