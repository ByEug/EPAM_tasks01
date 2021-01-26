import java.util.InputMismatchException;
import java.util.Scanner;

import static tasks01.Task5.*;

public class Task5Main {

	public static void main(String[] args) {
		
		int number;
		
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		System.out.println(isItPerfect(Math.abs(number)));
	}
}
