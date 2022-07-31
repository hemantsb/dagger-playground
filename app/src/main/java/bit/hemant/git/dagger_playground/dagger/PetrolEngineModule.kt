package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.car.Engine
import bit.hemant.git.dagger_playground.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine): Engine

}