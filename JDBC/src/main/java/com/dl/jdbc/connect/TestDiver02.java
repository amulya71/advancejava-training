package com.dl.jdbc.connect;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDiver02 {
	public static void main(String[] args) throws SQLException {
		String sqlurl = "jdbc:mysql://localhost:3306/jdbc101";
		String username = "root";
		String password = "root";
		try {
			DriverManager.getConnection(sqlurl, username, password);
			System.out.println("Connected to DB");
		} catch (Exception e) {
			System.out.println("Connection Exception");
		}
	}

}