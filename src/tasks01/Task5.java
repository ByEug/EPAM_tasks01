package tasks01;

public class Task5 {

	public static boolean isItPerfect (int number) {
		
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			
			if (number % i == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		return number == sum;
	}
}
