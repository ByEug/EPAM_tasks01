package com.bylkov.homework01.task10;

import com.bylkov.homework01.task03.Task3;


public class Task10 {

	public static void drawTable(double a, double b, double h) {
		double currentX = a;
		System.out.println(String.format("| %16s | %16s |", "x", "f(x)"));
		
		while (currentX <= b) {
			System.out.println(String.format("| %16f | %16f |", currentX, Math.tan(currentX)));
			currentX = Math.round((currentX + h) * Task3.SCALE) / Task3.SCALE;
		}
	}
}
