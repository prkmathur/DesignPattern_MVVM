package com.app.designpattern.di.modules.FragmentBuilders;

import com.app.designpattern.di.modules.viewmodules.authviewmodules.LoginViewModelModule;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.RegisterViewModelModule;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.SplashViewModelModule;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.VerificationViewModelModule;
import com.app.designpattern.view.auth.LoginFragment;
import com.app.designpattern.view.auth.RegisterFragment;
import com.app.designpattern.view.auth.SplashFragment;
import com.app.designpattern.view.auth.VerificationFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AuthBuilderModule {

    @ContributesAndroidInjector(modules = LoginViewModelModule.class)
    abstract LoginFragment contributeLoginFragment();

    @ContributesAndroidInjector(modules = RegisterViewModelModule.class)
    abstract RegisterFragment contributeRegisterFragment();

    @ContributesAndroidInjector(modules = SplashViewModelModule.class)
    abstract SplashFragment contributeSplashFragment();

    @ContributesAndroidInjector(modules = VerificationViewModelModule.class)
    abstract VerificationFragment contributeVerificationFragment();

}
