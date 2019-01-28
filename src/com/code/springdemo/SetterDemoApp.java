package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
				ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve the bean from the spring container
				CricketCoach theCoach = theContext.getBean("myCricket", CricketCoach.class);
				
				// call the method of the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// call the fortuneService method
				System.out.println(theCoach.getDailyFortune());
				
				// close the context
				theContext.close();

	}

}
