package com.my.project.spring.intro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerForPOJOWithList {
	
	public static void main(String[] args) {
		
		//mannual dependency injection
		POJOWithList list = new POJOWithList();
		List<String> names = new ArrayList<String>();
		names.add("nripendra");
		names.add("thakur");
		list.setNames(names);
		System.out.println(list);
		
		//using spring IoC container 
		ApplicationContext context = new ClassPathXmlApplicationContext("contextList.xml");
		POJOWithList list1 = (POJOWithList)context.getBean("pojoWithList");
		System.out.println(list1);
	}

}
