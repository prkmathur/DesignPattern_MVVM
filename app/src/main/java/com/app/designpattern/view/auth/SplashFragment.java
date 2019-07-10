package com.app.designpattern.view.auth;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import com.app.designpattern.R;
import com.app.designpattern.databinding.FragmentSplashBinding;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.Event;
import com.app.designpattern.util.SessionManager;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.AuthViewModel;
import com.app.designpattern.viewmodel.auth.SplashViewModel;

import javax.inject.Inject;


public class SplashFragment extends BaseFragment{

    private SplashViewModel splashViewModel;
    private AuthViewModel authViewModel;
    private NavController navController;
    private FragmentSplashBinding fragmentSplashBinding;

    @Inject
    SessionManager sessionManager;

    public SplashFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashViewModel = (SplashViewModel) getViewModel();
        authViewModel = (AuthViewModel) getParentViewModel();

    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_splash;
    }

    @Override
    public Class setViewModelClass() {
        return SplashViewModel.class;
    }

    @Override
    public Class setParentViewModelClass() {
        return AuthViewModel.class;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = getNavController();
        fragmentSplashBinding = (FragmentSplashBinding) getBinding();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState == null){
            callVersionCheckAPI();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        setObservers();
    }

    @Override
    public void onPause() {
        super.onPause();
        removeObservers();
    }

    @Override
    public void setObservers(){
        splashViewModel.getIsVersionUpToDate.observe(getViewLifecycleOwner(),checkVersionObserver());
    }

    @Override
    public void removeObservers(){
        splashViewModel.getIsVersionUpToDate.removeObserver(checkVersionObserver());
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    private void callVersionCheckAPI(){
        splashViewModel.getVersion(true);
    }

    public Observer<Event<Boolean>> checkVersionObserver(){
        return aBoolean -> {
            if(aBoolean.getContentIfNotHandled() != null){
                if(sessionManager.isUserLoggedIn()){
                    authViewModel.setActivityChange();
                }else{
                    navController.navigate(R.id.action_splashFragment_to_loginFragment, null,
                            new NavOptions.Builder()
                                    .setPopUpTo(R.id.splashFragment,
                                            true).build());
                }
            }
        };
    }

}
