package com.beerguideapp.beerguideapp.di

import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by Furkan on 17.04.2019
 */

object AppModule {

    fun getModule(): Module = module {
        single { RetrofitModule(get()) }
    }
}