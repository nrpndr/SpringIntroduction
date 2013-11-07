package com.my.project.spring.intro;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerForPOJOWithMap {
	
	public static void main(String[] args) {
		//manual dependency injection
		Map<String, String> names = new HashMap<String, String>();
		names.put("name1", "nripendra");
		names.put("name2", "thakur");
		POJOWithMap pojoWithMap = new POJOWithMap();
		pojoWithMap.setNames(names);
		System.out.println(pojoWithMap);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contextMap.xml");
		pojoWithMap = (POJOWithMap)context.getBean("POJOWithMap");
		System.out.println(pojoWithMap);
	}

}
