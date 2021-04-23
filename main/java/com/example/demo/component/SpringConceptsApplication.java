package com.example.demo.component;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("welcome to Spring concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class,args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("DemoBean ="+demoBean.toString());
	}
}
