package com.williamnery.convidados.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.williamnery.convidados.databinding.RowGuestBinding
import com.williamnery.convidados.model.GuestModel

class GuestViewHolder(private val bind: RowGuestBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textName.text = guest.name
    }

}