package com.williamnery.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE Guest (" +
                        "id integer PRIMARY KEY AUTOINCREMENT, " +
                        "name text, " +
                        "presence integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVerison: Int, newVerison: Int) {

    }

}