package com.thinkcode.spacex_tracker.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel
import com.thinkcode.spacex_tracker.domain.GetLaunchesUseCase
import kotlinx.coroutines.launch

class LaunchesViewModel:ViewModel() {

    val launchesModel= MutableLiveData<List<LaunchesUpcomingModel>>()

    val getLaunchesUseCase=GetLaunchesUseCase()


    fun getAllLaunches(){

        viewModelScope.launch {
            val result = getLaunchesUseCase()

           if(!result.isNullOrEmpty()){
               launchesModel.postValue(result)
           }


        }
    }

}