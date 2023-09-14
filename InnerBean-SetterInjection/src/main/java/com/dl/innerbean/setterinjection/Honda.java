package com.dl.innerbean.setterinjection;

public class Honda {
	private HondaCars hondacars;

	public HondaCars getHondacars() {
		return hondacars;
	}

	public void setHondacars(HondaCars hondacars) {
		this.hondacars = hondacars;
	}

	@Override
	public String toString() {
		return "Honda [hondacars=" + hondacars + "]";
	}

}
