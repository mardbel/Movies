package com.example.moviesdatabase.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesdatabase.databinding.ActivityMovieListBinding
import com.example.moviesdatabase.viewmodels.MovieListViewModel

class MovieListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieListBinding
    private val adapter = MovieListAdapter()
    private val viewModel by viewModels<MovieListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycler = binding.recyclerMovieList
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
        viewModel.getMovies()

        viewModel.movie.observe(this, Observer {
            adapter.movies = it
        })

        Intent(this, MovieDetailActivity::class.java).also {
            startActivity(it)
        }
    }
}


