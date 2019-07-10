package com.app.designpattern.di.modules;
import androidx.lifecycle.ViewModelProvider;
import com.app.designpattern.util.ViewModelFactory;
import dagger.Binds;
import dagger.Module;

@Module
public  abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

}
