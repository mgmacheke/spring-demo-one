package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach = theContext.getBean("myCoach", Coach.class);
		
		// call the method of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call the fortuneService method
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		theContext.close();

	}

}
