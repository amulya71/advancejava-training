package com.dl.bean;

import java.io.Serializable;

public class Hyundai implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// properties

		private int VechicalNo = 2323;
		private String VechicalName = "Hyundai City";

		// default constructor
		public Hyundai() {

		}

		// parameterized constructor
		public Hyundai(int vechicalNo, String vechicalName) {
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
