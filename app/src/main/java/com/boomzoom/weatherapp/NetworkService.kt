package com.boomzoom.weatherapp

import retrofit2.Retrofit

/********************************************************
 * Created by Andrey Venzhega(BoomZoom) on 25.04.2019|20:48
 ********************************************************/
object NetworkService {

    val BASE_URL: String = "https://www.metaweather.com/api/location/search/?query=Kiev";

    var mRetrofit: Retrofit;

    init {
        mRetrofit = Retrofit.Builder().baseUrl(BASE_URL).build();
    }
}