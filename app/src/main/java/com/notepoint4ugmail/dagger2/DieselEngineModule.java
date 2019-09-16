package com.notepoint4ugmail.dagger2;

import dagger.Binds;
import dagger.Module;

// This class uses the Bind abstract method to return the engine instance.
// All the implementations of the abstract class and methods will be done by the Dagger.
// It is more optimised then the provides function (both static and non-static)
@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindsEngine(DieselEngine engine);
}
