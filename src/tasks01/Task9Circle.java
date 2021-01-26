package tasks01;

public class Task9Circle {

	private double radius;
	
	public Task9Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double countLength() {
		return Math.round(radius * Math.PI * 2 * Task3.scale) / Task3.scale;
	}
	
	public double countArea() {
		return Math.round(Math.PI * Math.pow(radius, 2.0) * Task3.scale) / Task3.scale;
	}
}
