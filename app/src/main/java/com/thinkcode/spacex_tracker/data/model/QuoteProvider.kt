package com.thinkcode.spacex_tracker.data.model

class QuoteProvider {

    companion object {

        fun random(): QuoteModel {

            val position = (0..2).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel("Test de elon", "Elon"),
            QuoteModel("Test de cesar", "Cesar"),
            QuoteModel("Test de dua", "dua")
        )
    }
}