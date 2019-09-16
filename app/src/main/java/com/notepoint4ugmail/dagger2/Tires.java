package com.notepoint4ugmail.dagger2;

import android.util.Log;

public class Tires {
    //Assume that, this class is a 3rd party API class and we dont own it. So we cant inject anything into it.

    public void inflate(){
        Log.d("Car","Tires inflated");
    }
}
