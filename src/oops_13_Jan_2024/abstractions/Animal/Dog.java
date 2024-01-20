package oops_13_Jan_2024.abstractions.Animal;

public class Dog extends Animal{

	@Override
	void run() {         // abstract methods from animal class
		
		System.out.println("Runninf fast....");
		 speak();   // concrete methods from animal class
		
	}
	
	

}
