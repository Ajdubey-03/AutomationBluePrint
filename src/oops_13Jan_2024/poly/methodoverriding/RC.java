package oops_13Jan_2024.poly.methodoverriding;

public class RC {

	public static void main(String[] args) {
	/*	
		Hound h = new Hound();
		h.bark();
		
		Dog d = new Dog();
		d.bark();
	*/	
		 Dog f  =  new Hound(); // Dynamic Diaptch
	        // Runtime Polymorphism
	     f.bark();


	        //Hound a = new Dog(); // Java 22 This is not possible
	        // Latest java 22 - It is never possible in JAVA

	    }

	}

