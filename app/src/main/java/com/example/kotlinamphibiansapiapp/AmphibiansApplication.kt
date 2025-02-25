package com.example.kotlinamphibiansapiapp

import android.app.Application
import com.example.kotlinamphibiansapiapp.data.AppContainer
import com.example.kotlinamphibiansapiapp.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}