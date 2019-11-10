package com.awesome.adapter.example.example.movie

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.awesome.adapter.example.R
import com.awesome.adapter.example.tocopy.AdapterListener
import com.awesome.adapter.example.tocopy.Cell
import com.awesome.adapter.example.tocopy.RecyclerItem

object MovieCell : Cell<RecyclerItem>() {

    override fun belongsTo(item: RecyclerItem?): Boolean {
        return item is Movie
    }

    override fun type(): Int {
        return R.layout.item_movie
    }

    override fun holder(parent: ViewGroup): RecyclerView.ViewHolder {
        return MovieViewHolder(parent.viewOf(type()))
    }

    override fun bind(
        holder: RecyclerView.ViewHolder,
        item: RecyclerItem?,
        listener: AdapterListener?
    ) {
        if (holder is MovieViewHolder && item is Movie) {
            holder.bind(item)
            holder.itemView.setOnClickListener {
                listener?.listen(item)
            }
        }
    }

}