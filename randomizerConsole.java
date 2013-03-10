package test;

import java.util.Random;
import java.util.Scanner;

public class randomizerConsole {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {

		// Starter print
		System.out.print("Please choose a number between 1 and 10: ");		
		
		// Making a new scanner, scans for inputs
		Scanner keyboard = new Scanner(System.in);
		
		// New integer for the input that "keyboard" scans for
		int inputNumber = keyboard.nextInt();
		
		// New integer which scans the next integer, with a maximum integer of 10
		int RandomNumber = new Random().nextInt(10) + 1;
		
			// If the input number that is typed in equals the randomly generated
			// number, print...
			if (inputNumber == RandomNumber) {
					
					System.out.println();
					System.out.println("You have guessed the correct number.");
	
	// Otherwise, just print...				
	} else {
		
		System.out.println();
		System.out.println("You suck at guessing.");
		System.out.println("The correct number was " + RandomNumber);
			
			}
		}
	}
