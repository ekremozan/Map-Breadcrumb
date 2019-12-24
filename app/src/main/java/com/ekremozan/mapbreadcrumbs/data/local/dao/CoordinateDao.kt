package com.ekremozan.mapbreadcrumbs.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.ekremozan.mapbreadcrumbs.data.local.entity.Coordinate
import io.reactivex.Flowable

@Dao
interface CoordinateDao {

    @Query("SELECT * FROM Coordinate")
    abstract fun getAllCoordinates(): Flowable<List<Coordinate>>

    @Insert
    fun insert(book: Coordinate)
}