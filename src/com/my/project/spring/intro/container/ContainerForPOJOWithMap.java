package com.my.project.spring.intro.container;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.project.spring.intro.pojos.POJOWithMap;


/**
 * Spring will also preserve the order of the map entries by using java.util.LinkedHashMap.
 * A java.util.Properties collection is very similar to a map. It also implements the java.util.Map
 * interface and stores entries in key/value pairs. The only difference is that the keys and values of a
 * Properties collection are always strings
 * @author ivy4293
 *
 */
public class ContainerForPOJOWithMap {
	
	public static void main(String[] args) {
		//manual dependency injection
		Map<String, String> names = new HashMap<String, String>();
		names.put("name1", "nripendra");
		names.put("name2", "thakur");
		names.put(null,null);
		POJOWithMap pojoWithMap = new POJOWithMap();
		pojoWithMap.setNames(names);
		System.out.println(pojoWithMap);
		
		//Using Spring IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("contextMap.xml");
		pojoWithMap = (POJOWithMap)context.getBean("POJOWithMap");
		System.out.println(pojoWithMap);
	}

}
