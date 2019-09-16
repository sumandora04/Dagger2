package com.notepoint4ugmail.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine engine; // Field injection
//    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(/*Engine engine,*/Wheels wheels) { //Constructor injection
//        this.engine = engine;
        this.wheels = wheels;
    }

    //Method injection
    @Inject
    public void enableRemote(Remote remote){ // this method can not be private; because the Dagger cannot access it. // Automatically injected.
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "driving");
    }
}
