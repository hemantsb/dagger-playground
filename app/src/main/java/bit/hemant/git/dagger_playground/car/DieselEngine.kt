package bit.hemant.git.dagger_playground.car

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine{
    private val TAG = "Car"

    @Inject
    constructor()

    override fun start() {
        Log.d(TAG, "start: Diesel engine")
    }
}