package com.heavy.myapp.domain

import com.heavy.myapp.data.model.QuoteModel
import com.heavy.myapp.data.repository.QuoteRepository
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository:QuoteRepository) {

    //private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>?{
        return repository.getAllQuotes()
    }

}