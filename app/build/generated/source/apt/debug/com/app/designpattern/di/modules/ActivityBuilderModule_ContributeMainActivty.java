package com.app.designpattern.di.modules;

import android.app.Activity;
import com.app.designpattern.di.modules.FragmentBuilders.MainBuilderModule;
import com.app.designpattern.di.modules.viewmodules.MainViewModelModule;
import com.app.designpattern.view.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_ContributeMainActivty.MainActivitySubcomponent.class)
public abstract class ActivityBuilderModule_ContributeMainActivty {
  private ActivityBuilderModule_ContributeMainActivty() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {MainBuilderModule.class, MainViewModelModule.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
