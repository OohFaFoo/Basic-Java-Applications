package test;
import java.util.Scanner;
import static java.lang.System.*;

public class usernamePasswordConsole {

	public static void main(String[] args) {
		
		// Begin with text to the console
		out.print("Please type your password here: ");
		
		@SuppressWarnings("resource")
		// Simple scanner
		Scanner keyboard = new Scanner(in);
		
		// String using the 'next' thing, scans for a string
		String password = keyboard.next();
		
		// If the password 'EQUALS' ...
		if (password.equals ("swordfish")) {
			
			// Print...
			out.println("You have entered the correct password");
			
			} else {
				
				// Otherwise print...
				out.println("You have entered the incorrect password");
			
				// Possible username, removed for testing purposes
		}
			
	}

}
