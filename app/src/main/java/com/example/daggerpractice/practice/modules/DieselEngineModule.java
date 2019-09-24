package com.example.daggerpractice.practice.modules;

import com.example.daggerpractice.practice.model.DieselEngine;
import com.example.daggerpractice.practice.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
