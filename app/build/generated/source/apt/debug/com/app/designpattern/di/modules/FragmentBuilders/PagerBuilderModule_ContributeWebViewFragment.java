package com.app.designpattern.di.modules.FragmentBuilders;

import androidx.fragment.app.Fragment;
import com.app.designpattern.di.modules.viewmodules.mainviewmodules.WebViewModelModule;
import com.app.designpattern.view.main.setting.WebViewFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = PagerBuilderModule_ContributeWebViewFragment.WebViewFragmentSubcomponent.class
)
public abstract class PagerBuilderModule_ContributeWebViewFragment {
  private PagerBuilderModule_ContributeWebViewFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(WebViewFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      WebViewFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = WebViewModelModule.class)
  public interface WebViewFragmentSubcomponent extends AndroidInjector<WebViewFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<WebViewFragment> {}
  }
}
