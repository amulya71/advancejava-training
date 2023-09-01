package com.dl.jdbc.connections.check;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.dl.jdbc.connect.ConnectionCostants;
import com.mysql.jdbc.Driver;

public interface JdbcConnectionsCheck {
	
	//Diver check
	default void driverCheck() throws SQLException {
		DriverManager.registerDriver(new Driver());
		System.out.println("Driver found");
	}
	
	//Connection check
	default void jdbcConnectionCheck() throws SQLException {
		DriverManager.getConnection(ConnectionCostants.SQL_URL, ConnectionCostants.USER_NAME, ConnectionCostants.PASSWORD);
		System.out.println("JDBC Connection established ");
	}

}
