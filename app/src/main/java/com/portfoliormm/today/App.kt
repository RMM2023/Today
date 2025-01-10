package com.portfoliormm.today

import android.app.Application
import com.portfoliormm.today.di.dataModule
import com.portfoliormm.today.di.domainModule
import com.portfoliormm.today.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(dataModule, domainModule, viewModelModule)
        }
    }
}