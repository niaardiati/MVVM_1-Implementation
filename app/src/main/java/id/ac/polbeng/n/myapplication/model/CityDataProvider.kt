package id.ac.polbeng.n.myapplication.model

import id.ac.polbeng.n.myapplication.R

class CityDataProvider {
    private val cities = arrayListOf<City>()
    init {
        cities.add(City(name = "Bangkok", R.drawable.bangkok, 10_000_000) )
        cities.add(City(name = "Beijing", R.drawable.beijing, 21_500_000) )
        cities.add(City(name = "London", R.drawable.london, 8_900_000) )
        cities.add(City(name = "Newyork", R.drawable.newyork, 8_400_000) )
        cities.add(City(name = "Paris", R.drawable.paris, 2_100_000) )
        cities.add(City(name = "Singapore", R.drawable.singapore, 5_700_000) )
        cities.add(City(name = "Tokyo", R.drawable.tokyo, 13_900_000) )
    }

    fun getCities() = cities
}