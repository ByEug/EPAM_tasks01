package com.bylkov.homework01.task08;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task8Main {

	public static void main(String[] args) {
		double x;
		double result;
		
		try (Scanner scanner = new Scanner(System.in)) {
			x = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		result = Task8.function(x);
		System.out.println(result);
	}
}
