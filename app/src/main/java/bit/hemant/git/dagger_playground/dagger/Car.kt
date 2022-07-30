package bit.hemant.git.dagger_playground.dagger

import android.util.Log
import javax.inject.Inject

class Car() {
    private val TAG = "Car"

    private lateinit var engine: Engine
    private lateinit var wheels: Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels) : this() {
        this.engine = engine
        this.wheels = wheels
    }


    fun drive() {
        Log.d(TAG, "driving..")
    }
}