package com.arng.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It" + this.fortuneService.getFortune();
	}
	
	//add init method
	public void doStartupStuff() {
		System.out.println("TrackCoach: inside method doStartupStuff");
	}
	
	//add destroy method
	public void doCleanupStuff() {
		System.out.println("TrackCoach: inside method doCleanupStuff");
	}

}
