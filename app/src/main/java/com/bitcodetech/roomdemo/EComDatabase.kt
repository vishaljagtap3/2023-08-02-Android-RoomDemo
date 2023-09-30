package com.bitcodetech.roomdemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Product::class, User::class], version = 1)
abstract class EComDatabase: RoomDatabase() {
    abstract fun getProductDao() : ProductDao
}