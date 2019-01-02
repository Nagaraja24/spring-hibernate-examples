package com.arng.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// Load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are same
		boolean result = (theCoach == alphaCoach);

		System.out.println("Are two beans same : " + result);

		System.out.println("\nMemory location of theCoach : " + theCoach);
		System.out.println("\nMemory location of alphaCoach : " + alphaCoach);

		System.out.println(theCoach.hashCode());
		System.out.println(alphaCoach.hashCode());
		
		context.close();

	}

}
