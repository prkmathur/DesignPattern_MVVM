package com.app.designpattern.viewmodel.main;


import androidx.lifecycle.ViewModel;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.remote.DataSource;


import javax.inject.Inject;
import javax.inject.Named;

public class JobViewModel extends ViewModel {

    private DataSource dataSource;

    @Inject
    public JobViewModel(@Named(MyApplication.SERVICE_MODE) DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }


}
