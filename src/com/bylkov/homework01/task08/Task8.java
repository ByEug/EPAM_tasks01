package com.bylkov.homework01.task08;

import com.bylkov.homework01.task03.Task3;


public class Task8 {
	
	private static double moreThan3(double x) {
		return Math.round((9 + 3 * x - Math.pow(x, 2.0)) * Task3.SCALE) / Task3.SCALE;
	}
	
	private static double lessThan3(double x) {
		return Math.round((1 / (Math.pow(x, 3.0) - 6)) * Task3.SCALE) / Task3.SCALE;
	}
	
	public static double function(double x) {
		return (x >= 3) ? moreThan3(x) : lessThan3(x);
	}
}
