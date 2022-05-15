package com.thinkcode.spacex_tracker.data.network

import com.thinkcode.spacex_tracker.core.RetrofitHelper
import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RetrofitLaunchesService {

    private val retrofit = RetrofitHelper.getRetrofit()


    suspend fun getUpcomingLaunches(): List<LaunchesUpcomingModel> {
        //Se ejecuta llamada al servvidor en hilo secundario por eso la corrutina.
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(LaunchesApiClient::class.java).getAllLaunches()
            response.body() ?: emptyList()
        }
    }
}