package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.navigatorviewmodules.CenterViewModelModule;
import com.app.designpattern.view.navigator.CenterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = PagerBuilderModule_ContributeCenterFragment.CenterFragmentSubcomponent.class
)
public abstract class PagerBuilderModule_ContributeCenterFragment {
  private PagerBuilderModule_ContributeCenterFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(CenterFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      CenterFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = CenterViewModelModule.class)
  public interface CenterFragmentSubcomponent extends AndroidInjector<CenterFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CenterFragment> {}
  }
}
