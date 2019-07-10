package com.app.designpattern.viewmodel.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.remote.DataSource;
import com.app.designpattern.util.AbsentLiveData;
import com.app.designpattern.util.Event;

import javax.inject.Inject;
import javax.inject.Named;

public class SplashViewModel extends ViewModel {

    private DataSource dataSource;
    private MutableLiveData<Boolean> isVersionUpToDate = new MutableLiveData<>();

    @Inject
    public SplashViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }

    public void getVersion(Boolean statusRequest){
        isVersionUpToDate.setValue(statusRequest);
    }

    public final LiveData<Event<Boolean>> getIsVersionUpToDate = Transformations.switchMap(isVersionUpToDate, (status) -> {
        if(status == null || !status) {
            return AbsentLiveData.create();
        }else{
            return dataSource.getIsVersionUpToDate();
        }
    });

}
