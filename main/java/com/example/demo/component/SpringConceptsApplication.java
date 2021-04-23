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
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class,args);
		logger.debug("Checking Context: {}",context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
		EmployeeBean employeeBean =context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
//		DemoBean demoBean = context.getBean(DemoBean.class);
//		logger.debug("DemoBean ="+demoBean.toString());
	}
}
