package com.dl.pojo;

public class Honda {
	// properties

	private int VechicalNo = 2323;
	private String VechicalName = "Honda City";

	// default constructor
	public Honda() {

	}

	// parameterized constructor
	public Honda(int vechicalNo, String vechicalName) {
		VechicalNo = vechicalNo;
		VechicalName = vechicalName;
	}

	// Setters and Getters

	public int getVechicalNo() {
		return VechicalNo;
	}

	public void setVechicalNo(int vechicalNo) {
		VechicalNo = vechicalNo;
	}

	public String getVechicalName() {
		return VechicalName;
	}

	public void setVechicalName(String vechicalName) {
		VechicalName = vechicalName;
	}

	// to string

	@Override
	public String toString() {
		return "Honda [VechicalNo=" + VechicalNo + ", VechicalName=" + VechicalName + "]";
	}

}
