package com.williamnery.convidados.repository

import android.content.ContentValues
import android.content.Context
import com.williamnery.convidados.model.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    // Singleton -> Controla o número de instancias em uma classe
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(guest: GuestModel) {
        val db = guestDataBase.writableDatabase

        val presence = if (guest.presence) 1 else 0

        val values = ContentValues()
        values.put("presence", presence)
        values.put("name", guest.name)
        
        db.insert("Guest", null, values)
    }

    fun update() {

    }

}