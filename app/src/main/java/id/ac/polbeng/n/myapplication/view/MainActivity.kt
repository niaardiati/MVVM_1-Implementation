package id.ac.polbeng.n.myapplication.view

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import id.ac.polbeng.n.myapplication.R
import id.ac.polbeng.n.myapplication.databinding.ActivityMainBinding
import id.ac.polbeng.n.myapplication.model.CityDataProvider
import id.ac.polbeng.n.myapplication.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model : CityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        model.getCityData().observe(this, Observer { city ->
            binding.cityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, city.img, applicationContext.theme)
            )
            binding.cityNameTV.text = city.name
            binding.cityPopulationTV.text = city.population.toString()
        })
    }
}