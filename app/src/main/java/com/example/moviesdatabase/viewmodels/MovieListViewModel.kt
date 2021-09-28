package com.example.moviesdatabase.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviesdatabase.data.Movie
import com.example.moviesdatabase.repository.MoviesRepository

class MovieListViewModel : ViewModel() {

    var movie = MoviesRepository.getMoviesPlayingNow()

    /*fun getMovies() {
        var movies = MoviesRepository.getMoviesPlayingNow()
        movie = movies*/
    }





