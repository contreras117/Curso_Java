package com.contreras.daniel.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.contreras.daniel.amazonviewer.db.IDBConnection;
import com.contreras.daniel.amazonviewer.model.Magazine;

import static com.contreras.daniel.amazonviewer.db.DataBase.*;

public interface MagazineDAO extends IDBConnection{
	
	default ArrayList<Magazine> read(){
		ArrayList<Magazine> magazines = new ArrayList<>();
		try (Connection connection = connectToDB()){
			String query = READ_QUERY + MAGAZINET;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				Magazine magazine = new Magazine(
					rs.getString(MAGAZINET_TITLE),
					new Date(),
					rs.getString(MAGAZINET_GENRE),
					rs.getString(MAGAZINET_EDITORIAL),
					new String[] {}
				);
				magazines.add(magazine);
			}
		} catch (SQLException e) {
			System.out.println("Error reading getting the magazines from DB!");
		}
		return magazines;
	}
}
