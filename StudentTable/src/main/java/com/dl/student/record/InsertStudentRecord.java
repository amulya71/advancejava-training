package com.dl.student.record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentRecord {
	public static void main(String[] args) throws SQLException {
		Statement statement = null;
		Connection connection = null;

		try {
			// step-1 checking the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected");

			// step-2 checking the connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101", "root", "root");
			System.out.println("Database Connected");
			
			// create Statement object
			statement = connection.createStatement();

			// step-3 create student table
			String createStudent = "CREATE TABLE STUDENT " + "(id INTEGER not NULL, " + " name VARCHAR(255), "
					+ " branch VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";

			statement.execute(createStudent);
			System.out.println("table student created");

			// inserting the student records
			String s1 = "INSERT INTO STUDENT VALUES(0901,'Naveen','ECE',35)";
			String s2 = "INSERT INTO STUDENT VALUES(0902,'Amulya','BSC',32)";
			String s3 = "INSERT INTO STUDENT VALUES(0903,'Hansna','LLB',03)";
			String s4 = "INSERT INTO STUDENT VALUES(0904,'Sindhu','BSC',21)";
			String s5 = "INSERT INTO STUDENT VALUES(0905,'Lokesh','BCA',19)";

			statement.addBatch(s1);
			statement.addBatch(s2);
			statement.addBatch(s3);
			statement.addBatch(s4);
			statement.addBatch(s5);
			statement.executeBatch();
			System.out.println("Records Created");

		} catch (ClassNotFoundException e) {
			System.out.println("Database Not Found");
		} finally {

			statement.close();
			connection.close();

		}
	}

}
