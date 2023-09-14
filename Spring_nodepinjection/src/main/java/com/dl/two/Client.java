package com.dl.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Brand b1 = context.getBean("id1", Brand.class);
		Brand b2 = context.getBean("id2", Brand.class);
		
		System.out.println(b1.Honda());
		System.out.println(b2.Honda());
		
		context.close();
	}

}
