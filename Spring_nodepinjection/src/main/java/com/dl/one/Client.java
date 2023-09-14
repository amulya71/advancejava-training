package com.dl.one;

public class Client {
	public static void main(String[] args) {
		Brand b1 = new Car();
		System.out.println(b1.Honda());

		Brand b2 = new Bike();
		System.out.println(b2.Honda());
	}

}
