package com.ekremozan.mapbreadcrumbs

import android.app.Application
import com.ekremozan.mapbreadcrumbs.di.component.ApplicationComponent
import com.ekremozan.mapbreadcrumbs.di.component.DaggerApplicationComponent
import com.ekremozan.mapbreadcrumbs.di.module.ApplicationModule

class BaseApplication : Application() {

    private lateinit var mApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        setup()
    }

    private fun setup() {
        mApplicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
        mApplicationComponent.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return mApplicationComponent
    }
}
