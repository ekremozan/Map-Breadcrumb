package com.ekremozan.mapbreadcrumbs.di.module

import android.content.Context
import com.ekremozan.mapbreadcrumbs.BaseApplication
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: BaseApplication): Context = application

    @Provides
    @Singleton
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}