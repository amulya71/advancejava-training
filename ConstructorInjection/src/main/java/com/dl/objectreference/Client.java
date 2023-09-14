package com.dl.objectreference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/objectreference/applicationContext.xml");
		Honda bean = (Honda) context.getBean("id");
		System.out.println(bean);
		context.close();
	}
}
