package com.bylkov.homework01.task04;

public class Task4 {
	
	public static boolean checkParity(int[] numbers) {
		int counter = 0;
		
		for (int number : numbers) {
			counter += number % 2;
		}
		
		return (counter <= 2) ? true : false;
	}
	
}
