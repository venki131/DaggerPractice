package com.example.daggerpractice.practice.application;

import android.app.Application;

import com.example.daggerpractice.practice.component.AppComponent;
import com.example.daggerpractice.practice.component.DaggerAppComponent;

public class BaseApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
