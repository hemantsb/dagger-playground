package bit.hemant.git.dagger_playground.car

import android.util.Log

class DieselEngine(val horsePower: Int) : Engine{
    private val TAG = "Car"


    override fun start() {
        Log.d(TAG, "start: Diesel engine with $horsePower HP")
    }
}