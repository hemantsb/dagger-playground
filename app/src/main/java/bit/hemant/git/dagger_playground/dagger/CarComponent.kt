package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.MainActivity
import bit.hemant.git.dagger_playground.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

//Petrol Engine Module can also be used, but only 1 module should be used cz both provides Engine
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    //for field injection
    fun injectMain(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse_power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine_capacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}