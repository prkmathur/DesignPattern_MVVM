package com.app.designpattern.viewmodel.auth;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.vo.User;
import com.app.designpattern.model.remote.DataSource;
import com.app.designpattern.util.AbsentLiveData;
import com.app.designpattern.util.BaseResponse;
import com.app.designpattern.util.Event;
import com.app.designpattern.util.SessionManager;

import javax.inject.Inject;
import javax.inject.Named;

public class RegisterViewModel extends ViewModel {

    private DataSource dataSource;
    public  User.RegisterRequest user = new User.RegisterRequest();
    private MutableLiveData<Boolean> registerRequest = new MutableLiveData<>();

    SessionManager sessionManager;

    @Inject
    public RegisterViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource,SessionManager sessionManager) {
        super();
        this.dataSource = dataSource;
        this.sessionManager = sessionManager;
    }

    public final LiveData<Event<BaseResponse<User.CurrentUser>>> getRegisterStatus = Transformations.switchMap(registerRequest, new Function<Boolean, LiveData<Event<BaseResponse<User.CurrentUser>>>>() {
        @Override
        public LiveData<Event<BaseResponse<User.CurrentUser>>> apply(Boolean status) {

            if(status == null || !status) {
                return AbsentLiveData.create();
            }else{
                return dataSource.getRegisterUser(user);
            }

        }
    });

    public void registerUser() {
        if (user != null) {
            registerRequest.setValue(true);
        }
    }

}
