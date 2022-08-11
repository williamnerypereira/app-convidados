package com.williamnery.convidados.repository

class GuestRepository private constructor() {

    // Singleton -> Controla o número de instancias em uma classe
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(): GuestRepository {
            if(!Companion::repository.isInitialized) {
                repository = GuestRepository()
            }
            return repository
        }
    }

    fun save() {
        GuestDataBase()
    }

}