package com.dl.autowiring.constructor;

public class Models {

	// properties
	private int vechicalNo;
	private String vechialName;
	
	public Models() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor using fields
	public Models(int vechicalNo, String vechialName) {
		this.vechicalNo = vechicalNo;
		this.vechialName = vechialName;
	}

	// getters and setters
	public int getVechicalNo() {
		return vechicalNo;
	}

	public void setVechicalNo(int vechicalNo) {
		this.vechicalNo = vechicalNo;
	}

	public String getVechialName() {
		return vechialName;
	}

	public void setVechialName(String vechialName) {
		this.vechialName = vechialName;
	}

	// toString
	@Override
	public String toString() {
		return "Models [vechicalNo=" + vechicalNo + ", vechialName=" + vechialName + "]";
	}

}
