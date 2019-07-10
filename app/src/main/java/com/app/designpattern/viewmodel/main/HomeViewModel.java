package com.app.designpattern.viewmodel.main;


import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.remote.DataSource;

import javax.inject.Inject;
import javax.inject.Named;

public class HomeViewModel extends ViewModel {

    private DataSource dataSource;
    @Inject
    public HomeViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }

}
