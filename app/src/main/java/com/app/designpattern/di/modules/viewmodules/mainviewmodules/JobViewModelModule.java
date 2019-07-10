package com.app.designpattern.di.modules.viewmodules.mainviewmodules;

import androidx.lifecycle.ViewModel;

import com.app.designpattern.di.modules.ViewModelKey;
import com.app.designpattern.viewmodel.auth.LoginViewModel;
import com.app.designpattern.viewmodel.main.JobViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class JobViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(JobViewModel.class)
    public abstract ViewModel bindJobViewModel(JobViewModel loginViewModel);
}
