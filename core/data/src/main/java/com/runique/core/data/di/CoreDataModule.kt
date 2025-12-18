package com.runique.core.data.di

import com.runique.core.data.networking.HttpClientFactory
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val coreDataModule = module {
    single{
        HttpClientFactory().build()
    }
}