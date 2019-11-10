package com.awesome.adapter.example.example.movie

import com.awesome.adapter.example.tocopy.AdapterClick
import com.awesome.adapter.example.tocopy.RecyclerItem

data class Movie(
    override val id: String,
    val name: String,
    val description: String
) : RecyclerItem, AdapterClick