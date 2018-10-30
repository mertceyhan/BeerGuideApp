package com.beerguideapp.beerguideapp

import android.os.Bundle
import com.beerguideapp.beerguideapp.base.BaseActivity

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun getLayoutResourceId(): Int = R.layout.activity_main

}
