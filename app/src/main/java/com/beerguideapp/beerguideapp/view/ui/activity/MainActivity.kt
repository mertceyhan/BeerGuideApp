package com.beerguideapp.beerguideapp.view.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.beerguideapp.beerguideapp.R
import com.beerguideapp.beerguideapp.view.ui.fragment.BaseFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
