package com.beerguideapp.beerguideapp.network

import retrofit2.http.GET

interface BeerGuideRestInterface {
    @GET("beerList")
    fun getAllBeerList()
}