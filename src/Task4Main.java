import java.util.InputMismatchException;
import java.util.Scanner;

import static tasks01.Task4.*;

public class Task4Main {
	
	public static void main(String[] args) {
		
		int a, b, c, d;
		
		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			d = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		int[] array = {a, b, c, d};
		
		System.out.println(checkParity(array));
	}
}
