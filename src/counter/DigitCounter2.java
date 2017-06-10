/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package counter;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class DigitCounter2 { //class name based on end goal

	public static void main(String[] args) {
		
		int d = 0; //declaring and initialising d variable
		
		//Declaring and creating instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		//Output to welcome user and show how to exit
		System.out.println("Welcome to Counter!\nThis program will count the number of digits in any integer you enter.");
		System.out.println("Enter -1 to exit");
		
		//Creating while loop 
		while (d != -1){
			
			System.out.print("\nEnter your Number: ");
			d = input.nextInt();
			
			//Creating if statement if -1 is entered to exit program
			if (d == -1) {
				System.out.println("The program is terminated...");
				
			}
			
			//Else statement to convert integer to string and then count characters using .length and print in console
			else {
				String intd = "" + d;
				
				int size = intd.length();
			
				System.out.println("Number of digits in " + intd + " is " + size + "\n");
			}
			
			
		}
		
		input.close(); //Close input to avoid possible leak
	}
	
}
