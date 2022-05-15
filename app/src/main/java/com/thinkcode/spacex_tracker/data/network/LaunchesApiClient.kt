package com.thinkcode.spacex_tracker.data.network

import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel
import retrofit2.Response
import retrofit2.http.GET

interface LaunchesApiClient {

    @GET("upcoming")
    suspend fun getAllLaunches(): Response<List<LaunchesUpcomingModel>>

}