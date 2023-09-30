package com.bitcodetech.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product (
    @PrimaryKey
    @ColumnInfo(name = "_id")
    var id : Int,
    @ColumnInfo(name = "product_title") var title : String,
    var price : Float?
)