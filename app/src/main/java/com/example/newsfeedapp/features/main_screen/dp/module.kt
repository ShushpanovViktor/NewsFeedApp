package com.example.newsfeedapp.features.main_screen.dp

import com.example.newsfeedapp.features.main_screen.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainScreenModule = module {
    viewModel {
        MainScreenViewModel( )
    }
}