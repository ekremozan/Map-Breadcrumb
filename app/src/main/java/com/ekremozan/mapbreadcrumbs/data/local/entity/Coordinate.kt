package com.ekremozan.mapbreadcrumbs.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.ekremozan.mapbreadcrumbs.data.local.DateConverter
import java.util.*

@TypeConverters(DateConverter::class)
@Entity(tableName = "coordinate")
data class Coordinate(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id")val id: Long,
    @ColumnInfo(name = "xCoordinate")val  xCoordinate: String,
    @ColumnInfo(name = "yCoordinate")val yCoordinate: String,
    @ColumnInfo(name = "date")val date: Date
)