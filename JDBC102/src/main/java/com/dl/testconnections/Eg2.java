package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg2 {
	static Connection connection = null;
	static Statement statement = null;
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101?autoReconnect=true&useSSL=false","root","root");
			
			statement = connection.createStatement();
			
			String s1 = "insert into emp values(02106,'sairam','Hyd',250000.00)";
			String s2 = "insert into emp values(02107,'sairam','Hyd',250000.00)";
			String s3 = "insert into emp values(02108,'sairam','Hyd',250000.00)";
			String s4 = "insert into emp values(02111,'sairam','Hyd',250000.00)";
			String s5 = "insert into emp values(02112,'sairam','Hyd',250000.00)";
			
			statement.addBatch(s1);
			statement.addBatch(s2);
			statement.addBatch(s3);
			statement.addBatch(s4);
			statement.addBatch(s5);
			
			int[] executeBatch = statement.executeBatch();
			for (int i : executeBatch) {
				System.out.println(i);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}finally {
			statement.close();
			connection.close();
		
		}
	}

}
