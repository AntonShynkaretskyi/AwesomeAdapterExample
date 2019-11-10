package com.awesome.adapter.example.example

import com.awesome.adapter.example.example.ad.Ad
import com.awesome.adapter.example.example.movie.Movie
import com.awesome.adapter.example.tocopy.RecyclerItem

object ExampleData {

    fun createList(): List<RecyclerItem> {
        val list = ArrayList<RecyclerItem>()

        list.add(
            Movie(
                id = "1",
                name = "Movie 1",
                description = "Description 1"
            )
        )

        list.add(
            Movie(
                id = "2",
                name = "Movie 2",
                description = "Description 2"
            )
        )

        list.add(
            Ad(
                id = "11",
                text = "Advertising text"
            )
        )

        list.add(
            Movie(
                id = "3",
                name = "Movie 3",
                description = "Description 3"
            )
        )

        return list
    }

}