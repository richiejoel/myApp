package com.heavy.myapp.data.network

import com.heavy.myapp.core.RetrofitHelper
import com.heavy.myapp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<QuoteModel>> = retrofit.create(QuoteAPIClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}