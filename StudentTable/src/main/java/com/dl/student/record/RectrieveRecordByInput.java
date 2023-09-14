package com.dl.student.record;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RectrieveRecordByInput {
	public static void main(String[] args) throws SQLException {
		Statement statement = null;
		Connection connection = null;
		Scanner scanner = null;
		CallableStatement callableStatement = null;

		try {
			String SQL = "CALL student(?)";

			// step-1 checking the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connected");

			// step-2 checking the connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101?autoReconnect=true&useSSL=false", "root", "root");
			System.out.println("Database Connected");

			callableStatement = connection.prepareCall(SQL);

			// create Statement object
			statement = connection.createStatement();
			scanner = new Scanner(System.in);
			System.out.println("Enter Student ID::");

			int studentId = scanner.nextInt();
			callableStatement.setInt(1, studentId);

			ResultSet rs = callableStatement.executeQuery();
			while (rs.next()) {
				String name = callableStatement.getString(2);
				int age = callableStatement.getInt(4);
				String branch = callableStatement.getString(3);
				int id = callableStatement.getInt(1);

				System.out.println(name + " | " + age + " | " + branch + " | " + id);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Database Not Found");
		} finally {
			statement.close();
			connection.close();
		}

	}

}
