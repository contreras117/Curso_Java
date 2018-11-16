package com.contreras.daniel.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.db.IDBConnection;
import com.contreras.daniel.amazonviewer.model.Movie;

import static com.contreras.daniel.amazonviewer.db.DataBase.*;

public interface MovieDAO extends IDBConnection {
	
	default void setMovieViewed(Movie movie) {
		
		try(Connection connection = connectToDB()) {
			Statement statement = connection.createStatement();
			String query = "INSERT INTO " + VIEWEDT + 
					" (" + VIEWEDT_IDMATERIAL + "," + VIEWEDT_IDELEMENT + "," + VIEWEDT_IDUSER + ")" +
					"VALUES(" + MATERIALT_ID[0] + "," + movie.getId() + "," + USERT_ID + ")";
			statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
					rs.getInt(MOVIET_DURATION),
					rs.getString(MOVIET_DIRECTOR),
					rs.getShort(MOVIET_YEAR)
				);
				
				movie.setId(rs.getInt(MOVIET_ID));
				movie.setViewed(getMovieViewed(preparedStatement, connection, movie.getId()));
				movies.add(movie);
			}
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println("Error reading getting the movies from DB!");
		}
		finally {
			return movies;
		}
		
	}
	
	private boolean getMovieViewed(PreparedStatement preparedStatement, Connection connection, int movieID) {
		boolean viewed = false;
		
		String query = READ_QUERY + VIEWEDT + " WHERE " +
				VIEWEDT_IDMATERIAL + " = ? AND " +
				VIEWEDT_IDELEMENT + " = ? AND " +
				VIEWEDT_IDUSER + " = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, MATERIALT_ID[0]);
			preparedStatement.setInt(2, movieID);
			preparedStatement.setInt(3, USERT_ID);
			
			ResultSet rs = preparedStatement.executeQuery();
			viewed = rs.next();
			preparedStatement.close();
						
		} catch (Exception e) {
			System.out.println("Error while reading the table VIEWED from db!");
		}
		finally {
			return viewed;
		}
		
	}
}
