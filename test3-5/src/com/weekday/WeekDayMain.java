package com.weekday;

public class WeekDayMain {

	public static void main(String[] args) {
		
		WeekDay wd= new WeekDay();
		
		wd.input();
		String result = wd.week();
		
		wd.write(result);
		
	}
	
	
}
