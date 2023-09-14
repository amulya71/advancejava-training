package com.dl.autowiring.constructor;

public class Honda {
	private Models models;
	
	public Honda(Models models) {
		this.models = models;
	}

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
