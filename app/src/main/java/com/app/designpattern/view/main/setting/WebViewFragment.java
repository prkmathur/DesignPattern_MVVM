package com.app.designpattern.view.main.setting;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.navigation.NavController;
import com.app.designpattern.R;
import com.app.designpattern.util.BaseFragment;
import com.app.designpattern.util.Toolbar;
import com.app.designpattern.viewmodel.MainViewModel;
import com.app.designpattern.viewmodel.main.setting.WebviewViewModel;


public class WebViewFragment extends BaseFragment {

    private NavController navController;

    public WebViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Act: WebViewFragment","onCreate");
    }

    @Override
    public int setContentLayout() {
        return R.layout.fragment_web_view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = getNavController();

    }

    @Override
    public Class setViewModelClass() {
        return WebviewViewModel.class;
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
