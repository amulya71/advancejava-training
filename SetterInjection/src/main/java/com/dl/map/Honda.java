package com.dl.map;

import java.util.Map;

public class Honda {
	// properties
	private int vechicalno;
	private Map<Integer, String> Models;

	// setters and getters
	public int getVechicalno() {
		return vechicalno;
	}

	public void setVechicalno(int vechicalno) {
		this.vechicalno = vechicalno;
	}

	public Map<Integer, String> getModels() {
		return Models;
	}

	public void setModels(Map<Integer, String> models) {
		Models = models;
	}

	// to String
	@Override
	public String toString() {
		return "Honda [vechicalno=" + vechicalno + ", Models=" + Models + "]";
	}

}
