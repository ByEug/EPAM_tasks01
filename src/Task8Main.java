import java.util.InputMismatchException;
import java.util.Scanner;

import static tasks01.Task8.*;

public class Task8Main {

	public static void main(String[] args) {
		
		double x;
		
		try (Scanner scanner = new Scanner(System.in)) {
			x = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		System.out.println(function(x));
	}
}
