package com.example.newsfeedapp.features.main_screen.data.api

import com.example.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel

interface NewsRepo {
    suspend fun getNews(): List<ArticleDomainModel>
}