package com.notepoint4ugmail.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    //If the provide methods does not depends on any instance of Module class then they can be made static for performance optimisation.
    // As the dagger will not create the instance of module class anymore.

    @Provides
    static Rims provideRims() {
        return new Rims(); // Return the instance only
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires(); // Instantiation
        tires.inflate(); //Extra configuration.
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
