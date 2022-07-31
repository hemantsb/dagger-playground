package bit.hemant.git.dagger_playground.dagger

import android.util.Log
import javax.inject.Inject

class Car() {
    private val TAG = "Car"

    @Inject
    lateinit var engine: Engine
    private lateinit var wheels: Wheels

    @Inject
    constructor(wheels: Wheels) : this() {
        this.wheels = wheels
    }

    @Inject
    fun setRemoteListener(remote: Remote) {
        remote.setListener(this)
    }


    fun drive() {
        Log.d(TAG, "driving..")
    }
}