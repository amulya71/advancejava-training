package com.dl.properties;

import java.util.Properties;

public class Honda {

	// properties
	private Properties Models;

	// setters and getters
	public Properties getModels() {
		return Models;
	}

	public void setModels(Properties models) {
		Models = models;
	}

	// to String
	@Override
	public String toString() {
		return "Honda [Models=" + Models + "]";
	}

}
