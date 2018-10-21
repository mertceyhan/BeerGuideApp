package com.beerguideapp.beerguideapp.view.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beerguideapp.beerguideapp.R.id
import com.beerguideapp.beerguideapp.R.layout
import com.beerguideapp.beerguideapp.view.ui.fragment.BaseFragment


abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }

    override fun onBackPressed() {
        (supportFragmentManager.findFragmentById(
                id.fragmentContainer) as BaseFragment).onBackPressed()
        super.onBackPressed()
    }

    abstract fun fragment(): BaseFragment


}