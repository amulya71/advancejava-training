package com.dl.innerbean.ref.injection;

public class FordCars {
	private String vhColor;
	private String vhYear;
	private Ford ford;
	
	public FordCars(String vhColor, String vhYear, Ford ford) {
		super();
		this.vhColor = vhColor;
		this.vhYear = vhYear;
		this.ford = ford;
	}
	
	public String getVhColor() {
		return vhColor;
	}
	public void setVhColor(String vhColor) {
		this.vhColor = vhColor;
	}
	public String getVhYear() {
		return vhYear;
	}
	public void setVhYear(String vhYear) {
		this.vhYear = vhYear;
	}
	public Ford getFord() {
		return ford;
	}
	public void setFord(Ford ford) {
		this.ford = ford;
	}
	
	@Override
	public String toString() {
		return "FordCars [vhColor=" + vhColor + ", vhYear=" + vhYear + ", ford=" + ford + "]";
	}
	
	

}
