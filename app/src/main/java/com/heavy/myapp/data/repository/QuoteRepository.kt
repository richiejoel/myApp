package com.heavy.myapp.data.repository

import com.heavy.myapp.data.model.QuoteModel
import com.heavy.myapp.data.model.QuoteProvider
import com.heavy.myapp.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}