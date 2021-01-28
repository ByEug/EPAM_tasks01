package com.bylkov.homework01.task07;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task7Main {
	
	public static void main(String[] args) {
		double x1, y1, x2, y2;
		double eps = 0.001;
		
		try (Scanner scanner = new Scanner(System.in)) {
			x1 = scanner.nextDouble();
			y1 = scanner.nextDouble();
			x2 = scanner.nextDouble();
			y2 = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		Task7Point firstPoint = new Task7Point(x1, y1);
		Task7Point secondPoint = new Task7Point(x2, y2);
		
		if (Math.abs(firstPoint.getLength() - secondPoint.getLength()) < eps) {
			System.out.println("Points have the same distance to (0,0)");
		}
		else {
			System.out.println(firstPoint.getLength() - 
							   secondPoint.getLength() > 0 ? "2nd is closer" : "1st is closer");
		}
	}
}
