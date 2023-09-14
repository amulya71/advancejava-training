package com.dl.innerbean.ref.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/innerbean/ref/injection/context.xml");
        FordCars fordCars = context.getBean("fordCars", FordCars.class);
        System.out.println(fordCars);
        context.close();
    }
}
