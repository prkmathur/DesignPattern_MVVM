package com.app.designpattern.viewmodel.navigator;


import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.remote.DataSource;

import javax.inject.Inject;
import javax.inject.Named;

public class LeftViewModel extends ViewModel {

    private DataSource dataSource;

    @Inject
    public LeftViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }


}
