package com.notepoint4ugmail.dagger2;

import dagger.Module;
import dagger.Provides;


//This class uses the Provides method to return the engine instance.
@Module
public class PetrolEngineModule {
    @Provides
    Engine providesEngine(PetrolEngine engine){
        return engine;
    }
}
