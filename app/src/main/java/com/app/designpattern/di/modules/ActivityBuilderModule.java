package com.app.designpattern.di.modules;

import com.app.designpattern.di.modules.FragmentBuilders.AuthBuilderModule;
import com.app.designpattern.di.modules.FragmentBuilders.MainBuilderModule;
import com.app.designpattern.di.modules.FragmentBuilders.PagerBuilderModule;
import com.app.designpattern.di.modules.viewmodules.AuthViewModelModule;
import com.app.designpattern.di.modules.viewmodules.MainViewModelModule;
import com.app.designpattern.di.modules.viewmodules.PagerViewModelModule;
import com.app.designpattern.view.AuthActivity;
import com.app.designpattern.view.MainActivity;
import com.app.designpattern.view.PagerActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    // Modules Declared in the ContributesAndroidInjector
    // will be scoped for that particular Activity only

    @ContributesAndroidInjector(modules = {MainBuilderModule.class,MainViewModelModule.class})
    abstract MainActivity contributeMainActivty();

    @ContributesAndroidInjector(modules = {AuthBuilderModule.class,AuthViewModelModule.class})
    abstract AuthActivity contributeAuthActivty();

    @ContributesAndroidInjector(modules = {PagerBuilderModule.class, PagerViewModelModule.class})
    abstract PagerActivity contributePagerActivity();

}
