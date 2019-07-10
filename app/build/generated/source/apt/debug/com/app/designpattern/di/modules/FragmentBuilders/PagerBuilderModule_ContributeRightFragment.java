package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.navigatorviewmodules.RightViewModelModule;
import com.app.designpattern.view.navigator.RightFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PagerBuilderModule_ContributeRightFragment.RightFragmentSubcomponent.class)
public abstract class PagerBuilderModule_ContributeRightFragment {
  private PagerBuilderModule_ContributeRightFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RightFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RightFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = RightViewModelModule.class)
  public interface RightFragmentSubcomponent extends AndroidInjector<RightFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RightFragment> {}
  }
}
