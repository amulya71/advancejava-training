package com.dl.SpringBootRestTestConnetionsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.dl")
@SpringBootApplication
public class SpringBootRestTestConnetionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestTestConnetionsApplication.class, args);
	}

}
