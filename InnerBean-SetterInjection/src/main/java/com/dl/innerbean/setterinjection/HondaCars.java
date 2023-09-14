package com.dl.innerbean.setterinjection;

public class HondaCars {
	private String CarModels;

	public String getCarModels() {
		return CarModels;
	}

	public void setCarModels(String carModels) {
		CarModels = carModels;
	}

	@Override
	public String toString() {
		return "HondaCars [CarModels=" + CarModels + "]";
	}

}
