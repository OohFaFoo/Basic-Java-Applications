package test;
import java.util.Scanner;
import static java.lang.System.*;

public class calculatorConsole {
	
		@SuppressWarnings({ "resource" })
		public static void main(String args[]) {
		
			out.println("Please select an operation from the list:");
			out.println("- power");
			out.println("- sqrt");
			out.println("- add");
			out.println("- subtract");
			out.println("- times");
			out.println("- divide");
			out.println("- terminate");
			
			String power = "power";
			String sqrt = "sqrt";
			String add = "add";
			String subtract = "subtract";
			String times = "times";
			String divide = "divide";
			String terminate = "terminate";
			
			int loop = 0;
			int incorrectInputTester = 0;
			
			while (loop != 1) {
				
				Scanner input = new Scanner(in);
				String output = input.next();
				
				if (output.equals(power)) {
					out.println("Please enter a number then a number to power it: ");
					incorrectInputTester = 1;
					
					int powerInput1 = input.nextInt();
					int powerInput2 = input.nextInt();
					
					out.println((powerInput1) + " ^ " + (powerInput2) + " = " + Math.pow(powerInput1, powerInput2));
					
				}
				
				if (output.equals(sqrt)) {
					out.print("Please enter a number to square root: ");
					incorrectInputTester = 1;
							
						int sqrtInput = input.nextInt();
						
						if (sqrtInput < 0) {
							out.println("You are a silly person, you cannot use anything below zero");
						
						} else {
						
							out.printf("The square root of " + sqrtInput + " = %5.5f\n", Math.sqrt(sqrtInput));
						
						}
				}
				
					if (output.equals(add)) {
					out.println("Please enter two numbers to add: ");
					incorrectInputTester = 1;
					
						int addInput1 = input.nextInt();
						int addInput2 = input.nextInt();
					
							out.println((addInput1) + " + " + (addInput2) + " = " + (addInput1 + addInput2));
					
				}
					
					if (output.equals(subtract)) {
						out.println("Please enter two numbers to subtract: ");
						incorrectInputTester = 1;
						
							int subtractInput1 = input.nextInt();
							int subtractInput2 = input.nextInt();
						
								out.println((subtractInput1) + " - " + (subtractInput2) + " = " + (subtractInput1 - subtractInput2));
						
					}
					
						if (output.equals(times)) {
							out.println("Please enter two numbers to times: ");
							incorrectInputTester = 1;
							
								int timesInput1 = input.nextInt();
								int timesInput2 = input.nextInt();
								
									out.println((timesInput1) + " * " + (timesInput2) + " = " + (timesInput1 * timesInput2));
							
						}
						
							if (output.equals(divide)) {
								out.println("Please enter two numbers to divide: ");
								incorrectInputTester = 1;
								
									int divideInput1 = input.nextInt();
									int divideInput2 = input.nextInt();
										
										if (divideInput2 == 0) {
											out.println("You are a silly person, you cannot use 0");
										} else {
									
										out.println((divideInput1) + " / " + (divideInput2) + " = " + (divideInput1 / divideInput2));
										}	
										
											
							}
							
								if (output.equals(terminate)) {
									incorrectInputTester = 1;
									
									out.println();
									out.println("##################");
									out.println("PROGRAM TERMINATED");
									out.println("##################");
									
										loop++;
									
								}
									
								if (incorrectInputTester != 1) {
									out.println("Incorrect input");
									incorrectInputTester = 0;
								}
									if (loop != 1) {
										out.println();
										out.println("Please choose another operation");
										
									}
								
		}
	}
}
