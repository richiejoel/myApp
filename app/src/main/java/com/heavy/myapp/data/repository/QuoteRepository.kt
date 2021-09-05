package com.heavy.myapp.data.repository

import com.heavy.myapp.data.model.QuoteModel
import com.heavy.myapp.data.model.QuoteProvider
import com.heavy.myapp.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api:QuoteService,
    private val quoteProvider: QuoteProvider
    ) {

    //private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}