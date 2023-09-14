package com.dl.set;

import java.util.Set;

public class Honda {
	private String vechicalName;
	private Set<String> Models;

	public Honda() {
	}

	public Honda(String vechicalName, Set<String> models) {
		this.vechicalName = vechicalName;
		Models = models;
	}

	@Override
	public String toString() {
		return "Honda [vechicalName=" + vechicalName + ", Models=" + Models + "]";
	}

}
