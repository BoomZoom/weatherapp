package com.boomzoom.weatherapp

/********************************************************
 * Created by Andrey Venzhega(BoomZoom) on 25.04.2019|20:59
 ********************************************************/
data class SearchResponse(
    val items: List<City>
)

data class City(
    val title: String,
    val location_type: String,
    val woeid: Int,
    val latt_long: String
)
