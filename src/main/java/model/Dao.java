package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String urlConnection = "jdbc:mysql://localhost:3306/domestic_task";
	private String databaseUser = "root";
	private String databaseUserPassword= "admin";
	
	
	private void connect() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	public Connection getConnection() throws SQLException{
		Connection connection = null;
		connect();
		connection = DriverManager.getConnection(urlConnection, databaseUser, databaseUserPassword);
		System.out.println(connection);
		return connection;
	}
}
