package com.ekremozan.mapbreadcrumbs.di.module

import android.content.Context
import androidx.room.Room
import com.ekremozan.mapbreadcrumbs.data.local.DataBase
import com.ekremozan.mapbreadcrumbs.data.local.dao.CoordinateDao
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun provideDatabase(context: Context): DataBase {
        return Room
            .databaseBuilder(context, DataBase::class.java, "map-breadcrumbs-database")
            .build()
    }

    @Provides
    fun provideFavoriteDao(database: DataBase): CoordinateDao {
        return database.getCoordinateDao()
    }
}