package com.app.designpattern.view.auth;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.Observer;
import androidx.navigation.NavController;
import com.app.designpattern.R;
import com.app.designpattern.databinding.FragmentLoginBinding;
import com.app.designpattern.model.vo.User;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.BaseResponse;
import com.app.designpattern.util.Event;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.AuthViewModel;
import com.app.designpattern.viewmodel.auth.LoginViewModel;

public class LoginFragment extends BaseFragment implements View.OnClickListener {

    private LoginViewModel loginViewModel;
    private AuthViewModel authViewModel;
    private NavController navController;
    private FragmentLoginBinding fragmentLoginBinding;

    public LoginFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginViewModel = (LoginViewModel) getViewModel();
        authViewModel = (AuthViewModel) getParentViewModel();
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_login;
    }

    @Override
    public Class setViewModelClass() { return LoginViewModel.class; }

    @Override
    public Class setParentViewModelClass() {
        return AuthViewModel.class;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= getNavController();
        fragmentLoginBinding = (FragmentLoginBinding) getBinding();
        fragmentLoginBinding.setData(loginViewModel);
        fragmentLoginBinding.btnRegister.setOnClickListener(this);
        fragmentLoginBinding.btnLogin.setOnClickListener(this);
    }

    @Override
    public void setObservers() {
        loginViewModel.loginResponse.observe(getViewLifecycleOwner(),observer);
    }

    @Override
    public void removeObservers() {
        loginViewModel.loginResponse.removeObserver(observer);
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

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_register){
            navController.navigate(R.id.action_loginFragment_to_registerFragment);
        }else if (v.getId() == R.id.btn_login){

            if(fragmentLoginBinding.edtEmail.getText() == null || fragmentLoginBinding.edtEmail.getText().toString().trim().length() == 0){
                fragmentLoginBinding.edtEmail.setError(getActivity().getString(R.string.error_email));
            }else if(fragmentLoginBinding.edtPassword.getText() == null || fragmentLoginBinding.edtPassword.getText().toString().trim().length() == 0){
                fragmentLoginBinding.edtPassword.setError(getActivity().getString(R.string.error_password));
            }else{
                loginViewModel.requestLogin();
            }
        }
    }

    private Observer<Event<BaseResponse<User.CurrentUser>>> observer = loginResponseBaseResponse -> {

        if(loginResponseBaseResponse.getContentIfNotHandled() != null) {

            if (loginResponseBaseResponse.peekContent().isStatus()) {
                authViewModel.setActivityChange();
            } else {
                Toast.makeText(getContext(), loginResponseBaseResponse.peekContent().getMessage(), Toast.LENGTH_LONG).show();
            }
        }

    };

}
