package com.bitcodetech.roomdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users", primaryKeys = arrayOf("id"))
class User(
    val id : Int,
    val name : String,
    val email : String
) {
}