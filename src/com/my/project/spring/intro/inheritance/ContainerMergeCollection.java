package com.my.project.spring.intro.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.project.spring.intro.pojos.POJOWithList;

public class ContainerMergeCollection {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextCollectionMerge.xml");
		POJOWithList list = (POJOWithList)context.getBean("extendedList");
		System.out.println(list);
	}

}
