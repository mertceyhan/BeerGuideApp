package com.beerguideapp.beerguideapp.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.beerguideapp.beerguideapp.di.RetrofitModule
import org.koin.android.ext.android.inject

abstract class BaseActivity : AppCompatActivity() {

    val api: RetrofitModule by inject()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutResourceId())


    }

    abstract fun getLayoutResourceId(): Int
}
