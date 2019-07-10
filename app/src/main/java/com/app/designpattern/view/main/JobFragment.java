package com.app.designpattern.view.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.util.Log;
import android.view.View;
import com.app.designpattern.R;
import com.app.designpattern.databinding.FragmentJobsBinding;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.MainViewModel;
import com.app.designpattern.viewmodel.main.HomeViewModel;
import com.app.designpattern.viewmodel.main.JobViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class JobFragment extends BaseFragment {

    private JobViewModel jobViewModel;
    private MainViewModel mainViewModel;
    private NavController navController;
    private FragmentJobsBinding fragmentJobsBinding;

    public JobFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Act: JobFragment","onCreate");
        jobViewModel = (JobViewModel) getViewModel();
        mainViewModel = (MainViewModel) getParentViewModel();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = getNavController();
        fragmentJobsBinding = (FragmentJobsBinding) getBinding();
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_jobs;
    }

    @Override
    public Class setViewModelClass() {
        return JobViewModel.class;
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
