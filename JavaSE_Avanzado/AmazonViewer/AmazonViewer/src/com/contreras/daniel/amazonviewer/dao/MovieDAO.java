package com.contreras.daniel.amazonviewer.dao;

import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.model.Movie;

public interface MovieDAO {
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList<>();
		return movies;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
}