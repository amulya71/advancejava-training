package com.dl.spring.relationship;

public class Car {

	Honda honda; // Data Member

	public Car(Honda honda) {
		this.honda = honda;
	}

	public void display() {
		System.out.println(honda.vehicalNo);
		System.out.println(honda.vehicalName);
	}

	public static void main(String[] args) {
		Honda honda = new Honda(2324, "Honda City");
		Car car = new Car(honda);
		car.display();

	}

}
