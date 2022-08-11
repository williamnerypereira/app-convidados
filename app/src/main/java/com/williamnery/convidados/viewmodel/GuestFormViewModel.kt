package com.williamnery.convidados.viewmodel

import androidx.lifecycle.ViewModel
import com.williamnery.convidados.repository.GuestRepository

class GuestFormViewModel : ViewModel() {

    private val repository = GuestRepository.getInstance()

}