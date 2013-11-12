package com.my.project.spring.intro.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.project.spring.intro.pojos.BeanA;
import com.my.project.spring.intro.pojos.BeanB;


/**
 * The idref element is simply an error-proof way to pass the id of another bean in the container (to a
 * <constructor-arg/> or <property/> element).
 * using the idref tag allows the container to
 * validate at deployment time that the referenced, named bean actually exists.
 * @author ivy4293
 *
 */
public class ContainerForIDREF {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextIDREF.xml");
		BeanA beanA = (BeanA)context.getBean("beanA");
		System.out.println(beanA);
		BeanB beanB = (BeanB)context.getBean("beanB");
		System.out.println(beanB);
	}

}
