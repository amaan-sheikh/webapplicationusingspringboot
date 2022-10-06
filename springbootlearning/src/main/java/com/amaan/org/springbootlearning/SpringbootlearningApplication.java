package com.amaan.org.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootlearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootlearningApplication.class, args);
		
		TestDemo demo = new TestDemo();
		System.out.println(demo.hello());
	}

}
