package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capg")
public class FeedbackCommonFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackCommonFrontendApplication.class, args);
	}
}
