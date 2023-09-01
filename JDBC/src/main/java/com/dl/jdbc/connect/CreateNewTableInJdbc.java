package com.dl.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateNewTableInJdbc {

	public static void main(String[] args) throws SQLException  {
		
		//Diver check
		DriverManager.registerDriver(new Driver());
		System.out.println("Driver found");
		
		//Connection check
		Connection connection = DriverManager.getConnection(ConnectionCostants.SQL_URL, ConnectionCostants.USER_NAME, ConnectionCostants.PASSWORD);
		System.out.println("JDBC Connection established ");
		
		// create Statement object
		Statement statement = connection.createStatement();
		
		//Executing the query | create new table
		String query = "CREATE TABLE EMP " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " + 
                " address VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 
		
		try {
			statement.execute(query);
			System.out.println("table created");
		} catch (SQLException e) {
			System.out.println("table NOT created");
			e.printStackTrace();
		}
		
		statement.close();
		connection.close();
		

	}

}
