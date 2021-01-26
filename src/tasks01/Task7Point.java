package tasks01;

public class Task7Point {
	
	private double x;
	private double y;
	private double length;
	
	private static final double scale = Math.pow(10.0, 3.0);
	
	private double countLine() {
		return Math.round(Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0)) * scale) / scale;
	}
	
	public Task7Point(double x, double y) {
		this.x = x;
		this.y = y;
		length = countLine();
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getLength() {
		return length;
	}
}
