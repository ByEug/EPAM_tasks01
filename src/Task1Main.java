import java.util.InputMismatchException;
import java.util.Scanner;
import static tasks01.Task1.*;


public class Task1Main {
	
	public static void main(String[] args) {
		
		double number;
		
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextDouble();
			System.out.println(getSquareDigit(getLastDigit(number)));
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}
		
	}
}
