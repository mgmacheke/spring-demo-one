package com.code.springdemo;

public class BaseBallCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneServie;
	
	// define a constructor for the dependency injection
	public BaseBallCoach(FortuneService fortuneServie){
		this.fortuneServie = fortuneServie;
	}
	
	@Override
	public String getDailyWorkout(){
		return "practice betting 10 times a day";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get the fortune
		return fortuneServie.getFortune();
	}

}
