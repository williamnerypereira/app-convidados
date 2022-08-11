package com.williamnery.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.williamnery.convidados.constants.DataBaseConstants

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE " +
                        DataBaseConstants.GUEST.TABLE_NAME + " (" +
                        DataBaseConstants.GUEST.COLUMNS.ID + " integer PRIMARY KEY AUTOINCREMENT, " +
                        DataBaseConstants.GUEST.COLUMNS.NAME + " text, " +
                        DataBaseConstants.GUEST.COLUMNS.PRESENCE + " integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVerison: Int, newVerison: Int) {

    }

}