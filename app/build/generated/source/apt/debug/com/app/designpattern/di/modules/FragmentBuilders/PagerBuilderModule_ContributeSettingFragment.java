package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.SettingViewModelModule;
import com.app.designpattern.view.main.SettingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = PagerBuilderModule_ContributeSettingFragment.SettingFragmentSubcomponent.class
)
public abstract class PagerBuilderModule_ContributeSettingFragment {
  private PagerBuilderModule_ContributeSettingFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SettingFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SettingFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = SettingViewModelModule.class)
  public interface SettingFragmentSubcomponent extends AndroidInjector<SettingFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SettingFragment> {}
  }
}
