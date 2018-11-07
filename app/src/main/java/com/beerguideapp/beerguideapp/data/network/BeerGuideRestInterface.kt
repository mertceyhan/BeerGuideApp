package com.beerguideapp.beerguideapp.data.network

import retrofit2.http.GET

interface BeerGuideRestInterface {
    @GET("[END_POINT]")
    fun getAllBeerList()
}