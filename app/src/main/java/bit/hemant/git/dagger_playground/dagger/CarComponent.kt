package bit.hemant.git.dagger_playground.dagger

import bit.hemant.git.dagger_playground.MainActivity
import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar(): Car

    //for field injection
    fun injectMain(mainActivity: MainActivity)
}