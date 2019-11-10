package com.awesome.adapter.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.awesome.adapter.example.example.ExampleData
import com.awesome.adapter.example.example.movie.Movie
import com.awesome.adapter.example.example.MainAdapter
import com.awesome.adapter.example.example.ad.Ad
import com.awesome.adapter.example.tocopy.AdapterClick
import com.awesome.adapter.example.tocopy.AdapterListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterListener {

    private val listAdapter by lazy { MainAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()
    }

    private fun initialize() {
        recycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }

        listAdapter.submitList(ExampleData.createList())
    }

    override fun listen(click: AdapterClick?) {
        when (click) {
            is Movie -> {
                // E.g. open movie details
            }
            is Ad -> {
                // E.g. redirect to sponsor's page
            }
        }
    }

}