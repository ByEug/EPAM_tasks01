import java.util.InputMismatchException;
import java.util.Scanner;
import tasks01.Task6TimeDelimiter;

public class Task6Main {

	public static void main(String[] args) {
		
		int number;
		
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input");
			return;
		}
		
		Task6TimeDelimiter delimiter = new Task6TimeDelimiter(number);
		
		System.out.println(delimiter.getHours() + " h " + 
						   delimiter.getMinutes() + " m " + 
						   delimiter.getSeconds() + " s ");
	}
}
