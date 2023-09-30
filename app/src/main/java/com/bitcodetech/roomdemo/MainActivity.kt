package com.bitcodetech.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eCommDb = Room.databaseBuilder(
            this,
            EComDatabase::class.java,
            "db_ecomm"
        ).build()

        val productDao = eCommDb.getProductDao()

        productDao.insert(Product(101, "Laptop", 12345F))
        productDao.insert(Product(90, "Phone", 989F))
        productDao.insert(Product(230, "TV", 345.90f))

        val products = productDao.getAll()
        for(product in products) {
            Log.e("tag", product.toString())
        }
    }
}