package com.dl.autowiring.reference;

public class Models {

	// properties
	private int vechicalNo;
	private String vechialName;

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
