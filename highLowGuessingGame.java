package test;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class highLowGuessingGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(in);
		
		int number = random.nextInt(10);
		int guess = -1; // Makes the loop permanent - until the int has been changed
		
		while (guess != number) {
			
			// Prints this whenever the guess is incorrect
			out.print("Guess an integer between 1 and 10: ");
			
			// Allows whatever number you input to be stored in 'guess' as a new integer
			guess = input.nextInt();
			
			if (guess < number) {
				out.println("Too low, please try again");
				
				// Use of else if statement, for a third option
			} else if (guess > number) {
				out.println("Too high, please try again");
				
			} else {
				out.println("Correct! The number was " + number);
			}
		}	
	}
}
