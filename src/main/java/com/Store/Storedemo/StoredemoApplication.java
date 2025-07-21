package com.Store.Storedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class StoredemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StoredemoApplication.class, args);

		Build obj = context.getBean(Build.class);
		obj.play();
	}


}
