package com.dl.innerbean.usingcons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/innerbean/usingcons/applicationContext.xml");
		Honda bean = (Honda) context.getBean("id");
		System.out.println(bean);
		context.close();
	}

}