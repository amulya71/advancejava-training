package com.dl.scopes.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/scopes/prototype/applicationContext.xml");
		
		Honda b1 = (Honda) context.getBean("id");
		System.out.println(b1);
		System.out.println(b1.hashCode());
		
		Honda b2 = (Honda) context.getBean("id");
		System.out.println(b2);
		System.out.println(b2.hashCode());
		
		context.close();
	}

}
