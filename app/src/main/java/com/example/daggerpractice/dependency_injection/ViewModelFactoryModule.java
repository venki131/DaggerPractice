package com.example.daggerpractice.dependency_injection;

import androidx.lifecycle.ViewModelProvider;

import com.example.daggerpractice.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindsFactory(ViewModelProviderFactory modelProviderFactory);
}
