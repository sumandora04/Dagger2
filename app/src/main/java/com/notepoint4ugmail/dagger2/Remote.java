package com.notepoint4ugmail.dagger2;

import android.util.Log;

import com.notepoint4ugmail.dagger2.Car;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d("Remote: ","Connected...");
    }
}
