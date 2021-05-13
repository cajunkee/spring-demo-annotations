package com.kee.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoftballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice pitching for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
