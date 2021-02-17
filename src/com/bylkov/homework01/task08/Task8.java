package com.bylkov.homework01.task08;

import com.bylkov.homework01.task03.Task3;


public class Task8 {
	
	private static double moreThan3(double x) {
		double functionResult = 9 + 3 * x - Math.pow(x, 2.0);
		return Math.round(functionResult * Task3.SCALE) / Task3.SCALE;
	}
	
	private static double lessThan3(double x) {
		double functionResult = 1 / (Math.pow(x, 3.0) - 6);
		return Math.round(functionResult * Task3.SCALE) / Task3.SCALE;
	}
	
	public static double function(double x) {
		return (x >= 3) ? moreThan3(x) : lessThan3(x);
	}
}
