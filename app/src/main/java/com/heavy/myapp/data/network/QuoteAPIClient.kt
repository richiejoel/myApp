package com.heavy.myapp.data.network

import com.heavy.myapp.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteAPIClient {

    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>

}