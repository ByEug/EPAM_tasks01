import java.util.InputMismatchException;
import java.util.Scanner;

import static tasks01.Task2.*;

public class Task2Main {
	
	public static void main(String[] args) {
		
		int year;
		int month;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Year: ");
			year = scanner.nextInt();
			System.out.println("Month: ");
			month = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		if (month < 1 || month > 12 || year < 1) {
			System.out.println("Wrong input");
			return;
		}
		
		System.out.println("Days: " + getDays(year, month));
		
	}
}
