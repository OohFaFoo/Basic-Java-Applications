package test;
import java.util.Scanner;
import java.io.*;

public class fileScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Scanner output = new Scanner(System.in);
		Scanner scanner = new Scanner(new File("fileScanner.txt"));
		String fileScanner = scanner.next();

		if (output.equals(fileScanner)) {
			
			System.out.println("The scanner found " + output + "in fileScanner.txt");
			
		} else {
			
			System.out.println("The scanner did not find " + output + "in fileScanner.txt");
			
		}
		
	}

}
