package com.aviral.cleando

import android.app.Application
import com.aviral.cleando.di.AppModule
import com.aviral.cleando.di.AppModuleImplementation

class CleanDoApplication : Application() {

    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()

        appModule = AppModuleImplementation(this)
    }

}