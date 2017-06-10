package counter;

import java.util.Scanner;

public class DigitCounter5 {

	public static void main(String[] args) {
		
		int d = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (d != -1){
			System.out.print("Enter your Number: ");
			d = input.nextInt();
			
			if (d == -1) {
				System.out.println("The program is terminated...");
		}
			else{
				for (count = 0; d > 0; d = d/10) {
					count = count + 1; 
				}
				System.out.println(count);
			}
			
			}
		input.close();
	}
}
		