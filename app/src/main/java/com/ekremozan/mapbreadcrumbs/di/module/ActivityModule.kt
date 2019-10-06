package com.ekremozan.mapbreadcrumbs.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.ekremozan.mapbreadcrumbs.di.ActivityContext
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private val mActivity: AppCompatActivity) {

    @Provides
    @ActivityContext
    internal fun provideContext(): Context {
        return mActivity
    }

    @Provides
    internal fun provideActivity(): AppCompatActivity {
        return mActivity
    }

//    @Provides
//    @PerActivity
//    fun provideMainPresenter(presenter: MainPresenter<MainContract.View>): MainContract.Presenter<MainContract.View> = presenter
}