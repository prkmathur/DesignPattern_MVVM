package com.app.designpattern.view.main.setting;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.navigation.NavController;

import com.app.designpattern.R;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.main.setting.ProfileViewModel;


public class ProfileFragment extends BaseFragment{

    private NavController navController;

    public ProfileFragment() { }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Act: Profile","onCreate");
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_profile;
    }

    @Override
    public Class setViewModelClass() {
        return ProfileViewModel.class;
    }

    @Override
    public Class setParentViewModelClass() {
        return null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = getNavController();
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
