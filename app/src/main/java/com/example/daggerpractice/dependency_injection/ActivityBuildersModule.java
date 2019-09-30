package com.example.daggerpractice.dependency_injection;

import com.example.daggerpractice.dependency_injection.auth.AuthModule;
import com.example.daggerpractice.dependency_injection.auth.AuthViewModelsModule;
import com.example.daggerpractice.dependency_injection.main.MainFragmentBuildersModule;
import com.example.daggerpractice.dependency_injection.main.MainViewModelsModule;
import com.example.daggerpractice.ui.auth.AuthActivity;
import com.example.daggerpractice.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(
            modules = {MainViewModelsModule.class, MainFragmentBuildersModule.class}
    )
    abstract MainActivity contributeMainActivity();
}
