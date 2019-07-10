package com.app.designpattern.view.auth;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.navigation.NavController;
import android.view.View;
import com.app.designpattern.R;
import com.app.designpattern.databinding.FragmentVerificationBinding;
import com.app.designpattern.model.vo.UserVerification;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.BaseResponse;
import com.app.designpattern.util.Event;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.AuthViewModel;
import com.app.designpattern.viewmodel.auth.VerificationViewModel;



public class VerificationFragment extends BaseFragment {

    private VerificationViewModel verificationViewModel;
    private AuthViewModel authViewModel;
    private NavController navController;
    private FragmentVerificationBinding fragmentVerificationBinding;

    public VerificationFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        verificationViewModel = (VerificationViewModel) getViewModel();
        authViewModel = (AuthViewModel) getParentViewModel();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = getNavController();
        fragmentVerificationBinding = (FragmentVerificationBinding) getBinding();
        fragmentVerificationBinding.setData(verificationViewModel);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        setObservers();
    }

    @Override
    public void onPause() {
        super.onPause();
        removeObservers();
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_verification;
    }

    @Override
    public Class setViewModelClass() {
        return VerificationViewModel.class;
    }

    @Override
    public Class setParentViewModelClass() {
        return AuthViewModel.class;
    }

    @Override
    public void setObservers() {
        verificationViewModel.getVerifiedUser.observe(getViewLifecycleOwner(),observer);
    }

    @Override
    public void removeObservers() {
        verificationViewModel.getVerifiedUser.removeObserver(observer);
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    private Observer<Event<BaseResponse<UserVerification.Response>>> observer = responseBaseResponse -> {

    };
}
