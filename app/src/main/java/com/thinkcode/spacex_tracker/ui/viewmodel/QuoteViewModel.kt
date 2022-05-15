package com.thinkcode.spacex_tracker.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thinkcode.spacex_tracker.data.model.QuoteModel
import com.thinkcode.spacex_tracker.data.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel= MutableLiveData<QuoteModel>() //Mutable del tipo de quotemodel


    fun randomQuote(){

        val currentQuote = QuoteProvider.random()

        quoteModel.postValue(currentQuote)

    }

}