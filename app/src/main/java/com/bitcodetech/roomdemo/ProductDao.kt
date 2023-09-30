package com.bitcodetech.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Insert
    fun insert(product: Product)

    @Query("select _id, product_title, price from products")
    fun getAll() : List<Product>

    @Delete
    fun delete(product: Product)
}