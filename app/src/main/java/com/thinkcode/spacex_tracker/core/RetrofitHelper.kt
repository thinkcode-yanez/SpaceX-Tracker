package com.thinkcode.spacex_tracker.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit():Retrofit{

        return Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com/v4/launches/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    }
}