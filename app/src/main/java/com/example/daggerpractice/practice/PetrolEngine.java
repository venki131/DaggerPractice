package com.example.daggerpractice.practice;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    int horsePower;
    int engineCapacity;

    @Inject
    public PetrolEngine(@Named("hp") int horsePower,
                        @Named("cc") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started. " +
                "\nhorsePower :"+horsePower +
                "\nEngine capacity :"+engineCapacity);
    }
}
