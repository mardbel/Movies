package com.example.moviesdatabase.data

class MoviesProvider {
    companion object {
        fun getMoviesList(): List<Movie> {
            return movieList
        }

        private val movieList = listOf<Movie>(
            Movie(
                "the Matrix",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Felcritico.com.ar%2Fkeanu-reeves-regresa-a-matrix%2F&psig=AOvVaw3NegjU6TsmlwovbKAHsKRF&ust=1631405014141000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIjs57XP9fICFQAAAAAdAAAAABAD",
                5.0,
                "the best fucking movie ever"
            ),
            Movie(
                "Fight Club",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Farticulo.mercadolibre.com.ar%2FMLA-612198042-poster-fight-club-o-club-de-la-pelea-35-x-50-cm-_JM&psig=AOvVaw1nswsV_x6oBccJPJHvNOfF&ust=1631905106527000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNC81biWhPMCFQAAAAAdAAAAABAD",
                5.0,
                "another great movie"
            )
        )
    }
}