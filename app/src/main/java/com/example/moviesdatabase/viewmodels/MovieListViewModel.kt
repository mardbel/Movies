package com.example.moviesdatabase.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesdatabase.data.Movie
import com.example.moviesdatabase.data.MoviesProvider

class MovieListViewModel : ViewModel() {

    val movie = MutableLiveData<List<Movie>>()

    fun getMovies() {
        val movies = MoviesProvider.getMoviesList()
        movie.postValue(movies)
    }


}


