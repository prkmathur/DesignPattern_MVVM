package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.NotificationViewModelModule;
import com.app.designpattern.view.main.NotificationsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainBuilderModule_ContributeNotificationsFragment.NotificationsFragmentSubcomponent.class
)
public abstract class MainBuilderModule_ContributeNotificationsFragment {
  private MainBuilderModule_ContributeNotificationsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(NotificationsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NotificationsFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = NotificationViewModelModule.class)
  public interface NotificationsFragmentSubcomponent
      extends AndroidInjector<NotificationsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NotificationsFragment> {}
  }
}
