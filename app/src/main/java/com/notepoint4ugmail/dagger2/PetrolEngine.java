package com.notepoint4ugmail.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d("Car:", "Petrol Engine started");
    }
}
