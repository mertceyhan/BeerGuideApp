package com.beerguideapp.beerguideapp.data.network

import com.beerguideapp.beerguideapp.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface BeerGuideRestInterface {
    @GET("[END_POINT]")
    fun getAllBeerList()

    @GET("/posts")
    fun dummyData(): Call<List<Post>>
}