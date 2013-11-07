package com.my.project.spring.intro;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerForPOJOWithProps {
	
	public static void main(String[] args) {
		
		/* manual DI*/
		Properties properties = new Properties();
		properties.put("name1", "nripendra");
		properties.put("name2", "thakur");
		POJOWithProperty pojoWithProperty = new POJOWithProperty();
		pojoWithProperty.setProperties(properties);
		System.out.println(pojoWithProperty);
		
		/* DI through spring IoC container*/
		ApplicationContext context = new ClassPathXmlApplicationContext("contextProperties.xml");
		pojoWithProperty = (POJOWithProperty)context.getBean("POJOWithProperty");
		System.out.println(pojoWithProperty);
	}

}
