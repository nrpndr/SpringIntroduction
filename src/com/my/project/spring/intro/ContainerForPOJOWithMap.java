package com.my.project.spring.intro;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring will also preserve the order of the map entries by using java.util.LinkedHashMap.
 * @author ivy4293
 *
 */
public class ContainerForPOJOWithMap {
	
	public static void main(String[] args) {
		//manual dependency injection
		Map<String, String> names = new HashMap<String, String>();
		names.put("name1", "nripendra");
		names.put("name2", "thakur");
		POJOWithMap pojoWithMap = new POJOWithMap();
		pojoWithMap.setNames(names);
		System.out.println(pojoWithMap);
		
		//Using Spring IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("contextMap.xml");
		pojoWithMap = (POJOWithMap)context.getBean("POJOWithMap");
		System.out.println(pojoWithMap);
	}

}
