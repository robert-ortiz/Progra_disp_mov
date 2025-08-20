package com.calyrsoft.ucbp1.di

import com.calyrsoft.ucbp1.data.repository.GithubRepository
import com.calyrsoft.ucbp1.domain.repository.IGithubRepository
import com.calyrsoft.ucbp1.domain.usecase.FindByNickNameUseCase
import com.calyrsoft.ucbp1.presentation.GithubViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<IGithubRepository>{ GithubRepository() }
    factory { FindByNickNameUseCase(get()) }
    viewModel { GithubViewModel(get()) }
}