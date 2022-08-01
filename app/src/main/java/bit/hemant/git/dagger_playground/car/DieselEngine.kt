package bit.hemant.git.dagger_playground.car

import android.util.Log
import javax.inject.Inject

class DieselEngine() : Engine {
    private val TAG = "Car"

    var horsePower: Int = 0

    @Inject
    constructor(horsePower: Int) : this() {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d(TAG, "start: Diesel engine with $horsePower HP")
    }
}