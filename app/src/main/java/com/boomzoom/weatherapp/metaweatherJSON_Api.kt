package com.boomzoom.weatherapp

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*


/********************************************************
 * Created by Andrey Venzhega(BoomZoom) on 25.04.2019|21:18
 ********************************************************/
interface metaweatherJSON_Api {

    @GET("/location/search/")
    fun search(@Query("query") query: String): Observable<SearchResponse>

    companion object {
        val BASE_URL: String = "https://www.metaweather.com/api/";

        fun create(): metaweatherJSON_Api {

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(metaweatherJSON_Api::class.java)
        }
    }
}