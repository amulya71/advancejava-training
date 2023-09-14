package com.dl.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/set/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id");
		System.out.println(honda.getVechicalName());
		System.out.println(honda.getVechicalModels());
		context.close();
	}

}
