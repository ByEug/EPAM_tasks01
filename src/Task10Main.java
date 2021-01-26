import java.util.InputMismatchException;
import java.util.Scanner;

import static tasks01.Task10.*;

public class Task10Main {

	public static void main(String[] args) {
		
		double a, b, h;
		
		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			h = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		drawTable(a, b, h);
	}
}
