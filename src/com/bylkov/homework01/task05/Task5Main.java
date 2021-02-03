package com.bylkov.homework01.task05;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task5Main {

	public static void main(String[] args) {
		int number;
		
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		System.out.println(Task5.isItPerfect(Math.abs(number)));
	}
}
