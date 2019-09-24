package com.example.daggerpractice.practice.model;

import android.util.Log;

import com.example.daggerpractice.practice.Engine;
import com.example.daggerpractice.practice.scope.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    @Inject
    Car (Engine engine, Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving..");
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}
