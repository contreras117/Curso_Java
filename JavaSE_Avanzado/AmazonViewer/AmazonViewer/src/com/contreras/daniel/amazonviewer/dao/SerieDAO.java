package com.contreras.daniel.amazonviewer.dao;

import static com.contreras.daniel.amazonviewer.db.DataBase.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.db.IDBConnection;
import com.contreras.daniel.amazonviewer.model.Serie;

public interface SerieDAO extends IDBConnection{
	
	default ArrayList<Serie> read(){
		ArrayList<Serie> series = new ArrayList<>();
		try (Connection connection = connectToDB()){
			String query = READ_QUERY + SERIET;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				Serie serie = new Serie(
					rs.getString(SERIET_TITLE),
					rs.getString(SERIET_GENRE),
					rs.getInt(SERIET_DURATION),
					rs.getString(SERIET_CREATOR),
					rs.getByte(SERIET_SEASONS_QUANTITY)
				);
				series.add(serie);
			}
		} catch (SQLException e) {
			System.out.println("Error reading getting the series from DB!");
		}
		return series;
	}

}
