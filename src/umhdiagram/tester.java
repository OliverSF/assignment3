package umhdiagram;

import java.util.*; //importing all lists using *

public class tester {

	public static void main(String[] args) {
		//main method for tester class
		
		//Creating Arraylist to hold collection of Student objects
		List<Student> tester1 = new ArrayList<Student>();
		
		//adding instances of Student to the list
		tester1.add(new Student("John Doe", 123445875));
		tester1.add(new Student("Molly Moe", 12322387));
		
		//Printing a header for list into the console
		System.out.println("Student List:");
		
		//using an enhanced loop to output contents of the list
		for(Student p : tester1){
			System.out.println(p.toString());
		}
			tester1.remove(1); //Removing Molly Moe (the second entry) from the Array List
			
			//Printing new header for list into the console
			System.out.println("\nStudent List After Removal:");
			
			//using an enhanced loop to output contents of the list
			for(Student p : tester1){
				System.out.println(p.toString());
			}
	}
}