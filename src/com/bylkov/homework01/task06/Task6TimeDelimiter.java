package com.bylkov.homework01.task06;

public class Task6TimeDelimiter {
	
	private static final int SEC_IN_MIN = 60; 
	private static final int SEC_IN_HOUR = 3600;
	
	private int currentSec;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	private int countHours(int num) {
		return (num  - num % SEC_IN_HOUR) / SEC_IN_HOUR;
	}
	
	private int countMinutes(int num) {
		return (num  - num % SEC_IN_MIN) / SEC_IN_MIN;
	}
	
	public Task6TimeDelimiter(int number) {
		currentSec = number;
		hours = countHours(currentSec);
		minutes = countMinutes(currentSec - hours * SEC_IN_HOUR);
		seconds = currentSec - hours * SEC_IN_HOUR - minutes * SEC_IN_MIN;
	}

	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
}
