package com.app.designpattern.view.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.designpattern.R;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.MainViewModel;
import com.app.designpattern.viewmodel.main.NotificationViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends BaseFragment {


    public NotificationsFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Act: NotificationsFrag","onCreate");
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_notifications;
    }

    @Override
    public Class setViewModelClass() {
        return NotificationViewModel.class;
    }

    @Override
    public Class setParentViewModelClass() {
        return null;
    }

    @Override
    public void setObservers() {

    }

    @Override
    public void removeObservers() {

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

}
