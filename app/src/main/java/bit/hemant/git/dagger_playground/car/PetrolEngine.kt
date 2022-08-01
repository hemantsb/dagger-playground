package bit.hemant.git.dagger_playground.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {
    private val TAG = "Car"
    private var horsePower: Int = 0
    private var engineCapacity: Int = 0

    @Inject
    constructor(
        @Named("horse_power") horsePower: Int,
        @Named("engine_capacity") engineCapacity: Int
    ) {
        this.horsePower = horsePower
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        Log.d(TAG, "start: Petrol engine $horsePower with $engineCapacity CC")
    }
}