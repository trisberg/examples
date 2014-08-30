package com.springdeveloper.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Value("${spring.test.data}")
	String test;

	@Bean
	public String stringBean() {
		System.out.println("*** at bean: " + test);
		return new String("Bean: " + test);
	}

}
