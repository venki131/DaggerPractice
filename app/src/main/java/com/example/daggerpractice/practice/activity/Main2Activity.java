package com.example.daggerpractice.practice.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerpractice.R;
import com.example.daggerpractice.practice.application.BaseApp;
import com.example.daggerpractice.practice.component.ActivityComponent;
import com.example.daggerpractice.practice.component.DaggerActivityComponent;
import com.example.daggerpractice.practice.model.Car;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //commented as we're creating application wide singleton using BaseApp
        /*ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(180)
                .engineCapacity(1400)
                .build();*/
        //ActivityComponent activityComponent = ((BaseApp)getApplication()).getActivityComponent();
        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((BaseApp) getApplication()).getAppComponent())
                .build();
        activityComponent.inject(this);
        //car = activityComponent.getCar();

        car.drive();
    }
}
