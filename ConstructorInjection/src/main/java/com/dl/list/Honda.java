package com.dl.list;

import java.util.List;

public class Honda {
	private String vechicalName;
	private List<String> Models;

	public Honda() {
	}

	public Honda(String vechicalName, List<String> models) {
		this.vechicalName = vechicalName;
		Models = models;
	}

	@Override
	public String toString() {
		return "Honda [vechicalName=" + vechicalName + ", Models=" + Models + "]";
	}

}
