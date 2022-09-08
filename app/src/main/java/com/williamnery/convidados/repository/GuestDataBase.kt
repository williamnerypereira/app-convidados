package com.williamnery.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.williamnery.convidados.constants.DataBaseConstants
import com.williamnery.convidados.model.GuestModel

// class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {
@Database(entities = [GuestModel::class], version = 1)
abstract class GuestDataBase() : RoomDatabase() {

    companion object {
        private lateinit var INSTANCE: GuestDataBase

        fun getDataBase(context: Context): GuestDataBase {
            if (!::INSTANCE.isAbstract) {
                synchronized(GuestDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context, GuestDataBase::class.java, "guestdb")
                        .addMigrations(MIGRATION_1_2)
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("DELETE FROM Guest")
            }

        }
    }

    /*companion object {
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

    override fun onUpgrade(db: SQLiteDatabase, oldVerison: Int, newVerison: Int) {}*/

}