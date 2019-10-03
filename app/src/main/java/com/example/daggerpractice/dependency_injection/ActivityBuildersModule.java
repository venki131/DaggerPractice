package com.example.daggerpractice.dependency_injection;

import com.example.daggerpractice.dependency_injection.auth.AuthModule;
import com.example.daggerpractice.dependency_injection.auth.AuthScope;
import com.example.daggerpractice.dependency_injection.auth.AuthViewModelsModule;
import com.example.daggerpractice.dependency_injection.main.MainFragmentBuildersModule;
import com.example.daggerpractice.dependency_injection.main.MainModule;
import com.example.daggerpractice.dependency_injection.main.MainScope;
import com.example.daggerpractice.dependency_injection.main.MainViewModelsModule;
import com.example.daggerpractice.ui.auth.AuthActivity;
import com.example.daggerpractice.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainViewModelsModule.class, MainFragmentBuildersModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();
}
