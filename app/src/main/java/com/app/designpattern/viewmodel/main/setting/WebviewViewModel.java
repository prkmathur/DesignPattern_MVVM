package com.app.designpattern.viewmodel.main.setting;


import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.remote.DataSource;

import javax.inject.Inject;
import javax.inject.Named;

public class WebviewViewModel extends ViewModel {

    private DataSource dataSource;

    @Inject
    public WebviewViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }


}
