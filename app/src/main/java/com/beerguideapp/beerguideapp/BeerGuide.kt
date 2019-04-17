package com.beerguideapp.beerguideapp

import android.app.Application
import com.beerguideapp.beerguideapp.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by Furkan on 17.04.2019
 */

class BeerGuide : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BeerGuide)
            modules(AppModule.getModule())
        }
    }
}