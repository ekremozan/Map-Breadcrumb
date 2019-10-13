package com.ekremozan.mapbreadcrumbs.di.component

import com.ekremozan.mapbreadcrumbs.BaseApplication
import com.ekremozan.mapbreadcrumbs.di.builder.ActivityBuilder
import com.ekremozan.mapbreadcrumbs.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class])
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<BaseApplication>()
}