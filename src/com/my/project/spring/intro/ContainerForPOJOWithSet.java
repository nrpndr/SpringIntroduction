package com.my.project.spring.intro;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Although there’s no order concept in the original set semantics, Spring preserves the order of your
 * elements by using java.util.LinkedHashSet, an implementation of the java.util.Set interface that
 * does preserve element order.
 * @author ivy4293
 *
 */
public class ContainerForPOJOWithSet {

	public static void main(String[] args) {
		//mannual dependency injection
		POJOWithSet set = new POJOWithSet();
		Set<String> names = new HashSet<String>();
		names.add("nripendra");
		names.add("thakur");
		set.setNames(names);
		System.out.println(set);
		
		//DI through Spring IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("contextSet.xml");
		set = (POJOWithSet)context.getBean("POJOWithSet");
		System.out.println(set);
	}
}
