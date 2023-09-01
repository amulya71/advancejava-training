package com.dl;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class TestDriver {
	public static void main(String[] args) throws SQLException 	{
		
		//DriverManager.getDriver("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new Driver());
		System.out.println("Yes!, I'm in");
		
	}

}
