package com.springdeveloper.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
@Configuration
public class BootApp implements CommandLineRunner {

    @Autowired
    String data;

	@Value("${spring.test.data}")
	String test;

	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("*** at run: " + test);
        System.out.println("*** data: " + data);
    }

	@Bean
	public String stringBean() {
		System.out.println("*** at bean: " + test);
		return new String("Bean: " + test);
	}
}
