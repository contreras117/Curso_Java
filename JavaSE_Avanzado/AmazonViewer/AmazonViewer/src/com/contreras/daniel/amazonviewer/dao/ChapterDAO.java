package com.contreras.daniel.amazonviewer.dao;

import static com.contreras.daniel.amazonviewer.db.DataBase.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.contreras.daniel.amazonviewer.db.IDBConnection;
import com.contreras.daniel.amazonviewer.model.Chapter;
import com.contreras.daniel.amazonviewer.model.Serie;

public interface ChapterDAO extends IDBConnection {

	default ArrayList<Chapter> read(){
		ArrayList<Chapter> chapters = new ArrayList<>();
		try (Connection connection = connectToDB()){
			String query = READ_QUERY + CHAPTERT;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				Chapter chapter = new Chapter(
					rs.getString(CHAPTERT_TITLE),
					rs.getString(CHAPTERT_GENRE),
					rs.getInt(CHAPTERT_DURATION),
					rs.getString(CHAPTERT_DIRECTOR),
					rs.getShort(CHAPTERT_YEAR),
					rs.getByte(CHAPTERT_SEASON_NUMBER),
					new Serie()
				);
				chapters.add(chapter);
			}
		} catch (SQLException e) {
			System.out.println("Error reading getting the chapters from DB!");
		}
		return chapters;
	}
	
}
