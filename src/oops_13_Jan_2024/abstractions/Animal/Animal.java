package oops_13_Jan_2024.abstractions.Animal;

public abstract class Animal {


	public Animal() 
	{
		System.out.println("Two types of Animal, Pet, Wild");
	}
	
	public void speak() {
		System.out.println("aggressive speaaking");
	}
	
	abstract void run();
}
