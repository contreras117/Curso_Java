package com.contreras.daniel.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.db.IDBConnection;
import com.contreras.daniel.amazonviewer.model.Movie;
import static com.contreras.daniel.amazonviewer.db.DataBase.*;

public interface MovieDAO extends IDBConnection {
	
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movies = new ArrayList<>();
		try (Connection connection = connectToDB()){
			String query = READ_QUERY + MOVIET;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				Movie movie = new Movie(
					rs.getString(MOVIET_TITLE),
					rs.getString(MOVIET_GENRE),
					Integer.valueOf(rs.getString(MOVIET_DURATION)),
					rs.getString(MOVIET_DIRECTOR),
					Short.valueOf(rs.getString(MOVIET_YEAR))
				);
				movies.add(movie);
			}
		} catch (SQLException e) {
			System.out.println("Error reading getting the movies from DB!");
		}
		return movies;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
}
