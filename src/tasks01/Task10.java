package tasks01;

public class Task10 {

	private static double function(double x) {
		return Math.tan(x);
	}
	
	public static void drawTable(double a, double b, double h) {
		
		double currentX = a;
		
		System.out.println(String.format("| %16s | %16s |", "x", "f(x)"));
		
		while (currentX <= b) {
			
			System.out.println(String.format("| %16f | %16f |", currentX, function(currentX)));
			
			currentX = Math.round((currentX + h) * Task3.scale) / Task3.scale;
		}
	}
}
