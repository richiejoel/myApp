package com.heavy.myapp.domain

import com.heavy.myapp.data.model.QuoteModel
import com.heavy.myapp.data.model.QuoteProvider

class GetRandomUseCase {

    operator fun invoke():QuoteModel? {
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val quoteRandom = (quotes.indices).random()
            return quotes[quoteRandom]
        }
        return null
    }
}