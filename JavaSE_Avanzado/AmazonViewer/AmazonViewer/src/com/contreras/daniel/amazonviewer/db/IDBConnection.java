package com.contreras.daniel.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import  static com.contreras.daniel.amazonviewer.db.DataBase.*;

public interface IDBConnection {
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL + DB, USER,PASSWORD);
			if(connection != null){
				System.out.println("Conection with DB established!.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return connection;
		}
	}
}
