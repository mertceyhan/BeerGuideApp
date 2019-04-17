package com.beerguideapp.beerguideapp.activities

import android.os.Bundle
import android.util.Log
import com.beerguideapp.beerguideapp.R
import com.beerguideapp.beerguideapp.base.BaseActivity
import com.beerguideapp.beerguideapp.model.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        api.makeRetrofitService().dummyData().enqueue(object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                Log.v("Koin is alive!", response.body().toString())
            }

        })

    }

    override fun getLayoutResourceId(): Int = R.layout.activity_main

}
