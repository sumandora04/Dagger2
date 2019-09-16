package com.notepoint4ugmail.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

   // private Car car;
    @Inject protected Car car; // Field injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponents components = DaggerCarComponents.create();
   //     car = components.getCar();
        components.instance(this);

        car.drive();
    }
}
