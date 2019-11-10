package com.awesome.adapter.example.example.ad

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.awesome.adapter.example.R
import com.awesome.adapter.example.tocopy.AdapterListener
import com.awesome.adapter.example.tocopy.Cell
import com.awesome.adapter.example.tocopy.RecyclerItem

object AdCell : Cell<RecyclerItem>() {

    override fun belongsTo(item: RecyclerItem?): Boolean {
        return item is Ad
    }

    override fun type(): Int {
        return R.layout.item_ad
    }

    override fun holder(parent: ViewGroup): RecyclerView.ViewHolder {
        return AdViewHolder(parent.viewOf(type()))
    }

    override fun bind(
        holder: RecyclerView.ViewHolder,
        item: RecyclerItem?,
        listener: AdapterListener?
    ) {
        if (holder is AdViewHolder && item is Ad) {
            holder.bind(item)
            holder.itemView.setOnClickListener {
                listener?.listen(item)
            }
        }
    }

}