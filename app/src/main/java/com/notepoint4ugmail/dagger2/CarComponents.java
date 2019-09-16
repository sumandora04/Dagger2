package com.notepoint4ugmail.dagger2;

import dagger.Component;

@Component
public interface CarComponents {

    Car getCar();

    void instance(MainActivity mainActivity); //For field injection.
}
