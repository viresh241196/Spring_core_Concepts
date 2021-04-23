package com.example.demo.component;

import org.springframework.context.ApplicationContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concept Demo");
		System.out.println("welcome to Spring concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class,args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("DemoBean ="+demoBean.toString());
	}
}
