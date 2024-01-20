package oops_13_Jan_2024.poly.methodoverloading;

public class Person {
	
	public int addNum(int a, int b) {
		System.out.println("Add two number Methods..");
		return a+b;
		
	}
	
	public int addNum(int a , int b, int c ) {
		System.out.println("Add three number Methods method overloading..");
		return a+b+c;
	}
	
	public void readBook(String bk) {
		System.out.println("Person Class Std readingBook ::" + bk);
	}
	
	
}

class Person2 extends Person{
	public void readBook(String book) {
		System.out.println("Reading book of child class :: " + book +"name");
	}
}

class Person3{
	public void print(Person p , String book) {
		System.out.println("Displaying the readMethods from parent class or child class\n it is called as Runtime polymorphism..");
		p.readBook(book);
	}
}
