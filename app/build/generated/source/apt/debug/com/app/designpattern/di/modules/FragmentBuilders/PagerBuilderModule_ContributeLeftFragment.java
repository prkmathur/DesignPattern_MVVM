package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.navigatorviewmodules.LeftViewModelModule;
import com.app.designpattern.view.navigator.LeftFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PagerBuilderModule_ContributeLeftFragment.LeftFragmentSubcomponent.class)
public abstract class PagerBuilderModule_ContributeLeftFragment {
  private PagerBuilderModule_ContributeLeftFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(LeftFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      LeftFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = LeftViewModelModule.class)
  public interface LeftFragmentSubcomponent extends AndroidInjector<LeftFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LeftFragment> {}
  }
}
