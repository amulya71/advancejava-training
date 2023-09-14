package com.dl.objectreference;

public class Models {
	// properties
	private String CarName;
	private double CarCost;
	private String CarGeneration;
	private String CarType;

	// setters and getters
	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public double getCarCost() {
		return CarCost;
	}

	public void setCarCost(double carCost) {
		CarCost = carCost;
	}

	public String getCarGeneration() {
		return CarGeneration;
	}

	public void setCarGeneration(String carGeneration) {
		CarGeneration = carGeneration;
	}

	public String getCarType() {
		return CarType;
	}

	public void setCarType(String carType) {
		CarType = carType;
	}

	// to String
	@Override
	public String toString() {
		return "Models [CarName=" + CarName + ", CarCost=" + CarCost + ", CarGeneration=" + CarGeneration + ", CarType="
				+ CarType + "]";
	}

}
