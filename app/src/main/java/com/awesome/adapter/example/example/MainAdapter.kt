package com.awesome.adapter.example.example

import com.awesome.adapter.example.example.ad.AdCell
import com.awesome.adapter.example.example.movie.MovieCell
import com.awesome.adapter.example.tocopy.AdapterListener
import com.awesome.adapter.example.tocopy.BaseListAdapter

class MainAdapter(listener: AdapterListener) : BaseListAdapter(
    MovieCell, AdCell,
    listener = listener
)