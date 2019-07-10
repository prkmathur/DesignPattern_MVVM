package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.ChangePasswordViewModelModule;
import com.app.designpattern.view.main.setting.ChangePasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainBuilderModule_ContributeChangePasswordFragment.ChangePasswordFragmentSubcomponent.class
)
public abstract class MainBuilderModule_ContributeChangePasswordFragment {
  private MainBuilderModule_ContributeChangePasswordFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ChangePasswordFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ChangePasswordFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ChangePasswordViewModelModule.class)
  public interface ChangePasswordFragmentSubcomponent
      extends AndroidInjector<ChangePasswordFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChangePasswordFragment> {}
  }
}
