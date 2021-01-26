import java.util.InputMismatchException;
import java.util.Scanner;
import tasks01.Task9Circle;

public class Task9Main {
	
	public static void main(String[] args) {
		
		double radius;
		
		try (Scanner scanner = new Scanner(System.in)) {
			radius = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		Task9Circle circle = new Task9Circle(radius);
		
		System.out.println("Circle length: " + circle.countLength());
		System.out.println("Circle area: " + circle.countArea());
	}
}
