package com.awesome.adapter.example.example.ad

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_ad.view.*

class AdViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(ad: Ad) {
        itemView.ad.text = ad.text
    }

}