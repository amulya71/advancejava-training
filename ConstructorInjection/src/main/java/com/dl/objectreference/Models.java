package com.dl.objectreference;

public class Models {
	private int serailNo;
	private String sName;
	private String vechicalName;
	private String vechicalType;
	
	public Models() {
	}
	
	public Models(int serailNo, String sName, String vechicalName, String vechicalType) {
		this.serailNo = serailNo;
		this.sName = sName;
		this.vechicalName = vechicalName;
		this.vechicalType = vechicalType;
	}

	@Override
	public String toString() {
		return "Models [serailNo=" + serailNo + ", sName=" + sName + ", vechicalName=" + vechicalName
				+ ", vechicalType=" + vechicalType + "]";
	}

	

}
