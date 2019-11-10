package com.awesome.adapter.example.example.movie

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(movie: Movie) {
        itemView.name.text = movie.name
        itemView.description.text = movie.description
    }

}