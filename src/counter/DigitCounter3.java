package counter;

import java.util.Scanner;

public class DigitCounter3 {

	public static void main(String[] args) {
		
		int d = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (d != -1){
			
			
		System.out.print("Enter your Number: ");
		d = input.nextInt();
		
		String intd = "" + d;

		int size = intd.length();
		
		System.out.println("Number of digits in " + intd + " is " + size + "\n");

		}
		if (d == -1) {
			System.out.println("The program is terminated");
		}
	}
}