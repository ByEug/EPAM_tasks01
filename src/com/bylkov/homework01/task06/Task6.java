package com.bylkov.homework01.task06;

public class Task6 {

	private static final int SEC_IN_MIN = 60; 
	private static final int SEC_IN_HOUR = 3600;
	
	public static int getHours(int number) {
		return (number  - number % SEC_IN_HOUR) / SEC_IN_HOUR;
	}
	
	public static int getMinutes(int number, int hours) {
		number -= hours * SEC_IN_HOUR;
		return (number  - number % SEC_IN_MIN) / SEC_IN_MIN;
	}
	
	public static int getSeconds(int number, int hours, int minutes) {
		number -= hours * SEC_IN_HOUR;
		number -= minutes * SEC_IN_MIN;
		return number;
	}
}
