package com.dl.map;

import java.util.Map;

public class Honda {
	private String vechicalName;
	private Map<Integer, String> models;

	public Honda() {
	}

	public Honda(String vechicalName, Map<Integer, String> models) {
		this.vechicalName = vechicalName;
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [vechicalName=" + vechicalName + ", models=" + models + "]";
	}

}
