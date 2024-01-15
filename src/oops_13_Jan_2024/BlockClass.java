package oops_13_Jan_2024;

public class BlockClass {

	{
		//Instance Initialized block
		System.out.println("I am IIB");
	}
	
	BlockClass(){
		System.out.println("I am DC");
	}
	
	static 
	{
		//Static Initialized Block
		System.out.println("I am SIB");
	}
	
}
