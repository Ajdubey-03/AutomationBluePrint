package oops_7th_jan_2024.Inheritance;

public class Lab083 {

	// ## What is Inheritance?
	// Inheritance provides a way to create a new class from an existing class
	// SuperClass | Parent Class | Base Class
	// SubClass | Child Class | Derived Class
	// The extends Keyword

	// SubClass extends SuperClass{
	//// contents of SubClas
	// }
	public static void main(String[] args) {

		ProgrammingLang p = new ProgrammingLang(); // Parent Class/ SuperClass / Base Class
		// How JVM understand this program

		// Programming - Class
		// p -> ref to the Object
		// new Programming() -> Object
		// DC is called
		
		p.getDetails();

		ProgrammingLang p2 = new ProgrammingLang("Perl", 12);
		// How JVM understand this program

		// Programming - Class - Class Loader
		// p2 -> ref to the Object
		// new Programming() -> Object
		// Param - Constructor - Called!!
		
		p2.getDetails();

	}
}
