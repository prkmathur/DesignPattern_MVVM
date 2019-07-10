package com.app.designpattern.model.remote;

import androidx.lifecycle.LiveData;

import com.app.designpattern.model.vo.User;
import com.app.designpattern.model.vo.UserVerification;
import com.app.designpattern.util.BaseResponse;
import com.app.designpattern.util.Event;

public interface DataSource {

    LiveData<Event<Boolean>> getIsVersionUpToDate();

    LiveData<Event<BaseResponse<User.CurrentUser>>> getRegisterUser(User.RegisterRequest request);

    LiveData<Event<BaseResponse<User.CurrentUser>>> getLoginUser(User.LoginRequest request);

    LiveData<Event<BaseResponse<UserVerification.Response>>> getVerifiedUser(UserVerification.Request request);

    LiveData<Event<BaseResponse>> getLogoutUser();

}
