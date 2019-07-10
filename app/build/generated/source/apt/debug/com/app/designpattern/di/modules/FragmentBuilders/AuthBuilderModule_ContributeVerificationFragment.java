package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.authviewmodules.VerificationViewModelModule;
import com.app.designpattern.view.auth.VerificationFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      AuthBuilderModule_ContributeVerificationFragment.VerificationFragmentSubcomponent.class
)
public abstract class AuthBuilderModule_ContributeVerificationFragment {
  private AuthBuilderModule_ContributeVerificationFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(VerificationFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      VerificationFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = VerificationViewModelModule.class)
  public interface VerificationFragmentSubcomponent extends AndroidInjector<VerificationFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<VerificationFragment> {}
  }
}
