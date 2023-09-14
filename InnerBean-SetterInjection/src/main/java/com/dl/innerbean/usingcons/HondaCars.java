package com.dl.innerbean.usingcons;

public class HondaCars {

	private String carModels;
	
	public HondaCars(String carModels) {
		this.carModels = carModels;
	}

	public String getCarModels() {
		return carModels;
	}

	public void setCarModels(String carModels) {
		this.carModels = carModels;
	}

	@Override
	public String toString() {
		return "HondaCars [carModels=" + carModels + "]";
	}

}
