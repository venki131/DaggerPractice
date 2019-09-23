package com.example.daggerpractice.practice;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started. horsePower :"+ horsePower);
    }
}
