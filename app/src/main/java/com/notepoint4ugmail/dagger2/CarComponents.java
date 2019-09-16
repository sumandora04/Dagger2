package com.notepoint4ugmail.dagger2;

import dagger.Component;

@Component(modules = {WheelModule.class, DieselEngineModule.class}) // Whenever a wheel is required, dagger will create one from the WheelModule class.
public interface CarComponents {

    Car getCar();

    void instance(MainActivity mainActivity); //For field injection.
}
