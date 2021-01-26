package tasks01;

public class Task2 {
	
	public static int getDays(int year, int month) {
		
		if (month == 2) {
			return year % 4 == 0 ? 29 : 28; 
		}
		
		return month >= 8 ? 31 - month % 2 : 30 + month % 2;
	}
}
