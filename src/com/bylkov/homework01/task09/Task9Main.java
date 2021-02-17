package com.bylkov.homework01.task09;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task9Main {
	
	public static void main(String[] args) {
		double radius;
		double length;
		double area;
		
		try (Scanner scanner = new Scanner(System.in)) {
			radius = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		Task9Circle circle = new Task9Circle(radius);
		
		length = circle.countLength();
		area = circle.countArea();
		
		System.out.println("Circle length: " + length);
		System.out.println("Circle area: " + area);
	}
}
