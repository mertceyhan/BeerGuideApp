package com.beerguideapp.beerguideapp.di

import android.content.Context
import android.util.Log
import com.beerguideapp.beerguideapp.data.network.BeerGuideRestInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Furkan on 17.04.2019
 */
class RetrofitModule(private val context: Context) {

    fun makeRetrofitService(): BeerGuideRestInterface {
        val BASE_URL = "https://jsonplaceholder.typicode.com"

        Log.v("Koin", "Koin is alive!")

        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(BeerGuideRestInterface::class.java)
    }
}