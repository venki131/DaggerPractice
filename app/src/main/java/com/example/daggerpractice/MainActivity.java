package com.example.daggerpractice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerpractice.practice.Car;
import com.example.daggerpractice.practice.CarComponent;
import com.example.daggerpractice.practice.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(180)
                .engineCapacity(1400)
                .build();
        carComponent.inject(this);
        //car = carComponent.getCar();

        car.drive();
    }
}
