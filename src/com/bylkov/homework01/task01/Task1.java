package com.bylkov.homework01.task01;

public class Task1 {
	
	public static int getLastDigit(double number) {
		Double num = number;
		String bufferNumber = num.toString();
		
		char lastDigit = bufferNumber.charAt(bufferNumber.length() - 1);
		char lastDigitForZero;
		
		if (lastDigit == '0') {
			lastDigitForZero = bufferNumber.charAt(bufferNumber.length() - 3);
			return Character.digit(lastDigitForZero, 10);
		}
		else {
			return Character.digit(lastDigit, 10);
		}
	}	
}
