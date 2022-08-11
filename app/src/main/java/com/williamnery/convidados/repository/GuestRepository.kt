package com.williamnery.convidados.repository

import android.content.Context
import com.williamnery.convidados.GuestModel

class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    // Singleton -> Controla o número de instancias em uma classe
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if(!::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert() {
    }

    fun update() {

    }

}