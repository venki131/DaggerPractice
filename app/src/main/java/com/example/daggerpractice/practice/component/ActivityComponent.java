package com.example.daggerpractice.practice.component;

import com.example.daggerpractice.practice.activity.MainActivity;
import com.example.daggerpractice.practice.model.Car;
import com.example.daggerpractice.practice.scope.PerActivity;
import com.example.daggerpractice.practice.modules.PetrolEngineModule;
import com.example.daggerpractice.practice.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component (dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("hp") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("cc") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }
}
