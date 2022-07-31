package bit.hemant.git.dagger_playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bit.hemant.git.dagger_playground.car.Car
import bit.hemant.git.dagger_playground.dagger.CarComponent
import bit.hemant.git.dagger_playground.dagger.DaggerCarComponent
import bit.hemant.git.dagger_playground.dagger.DieselEngineModule
import bit.hemant.git.dagger_playground.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val carComponent: CarComponent =
            DaggerCarComponent.builder()
                .dieselEngineModule(DieselEngineModule(100))
                .build()
//        car = carComponent.getCar()
        carComponent.injectMain(this)
        car.drive()
    }


}