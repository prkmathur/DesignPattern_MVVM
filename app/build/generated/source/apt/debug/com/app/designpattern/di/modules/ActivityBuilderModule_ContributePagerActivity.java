package com.app.designpattern.di.modules;

import android.app.Activity;
import com.app.designpattern.di.modules.FragmentBuilders.PagerBuilderModule;
import com.app.designpattern.di.modules.viewmodules.PagerViewModelModule;
import com.app.designpattern.view.PagerActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilderModule_ContributePagerActivity.PagerActivitySubcomponent.class
)
public abstract class ActivityBuilderModule_ContributePagerActivity {
  private ActivityBuilderModule_ContributePagerActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(PagerActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      PagerActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {PagerBuilderModule.class, PagerViewModelModule.class})
  public interface PagerActivitySubcomponent extends AndroidInjector<PagerActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PagerActivity> {}
  }
}
