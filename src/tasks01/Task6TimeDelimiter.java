package tasks01;

public class Task6TimeDelimiter {
	
	private int currentSec;
	
	private static final int secInMin = 60; 
	private static final int secInHour = 3600;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	private int countHours(int num) {
		return (num  - num % secInHour) / secInHour;
	}
	
	private int countMinutes(int num) {
		return (num  - num % secInMin) / secInMin;
	}
	
	public Task6TimeDelimiter(int number) {
		currentSec = number;
		hours = countHours(currentSec);
		minutes = countMinutes(currentSec - hours * secInHour);
		seconds = currentSec - hours * secInHour - minutes * secInMin;
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
