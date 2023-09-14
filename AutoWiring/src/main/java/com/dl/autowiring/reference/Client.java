package com.dl.autowiring.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/autowiring/reference/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id");
		System.out.println(honda);
		context.close();
	}

}
