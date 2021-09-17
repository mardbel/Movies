package com.example.moviesdatabase.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesdatabase.databinding.ActivityMovieDetailBinding
import com.example.moviesdatabase.viewmodels.MovieListViewModel

class MovieDetailActivity(): AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailBinding
    private val viewModel by viewModels<MovieListViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}