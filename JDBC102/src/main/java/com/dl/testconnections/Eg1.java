package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
	static Connection connection = null;
	static Statement statement = null;
	public static void main(String[] args) throws SQLException {
		try {
			//step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Get Connections
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
			
			//step-3 Create Statement Object
			statement  = connection.createStatement();
			
			//step-4 Executing the Query
			String insert = "insert into emp values(104, 'sai kumar','Hyd',20000)";
			statement.executeUpdate(insert);
			System.out.println("Data Inserted");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}finally {
			//step-5  Closing Connections
			statement.close();
			connection.close();
		}
	}

}
