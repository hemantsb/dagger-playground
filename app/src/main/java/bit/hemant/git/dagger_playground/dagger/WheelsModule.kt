package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.car.Rims
import bit.hemant.git.dagger_playground.car.Tires
import bit.hemant.git.dagger_playground.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.infalted()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}
