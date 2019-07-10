package com.app.designpattern.view.main.setting;


import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;
import com.app.designpattern.R;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.MainViewModel;
import com.app.designpattern.viewmodel.main.setting.ChangePasswordViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChangePasswordFragment extends BaseFragment {


    public ChangePasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Act: ChangePassword","onCreate");
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_change_password;
    }

    @Override
    public Class setViewModelClass() {
        return ChangePasswordViewModel.class;
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
