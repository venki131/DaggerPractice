package com.example.daggerpractice.practice;

import com.example.daggerpractice.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("hp") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("cc") int engineCapacity);

        CarComponent build();
    }
}
