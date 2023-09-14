package com.dl.objectreference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/objectreference/applicationContext.xml");
		Honda h = context.getBean("honda", Honda.class);
		System.out.println(h);
		System.out.println(h.getModels());
		context.close();
	}

}
