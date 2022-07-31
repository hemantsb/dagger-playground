package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.car.DieselEngine
import bit.hemant.git.dagger_playground.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    var horsePower: Int = 0


    constructor(horsePower: Int){
        this.horsePower=horsePower
    }

    @Provides
    fun provideDieselEngine(): Engine{
        val dieselEngine = DieselEngine(horsePower)
        return dieselEngine
    }

}