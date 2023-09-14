package com.dl.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dl/properties/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id");
		System.out.println(honda);
		System.out.println(honda.getModels());
		context.close();
	}

}
