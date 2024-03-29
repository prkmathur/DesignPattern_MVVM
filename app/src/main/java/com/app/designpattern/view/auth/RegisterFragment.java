package com.app.designpattern.view.auth;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;

import com.app.designpattern.R;
import com.app.designpattern.databinding.FragmentRegisterBinding;
import com.app.designpattern.model.vo.User;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.BaseResponse;
import com.app.designpattern.util.Event;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.AuthViewModel;
import com.app.designpattern.viewmodel.auth.RegisterViewModel;

public class RegisterFragment extends BaseFragment{

    private RegisterViewModel registerViewModel;
    private AuthViewModel authViewModel;
    private NavController navController;
    private FragmentRegisterBinding fragmentRegisterBinding;

    public  RegisterFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerViewModel = (RegisterViewModel) getViewModel();
        authViewModel = (AuthViewModel) getParentViewModel();
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_register;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = getNavController();
        fragmentRegisterBinding = (FragmentRegisterBinding) getBinding();
        fragmentRegisterBinding.setData(registerViewModel);

    }

    @Override
    public Class setViewModelClass() {
        return RegisterViewModel.class;
    }

    @Override
    public Class setParentViewModelClass() {
        return AuthViewModel.class;
    }

    @Override
    public void setObservers() { registerViewModel.getRegisterStatus.observe(getViewLifecycleOwner(),observer); }

    @Override
    public void removeObservers() {
        registerViewModel.getRegisterStatus.removeObserver(observer);
    }

    @Override
    public Toolbar getToolbar() {
        return null;
    }

    @Override
    public void onPause() {
        super.onPause();
        removeObservers();
    }

    @Override
    public void onResume() {
        super.onResume();
        setObservers();
    }

    private Observer<Event<BaseResponse<User.CurrentUser>>> observer = currentUserBaseResponse -> {

        if(currentUserBaseResponse.getContentIfNotHandled() != null) {
            if (currentUserBaseResponse.peekContent().isStatus()) {
                authViewModel.setActivityChange();
            } else {
                Toast.makeText(getContext(), currentUserBaseResponse.peekContent().getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    };

}
