package com.ekremozan.mapbreadcrumbs.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ekremozan.mapbreadcrumbs.data.local.dao.CoordinateDao
import com.ekremozan.mapbreadcrumbs.data.local.entity.Coordinate

@Database(entities = [Coordinate::class], version = 1)
abstract class DataBase: RoomDatabase() {
    abstract fun getCoordinateDao(): CoordinateDao
}