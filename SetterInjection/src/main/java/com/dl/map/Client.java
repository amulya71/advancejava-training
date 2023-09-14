package com.dl.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dl/map/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id");
		System.out.println(honda.getVechicalno());
		System.out.println(honda.getModels());
		context.close();

	}

}
