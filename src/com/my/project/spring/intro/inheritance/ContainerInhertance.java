package com.my.project.spring.intro.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.project.spring.intro.pojos.BeanA;
import com.my.project.spring.intro.pojos.BeanB;

public class ContainerInhertance {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextInheritance.xml");
		BeanA beanA = (BeanA)context.getBean("baseBean");
		System.out.println(beanA);
		beanA = (BeanA)context.getBean("extendedBean");
		System.out.println(beanA);
		BeanB beanB = (BeanB)context.getBean("beanB");
		System.out.println(beanB);
	}

}
