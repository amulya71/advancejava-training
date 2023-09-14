package com.dl.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/dependencycheck/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id");
		System.out.println(honda.getVechicalName());
		System.out.println(honda.getVechicalNumber());
		System.out.println(honda.getVechicalModels());
		context.close();
	}
}
