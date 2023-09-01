package com.main.test;

public class TestMyClass {
	public static void main(String[] args) {
		try {
			//Created class by myself
			Class.forName("com.main.Demo");
			System.out.println("Yes! Class Found");
			
			//Class form jar
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("jdk.nio.Channels");
			System.out.println("Yes!: Class found from JAR file");
			
			
		} catch (Exception e) {
			System.out.println("Sorry! Class not found");
		}
	}
}
