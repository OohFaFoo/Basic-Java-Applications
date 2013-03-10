package test;
import java.util.Scanner;


public class fractions {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		System.out.println("Please enter a number to select one of the following: ");
		System.out.println("1 - Mixed fractions");
		System.out.println("2 - Top heavy fractions");
		System.out.println("3 - Ordinary fractions");
		
		Scanner output = new Scanner(System.in);
		
			int loop = 0;
			
			while (loop == 0) {
			int input = output.nextInt();	
			int MixedFracLoop = 0;
			int TopHeavyFracLoop = 0;
			int Frac = 0;
			
				if (input == 1) {
					
					System.out.println("Please enter the first number");
					int MixedFrac_Times = output.nextInt();
					System.out.println("Please enter the numerator");
					int MixedFrac_Numerator = output.nextInt();
					System.out.println("Please enter the denominator");
					int MixedFrac_Denominator = output.nextInt();
					
					System.out.println("Your fraction should look like this:");
					System.out.println(MixedFrac_Times + " " + MixedFrac_Numerator + "/" + MixedFrac_Denominator);
					System.out.println("");
					
					System.out.println("Is there a second number? y/n");
					String MixedFrac_Option = output.next();
					if (MixedFrac_Option.equals("y")) {
						
					System.out.println("Please enter the second mixed fraction: ");
					
					System.out.println("Please enter the first number");
					int MixedFrac_Times2 = output.nextInt();
					System.out.println("Please enter the numerator");
					int MixedFrac_Numerator2 = output.nextInt();
					System.out.println("Please enter the denominator");
					int MixedFrac_Denominator2 = output.nextInt();
					
					System.out.println("Your fraction should look like this:");
					System.out.println(MixedFrac_Times2 + " " + MixedFrac_Numerator2 + "/" + MixedFrac_Denominator2);
					
					System.out.println("");
					
					} else {
					
					while (MixedFracLoop == 0) {
					
						System.out.println("Please select the operation you wish to use:");
						System.out.println("1 - Times");
						System.out.println("2 - Divide");
						System.out.println("3 - Add");
						System.out.println("4 - Subtract");
						
						int MixedFracInput = output.nextInt();
					
							if (MixedFracInput == 1) {
							
								MixedFracLoop++;
								
							
							}
						
							if (MixedFracInput == 2) {
							
								MixedFracLoop++;
							
							}
							
							if (MixedFracInput == 3) {
							
								MixedFracLoop++;
							
							}
						
							if (MixedFracInput == 4) {
							
								MixedFracLoop++;
							
							}		
					}
			}		
					
					
			}
			
				if (input == 2) {
				
					
				
			}
			
				if (input == 3) {
				
					
				
			}
			
		}
		
	}
}