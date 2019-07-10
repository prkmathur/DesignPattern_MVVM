package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.RegisterViewModelModule;
import com.app.designpattern.view.auth.RegisterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = AuthBuilderModule_ContributeRegisterFragment.RegisterFragmentSubcomponent.class
)
public abstract class AuthBuilderModule_ContributeRegisterFragment {
  private AuthBuilderModule_ContributeRegisterFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RegisterFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RegisterFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = RegisterViewModelModule.class)
  public interface RegisterFragmentSubcomponent extends AndroidInjector<RegisterFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RegisterFragment> {}
  }
}
