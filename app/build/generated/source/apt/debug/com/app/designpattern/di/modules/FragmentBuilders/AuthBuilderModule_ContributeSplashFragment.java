package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.SplashViewModelModule;
import com.app.designpattern.view.auth.SplashFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AuthBuilderModule_ContributeSplashFragment.SplashFragmentSubcomponent.class)
public abstract class AuthBuilderModule_ContributeSplashFragment {
  private AuthBuilderModule_ContributeSplashFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SplashFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SplashFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = SplashViewModelModule.class)
  public interface SplashFragmentSubcomponent extends AndroidInjector<SplashFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashFragment> {}
  }
}
