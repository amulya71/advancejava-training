package com.dl.jdbc.connect;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class TestDraiver01 {
	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new Driver());
		System.out.println("Yes Im in");
	}

}
