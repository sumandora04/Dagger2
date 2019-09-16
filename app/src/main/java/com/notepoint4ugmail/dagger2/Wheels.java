package com.notepoint4ugmail.dagger2;

import javax.inject.Inject;

public class Wheels {

    //Assume that, this class is a 3rd party API class and we dont own it. So we cant inject anything into it.
    private Rims rims;
    private Tires tires;
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
