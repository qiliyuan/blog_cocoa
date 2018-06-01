package com.qly.cocoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		System.out.println("Cocoa开始启动Spring boot");
		SpringApplication.run(App.class, args);
		System.out.println("Cocoa启动完毕");
	}
}
