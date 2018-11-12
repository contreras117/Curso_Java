package com.contreras.daniel.amazonviewer.dao;

import static com.contreras.daniel.amazonviewer.db.DataBase.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.contreras.daniel.amazonviewer.db.IDBConnection;
import com.contreras.daniel.amazonviewer.model.Book;
import com.contreras.daniel.amazonviewer.model.Book.Page;

public interface BookDAO extends IDBConnection{
	
	default ArrayList<Book> read(){
		ArrayList<Book> books = new ArrayList<>();
		try (Connection connection = connectToDB()){
			String query = READ_QUERY + BOOKT;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while(rs.next()){
				Book book = new Book(
					rs.getString(BOOKT_TITLE),
					new Date(),
					rs.getString(BOOKT_GENRE),
					rs.getString(BOOKT_EDITORIAL),
					new String[] {},
					rs.getString(BOOKT_ISBN),
					new ArrayList<Page>()
				);
				books.add(book);
			}
		} catch (SQLException e) {
			System.out.println("Error reading getting the books from DB!");
		}
		return books;
	}
	
}
