package com.example.moviesdatabase.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesdatabase.R
import com.example.moviesdatabase.data.Movie
import com.example.moviesdatabase.databinding.MovieListLayoutBinding

class MovieListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var myListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnClickListener(listener: OnItemClickListener) {
        myListener = listener
    }

    var movies: List<Movie> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_list_layout, parent, false)
        return ViewHolder(view, myListener)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolder -> {
                holder.bind(movies[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    class ViewHolder constructor(itemView: View, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView) {

        var binding = MovieListLayoutBinding.bind(itemView)
        private val movieRank = binding.movieItemRating
        private val movieTittle = binding.movieTittleTv

        fun bind(movie: Movie) {
            movieRank.text = movie.rating.toString()
            movieTittle.text = movie.tittle
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}