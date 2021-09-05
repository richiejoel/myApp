package com.heavy.myapp.data.network

import com.heavy.myapp.core.RetrofitHelper
import com.heavy.myapp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class QuoteService @Inject constructor(
    private val api:QuoteAPIClient
) {

    //private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<QuoteModel>> = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}