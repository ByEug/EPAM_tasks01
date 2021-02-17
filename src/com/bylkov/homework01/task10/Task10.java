package com.bylkov.homework01.task10;

import com.bylkov.homework01.task03.Task3;


public class Task10 {

	public static double[][] getTable(double a, double b, double h) {
		double currentX = a;
		int amountOfX = (int) Math.floor((b - a) / h);
		double[][] resultArray = new double[2][amountOfX + 1];
		
		int counter = 0;
		while (currentX <= b) {
			resultArray[0][counter] = currentX;
			resultArray[1][counter] = Math.tan(currentX);
			currentX = Math.round((currentX + h) * Task3.SCALE) / Task3.SCALE;
			counter++;
		}
		
		return resultArray;
	}
}
