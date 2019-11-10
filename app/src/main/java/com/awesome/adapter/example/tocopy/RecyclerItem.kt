package com.awesome.adapter.example.tocopy

interface RecyclerItem {
    val id: String?
    override fun equals(other: Any?): Boolean
}