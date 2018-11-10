package com.contreras.daniel.amazonviewer.dao;

import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.model.Movie;
import static com.contreras.daniel.amazonviewer.db.DataBase.*;

public interface MovieDAO extends IDBConnection {
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default static ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList<>();
		try (Connection connection = connecToDB()){
			String query = READ_QUERY + TMOVIE;
			PreparedStatement preparedStatement = connection.preparedStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				Movie movie = new Movie(
					rs.getString(MOVIET_TITLE),
					rs.getString(MOVIET_GENRE),
					rs.getString(MOVIET_DIRECTOR),
					Integer.valueOf(rs.getString(MOVIET_DURATION)),
					Short.valueOf(rs.getString(MOVIET_YEAR))
				);
				movies.add(movie);
			}
		} catch (SQLException e) {
			System.out.println("Ërror reading getting the movies from DB!");
		}
		return movies;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
}
