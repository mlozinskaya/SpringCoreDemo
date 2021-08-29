package com.example.SpringCoreDemo;

import com.example.SpringCoreDemo.exampleClasses.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		// with xml
		// ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// with java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpringCore.class);

		Computer computer = context.getBean("computer", Computer.class);

		try {
			computer.readMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}

		computer.updateUI();

	}

}
