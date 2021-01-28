package com.bylkov.homework01.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.bylkov.homework01.task01.Task1.*;


public class Task1Main {
	
	public static void main(String[] args) {
		double number = 0;
		int lastDigit;
		
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		lastDigit = getLastDigit(number);
		System.out.println(lastDigit * lastDigit % 10);
		
	}
}
