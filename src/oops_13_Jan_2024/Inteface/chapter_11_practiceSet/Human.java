package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public class Human extends Monkey implements BasicAnimal{

	@Override
	public void sleep() {
		System.out.println("Sleeping is natural");
		
	}

	@Override
	public void eat() {
		System.out.println("Eating is natural");
		
	}

	
}
