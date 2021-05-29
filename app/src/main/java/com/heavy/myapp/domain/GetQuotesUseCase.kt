package com.heavy.myapp.domain

import com.heavy.myapp.data.model.QuoteModel
import com.heavy.myapp.data.repository.QuoteRepository

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>?{
        return repository.getAllQuotes()
    }

}