package com.dl.innerbean.ref.injection;

public class Ford {
	
	private String vhNo;
	private String vehType;
	
	public Ford() {
		// TODO Auto-generated constructor stub
	}

	public String getVhNo() {
		return vhNo;
	}

	public void setVhNo(String vhNo) {
		this.vhNo = vhNo;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	@Override
	public String toString() {
		return "Ford [vhNo=" + vhNo + ", vehType=" + vehType + "]";
	}

	
}
