package tasks01;

public class Task3 {
	
	static final double scale = Math.pow(10.0, 3.0);
	
	public static double findInsideSquare(double outsideSquare) {
		
		double insideDiag = Math.round(Math.sqrt(Math.abs(outsideSquare)) * scale) / scale;
		
		return Math.round(Math.pow(insideDiag, 2.0) / 2.0 * scale) / scale;
		
	}
	
	public static double getAttitude(double outsideSquare, double insideSquare) {
		
		return Math.round(outsideSquare / insideSquare * scale) / scale;
	}
}
