package com.example.daggerpractice.practice.modules;

import com.example.daggerpractice.practice.Engine;
import com.example.daggerpractice.practice.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    public abstract Engine bindEngine(PetrolEngine engine);
}
