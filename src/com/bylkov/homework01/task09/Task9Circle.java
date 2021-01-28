package com.bylkov.homework01.task09;

import com.bylkov.homework01.task03.Task3;


public class Task9Circle {

	private double radius;
	
	public Task9Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double countLength() {
		return Math.round(radius * Math.PI * 2 * Task3.SCALE) / Task3.SCALE;
	}
	
	public double countArea() {
		return Math.round(Math.PI * Math.pow(radius, 2.0) * Task3.SCALE) / Task3.SCALE;
	}
}
