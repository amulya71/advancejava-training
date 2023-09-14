package com.dl.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/list/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id1");
		System.out.println(honda.getVechicalName());
		System.out.println(honda.getVechicalNumber());
		System.out.println(honda.getVechicalModels());
		context.close();
	}
}
