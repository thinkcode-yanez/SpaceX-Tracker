package com.thinkcode.spacex_tracker.domain

import com.thinkcode.spacex_tracker.data.DataRespository
import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel

class GetLaunchesUseCase {

    private val repository = DataRespository()


    suspend operator fun invoke(): List<LaunchesUpcomingModel> = repository.getAllUpcomingLaunches()



}