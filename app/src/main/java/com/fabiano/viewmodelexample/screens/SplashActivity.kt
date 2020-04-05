package com.fabiano.viewmodelexample.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fabiano.viewmodelexample.R
import com.fabiano.viewmodelexample.utils.extensions.initActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initView()
    }

    private fun initView() {
        Handler().postDelayed({
            finish()
            initActivity(LoginActivity())
        }, 1000)
    }
}

