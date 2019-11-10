package com.awesome.adapter.example.example.ad

import com.awesome.adapter.example.tocopy.AdapterClick
import com.awesome.adapter.example.tocopy.RecyclerItem

data class Ad(
    override val id: String,
    val text: String
) : RecyclerItem, AdapterClick