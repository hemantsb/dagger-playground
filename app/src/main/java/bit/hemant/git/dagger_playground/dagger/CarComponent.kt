package bit.hemant.git.dagger_playground.dagger

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}