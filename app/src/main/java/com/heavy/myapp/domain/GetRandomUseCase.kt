package com.heavy.myapp.domain

import com.heavy.myapp.data.model.QuoteModel
import com.heavy.myapp.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomUseCase @Inject constructor(private val quoteProvider: QuoteProvider){

    operator fun invoke():QuoteModel? {
        val quotes = quoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val quoteRandom = (quotes.indices).random()
            return quotes[quoteRandom]
        }
        return null
    }
}