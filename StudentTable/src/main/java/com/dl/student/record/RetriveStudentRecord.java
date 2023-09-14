package com.dl.student.record;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveStudentRecord {
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

			// step-3 get jdbc metadata
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println("--------DB Details--------");
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getDriverVersion());
			System.out.println(metaData.getUserName());
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
			System.out.println("--------------------------------------------------");

			// create Statement object
			statement = connection.createStatement();

			// retrieve the records from student table
			String query = "select * from student";

			ResultSet executeQuery = statement.executeQuery(query);

			while (executeQuery.next()) {
				String name = executeQuery.getString(2);
				int age = executeQuery.getInt(4);
				String branch = executeQuery.getString(3);
				int id = executeQuery.getInt(1);

				System.out.println(name + " | " + age + " | " + branch + " | " + id);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Database Not Found");
		}finally {
			statement.close();
			connection.close();
		}

	}

}
