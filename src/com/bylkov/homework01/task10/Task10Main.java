package com.bylkov.homework01.task10;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.bylkov.homework01.task10.Task10.*;


public class Task10Main {

	public static void main(String[] args) {
		double a, b, h;
		double[][] resultArray;
		
		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			h = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		resultArray = drawTable(a, b, h);
		
		System.out.println(String.format("| %16s | %16s |", "x", "f(x)"));
		
		for (int i = 0; i < resultArray[1].length; i++) {
			System.out.println(String.format("| %16f | %16f |", resultArray[0][i], resultArray[1][i]));
		}
		
	}
}
