package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.LoginViewModelModule;
import com.app.designpattern.view.auth.LoginFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AuthBuilderModule_ContributeLoginFragment.LoginFragmentSubcomponent.class)
public abstract class AuthBuilderModule_ContributeLoginFragment {
  private AuthBuilderModule_ContributeLoginFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(LoginFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      LoginFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = LoginViewModelModule.class)
  public interface LoginFragmentSubcomponent extends AndroidInjector<LoginFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginFragment> {}
  }
}
