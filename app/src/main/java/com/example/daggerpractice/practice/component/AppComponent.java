package com.example.daggerpractice.practice.component;

import com.example.daggerpractice.practice.model.Driver;
import com.example.daggerpractice.practice.modules.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
