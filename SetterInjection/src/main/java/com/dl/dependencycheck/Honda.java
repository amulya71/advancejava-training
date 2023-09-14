package com.dl.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Honda {

	// properties
	private int vechicalNumber;
	private String vechicalName;
	private List<String> vechicalModels;

	public int getVechicalNumber() {
		return vechicalNumber;
	}

	@Required
	public void setVechicalNumber(int vechicalNumber) {
		this.vechicalNumber = vechicalNumber;
	}

	public String getVechicalName() {
		return vechicalName;
	}

	@Required
	public void setVechicalName(String vechicalName) {
		this.vechicalName = vechicalName;
	}

	public List<String> getVechicalModels() {
		return vechicalModels;
	}

	@Required
	public void setVechicalModels(List<String> vechicalModels) {
		this.vechicalModels = vechicalModels;
	}

}
