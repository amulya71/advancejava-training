package com.dl.jdbc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Eg1 {
	public static void main(String[] args) throws SQLException {
		// Diver check
		DriverManager.registerDriver(new Driver());
		System.out.println("Driver found");

		// Connection check
		Connection connection = DriverManager.getConnection(ConnectionCostants.SQL_URL, ConnectionCostants.USER_NAME,
				ConnectionCostants.PASSWORD);
		System.out.println("JDBC Connection established ");

		// create Statement object
		Statement statement = connection.createStatement();

		// Executing the query | insert values into existing table
		String query = "INSERT INTO EMP VALUES (103, 'Hansna Kriiti', 'OGL', 3)";
		/*
		 * String query = "INSERT INTO EMP VALUES" + "(" + ConnectionCostants.User1.ID +
		 * ConnectionCostants.User1.USER_NAME + ConnectionCostants.User1.ADDRESS +
		 * ConnectionCostants.User1.AGE + ")";
		 */

		try {
			statement.execute(query);
			System.out.println("inserted data into emp table");
		} catch (SQLException e) {
			System.out.println("cant insert data into table");
			e.printStackTrace();
		}

		statement.close();
		connection.close();
		
	}
}
