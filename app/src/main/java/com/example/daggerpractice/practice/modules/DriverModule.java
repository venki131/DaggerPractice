package com.example.daggerpractice.practice.modules;

import com.example.daggerpractice.practice.model.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    public static Driver provideDriver() {
        return new Driver();
    }
}
