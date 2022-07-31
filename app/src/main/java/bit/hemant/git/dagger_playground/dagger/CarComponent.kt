package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.MainActivity
import bit.hemant.git.dagger_playground.car.Car
import dagger.Component

//Petrol Engine Module can also be used, but only 1 module should be used cz both provides Engine
@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    //for field injection
    fun injectMain(mainActivity: MainActivity)
}