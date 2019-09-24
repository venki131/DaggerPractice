package com.example.daggerpractice.practice.modules;

import com.example.daggerpractice.practice.model.Rims;
import com.example.daggerpractice.practice.model.Tires;
import com.example.daggerpractice.practice.model.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    public static Rims provideRims() {
        return new Rims();
    }

    @Provides
    public static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    public static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
