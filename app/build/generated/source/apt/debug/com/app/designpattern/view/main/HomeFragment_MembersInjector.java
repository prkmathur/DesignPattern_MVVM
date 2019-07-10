// Generated by Dagger (https://google.github.io/dagger).
package com.app.designpattern.view.main;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.app.designpattern.util.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public HomeFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.childFragmentInjectorProvider = childFragmentInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<DispatchingAndroidInjector<Fragment>> childFragmentInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new HomeFragment_MembersInjector(
        childFragmentInjectorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    DaggerFragment_MembersInjector.injectChildFragmentInjector(
        instance, childFragmentInjectorProvider.get());
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
