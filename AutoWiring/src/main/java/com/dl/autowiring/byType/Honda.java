package com.dl.autowiring.byType;

public class Honda {
	private Models models;

	// setters and getters
	public Models getModels() {
		return models;
	}

	public void setModels(Models models) {
		this.models = models;
	}

	// toString
	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}

}
