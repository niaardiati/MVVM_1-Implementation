package id.ac.polbeng.n.myapplication.viewmodel

import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.ac.polbeng.n.myapplication.model.City
import id.ac.polbeng.n.myapplication.model.CityDataProvider
import android.os.Handler
import androidx.lifecycle.LiveData


class CityViewModel : ViewModel() {
    private  val cityData = MutableLiveData<City>()
    private val cities = CityDataProvider().getCities()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }
    fun getCityData() : LiveData<City> = cityData

    private fun loop(){
        Handler(Looper.getMainLooper()).postDelayed({updateCity()}, delay)
    }




    private fun updateCity() {
        currentIndex++
        currentIndex %= cities.size

        cityData.value = cities[currentIndex]

        loop()
    }
}