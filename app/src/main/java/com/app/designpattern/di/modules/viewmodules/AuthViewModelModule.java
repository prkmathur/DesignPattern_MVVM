package com.app.designpattern.di.modules.viewmodules;

import androidx.lifecycle.ViewModel;

import com.app.designpattern.di.modules.ViewModelKey;
import com.app.designpattern.viewmodel.AuthViewModel;
import com.app.designpattern.viewmodel.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel mainViewModel);
}
