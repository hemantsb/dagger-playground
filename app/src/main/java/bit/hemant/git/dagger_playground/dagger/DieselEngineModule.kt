package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.car.DieselEngine
import bit.hemant.git.dagger_playground.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun provideDieselEngine(dieselEngine: DieselEngine): Engine

}