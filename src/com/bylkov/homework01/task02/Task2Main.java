package com.bylkov.homework01.task02;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task2Main {
	
	public static void main(String[] args) {
		
		int year;
		int month;
		int days;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Year: ");
			year = scanner.nextInt();
			System.out.println("Month: ");
			month = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		if (month < 1 || month > 12 || year < 1) {
			System.out.println("Wrong input");
			return;
		}
		
		days = Task2.getDays(year, month);
		System.out.println("Days: " + days);
		
	}
}
