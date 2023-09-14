package com.dl.scopes.prototype;

public class Honda {

	// properties
	private int vechicalNo;
	private String vechicalName;

	// default constructor
	public Honda() {
	}

	// setters and getters
	public int getVechicalNo() {
		return vechicalNo;
	}

	public void setVechicalNo(int vechicalNo) {
		this.vechicalNo = vechicalNo;
	}

	public String getVechicalName() {
		return vechicalName;
	}

	public void setVechicalName(String vechicalName) {
		this.vechicalName = vechicalName;
	}

	// constructor using fields
	public Honda(int vechicalNo, String vechicalName) {
		super();
		this.vechicalNo = vechicalNo;
		this.vechicalName = vechicalName;
	}

	// toString
	@Override
	public String toString() {
		return "Honda [vechicalNo=" + vechicalNo + ", vechicalName=" + vechicalName + "]";
	}

}
