package com.dl.innerbean.usingcons;

public class Honda {
	private HondaCars hondaCars;
	
	
	public Honda(HondaCars hondaCars) {
		this.hondaCars = hondaCars;
	}

	public Honda() {
		// TODO Auto-generated constructor stub
	}

	public HondaCars getHondaCars() {
		return hondaCars;
	}

	public void setHondaCars(HondaCars hondaCars) {
		this.hondaCars = hondaCars;
	}

	@Override
	public String toString() {
		return "Honda [hondaCars=" + hondaCars + "]";
	}

}
