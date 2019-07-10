package com.app.designpattern.di.modules.viewmodules;

import androidx.lifecycle.ViewModel;

import com.app.designpattern.di.modules.ViewModelKey;
import com.app.designpattern.viewmodel.AuthViewModel;
import com.app.designpattern.viewmodel.PagerViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class PagerViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PagerViewModel.class)
    public abstract ViewModel bindPagerViewModel(PagerViewModel pagerViewModel);
}
