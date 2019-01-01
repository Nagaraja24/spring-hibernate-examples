package com.arng.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for dependency
	private FortuneService fortuneService;

	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
