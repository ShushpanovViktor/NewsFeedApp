package com.example.newsfeedapp.features.main_screen.data.di

import com.example.newsfeedapp.features.main_screen.data.api.NewsApi
import com.example.newsfeedapp.features.main_screen.data.api.NewsRemoteSource
import com.example.newsfeedapp.features.main_screen.data.api.NewsRepo
import com.example.newsfeedapp.features.main_screen.data.api.NewsRepoImpl
import com.example.newsfeedapp.features.main_screen.domain.NewsInteractor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//?q={city name}&appid={d51a8a7ca67921b871dd5057d52a23bc}
const val BASE_URL = "https://newsapi.org/v2/everything?q=bitcoin&apiKey=API_KEY"

val appModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }


    single<NewsApi> {
        get<Retrofit>().create(NewsApi::class.java)
    }

    single<NewsRemoteSource> {
        NewsRemoteSource(api = get<NewsApi>())
    }

    single<NewsRepo> {
        NewsRepoImpl(get<NewsRemoteSource>())
    }

    single<NewsInteractor> {
        NewsInteractor(get<NewsRepo>())
    }

    //viewModel<WeatherScreenViewModel> {
     //   WeatherScreenViewModel(get<WeatherInteractor>())
   // }
}
