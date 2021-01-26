package tasks01;

public class Task1 {
	
	public static int getLastDigit(double number) {
		Double num = number;
		String bufferNumber = num.toString();
		
		char lastDigit = bufferNumber.charAt(bufferNumber.length() - 1);
		
		if (lastDigit == '0') {
			return Character.digit(bufferNumber.charAt(bufferNumber.length() - 3), 10);
		}
		else {
			return Character.digit(lastDigit, 10);
		}
	}
	
	public static int getSquareDigit(int number) {
		return number * number % 10;
	}
	
}
