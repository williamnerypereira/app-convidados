package com.williamnery.convidados.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.williamnery.convidados.databinding.RowGuestBinding
import com.williamnery.convidados.model.GuestModel
import com.williamnery.convidados.view.listener.OnGuestListener

class GuestViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textName.text = guest.name

        bind.textName.setOnClickListener {
            listener.onClick(guest.id)
        }
    }

}