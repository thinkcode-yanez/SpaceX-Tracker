package com.thinkcode.spacex_tracker.data

import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel
import com.thinkcode.spacex_tracker.data.network.FirebaseQuoteService
import com.thinkcode.spacex_tracker.data.network.RetrofitLaunchesService

class DataRespository {

    private val api= RetrofitLaunchesService()
    private val api2= FirebaseQuoteService() //Hacer metodo para llamar las quotes de firebase


    suspend fun getAllUpcomingLaunches():List<LaunchesUpcomingModel>{

        val response = api.getUpcomingLaunches()
        return response
    }

    //TODO SuspenFun de obtener quotes de firebase.




}