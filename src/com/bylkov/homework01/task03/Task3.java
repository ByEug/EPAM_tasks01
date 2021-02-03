package com.bylkov.homework01.task03;

public class Task3 {
	
	public static final double SCALE = Math.pow(10.0, 3.0);
	
	public static double findInsideSquare(double outsideSquare) {
		return Math.round(Math.abs(outsideSquare) / 2.0 * SCALE) / SCALE;	
	}
	
	public static double getAttitude(double outsideSquare, double insideSquare) {
		return Math.round(outsideSquare / insideSquare * SCALE) / SCALE;
	}
}
