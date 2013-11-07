package com.my.project.spring.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Init the spring container
 * @author ivy4293
 *
 */
public class Container {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		/*Manual dependency injection*/
		SequenceGenerator generator = new SequenceGenerator("nripendra", "thakur", 10);
		System.out.println("======================");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		/* Using the c schema for constructor injection as attributes */
		generator = (SequenceGenerator)context.getBean("sequenceGenerator1");
		System.out.println("======================");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		/* Using constructor-arg for constructor injection */
		generator = (SequenceGenerator)context.getBean("sequenceGenerator2");
		System.out.println("======================");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		/* Using index wise constructor injection */
		generator = (SequenceGenerator)context.getBean("sequenceGenerator3");
		System.out.println("======================");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		/* using p schema to define bean properties as attributes */
		generator = (SequenceGenerator)context.getBean("sequenceGenerator4");
		System.out.println("======================");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		/* setter injection to the bean */
		generator = (SequenceGenerator)context.getBean("sequenceGenerator5");
		System.out.println("======================");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
	}
}
