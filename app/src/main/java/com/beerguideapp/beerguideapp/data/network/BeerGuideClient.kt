package com.beerguideapp.beerguideapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BeerGuideClient {
    companion object {
        fun getBeerGuideClient(): Retrofit {
            return Retrofit.Builder()
                    .baseUrl("[BASE_URL]")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
    }
}