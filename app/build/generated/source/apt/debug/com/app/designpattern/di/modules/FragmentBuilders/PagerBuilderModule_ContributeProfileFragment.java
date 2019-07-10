package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.ProfileViewModelModule;
import com.app.designpattern.view.main.setting.ProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = PagerBuilderModule_ContributeProfileFragment.ProfileFragmentSubcomponent.class
)
public abstract class PagerBuilderModule_ContributeProfileFragment {
  private PagerBuilderModule_ContributeProfileFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ProfileViewModelModule.class)
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFragment> {}
  }
}
