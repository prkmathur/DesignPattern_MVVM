package com.app.designpattern.di.modules.viewmodules.mainviewmodules;

import androidx.lifecycle.ViewModel;

import com.app.designpattern.di.modules.ViewModelKey;
import com.app.designpattern.viewmodel.main.setting.ProfileViewModel;
import com.app.designpattern.viewmodel.main.setting.WebviewViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class WebViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(WebviewViewModel.class)
    public abstract ViewModel bindWebviewViewModel(WebviewViewModel webviewViewModel);
}
