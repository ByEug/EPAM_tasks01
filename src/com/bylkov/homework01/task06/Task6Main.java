package com.bylkov.homework01.task06;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task6Main {

	public static void main(String[] args) {
		int number;
		int hours, minutes, seconds;
		
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		hours = Task6.getHours(number);
		minutes = Task6.getMinutes(number, hours);
		seconds = Task6.getSeconds(number, hours, minutes);
		
		System.out.println(hours + " h " + 
						   minutes + " m " + 
						   seconds + " s ");
	}
}
