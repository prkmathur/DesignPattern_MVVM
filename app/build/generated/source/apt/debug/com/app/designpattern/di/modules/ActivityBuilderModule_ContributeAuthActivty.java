package com.app.designpattern.di.modules;

import android.app.Activity;
import com.app.designpattern.di.modules.FragmentBuilders.AuthBuilderModule;
import com.app.designpattern.di.modules.viewmodules.AuthViewModelModule;
import com.app.designpattern.view.AuthActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_ContributeAuthActivty.AuthActivitySubcomponent.class)
public abstract class ActivityBuilderModule_ContributeAuthActivty {
  private ActivityBuilderModule_ContributeAuthActivty() {}

  @Binds
  @IntoMap
  @ActivityKey(AuthActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AuthActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {AuthBuilderModule.class, AuthViewModelModule.class})
  public interface AuthActivitySubcomponent extends AndroidInjector<AuthActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AuthActivity> {}
  }
}
