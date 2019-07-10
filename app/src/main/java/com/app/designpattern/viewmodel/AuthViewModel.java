package com.app.designpattern.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.remote.DataSource;
import com.app.designpattern.model.remote.TaskRepository;

import javax.inject.Inject;
import javax.inject.Named;

public class AuthViewModel extends ViewModel {

    private DataSource dataSource;

    MutableLiveData<Boolean> switchToMain = new MutableLiveData<>();

    @Inject
    public AuthViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }

    public void setActivityChange(){
        switchToMain.setValue(true);
    }

    public LiveData<Boolean> activityStatus(){
        return switchToMain;
    }

}
