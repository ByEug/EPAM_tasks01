package tasks01;

public class Task8 {
	
	private static double moreThan3(double x) {
		return Math.round((9 + 3 * x - Math.pow(x, 2.0)) * Task3.scale) / Task3.scale;
	}
	
	private static double lessThan3(double x) {
		return Math.round((1 / (Math.pow(x, 3.0) - 6)) * Task3.scale) / Task3.scale;
	}
	
	public static double function(double x) {
		
		return x >= 3 ? moreThan3(x) : lessThan3(x);
	}
}
