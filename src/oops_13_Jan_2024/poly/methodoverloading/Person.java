package oops_13_Jan_2024.poly.methodoverloading;

public class Person {
	

    // Method OverLoading -> multiple methods with same name, but different argument.
	
	public void gift(String x) 
	{
		System.out.println("M a gift method of with takin one parameter of String type:  " + x);
	}
	
	public void gift(String fName, String lName) 
	{
		System.out.printf("gift method again by taking 2 parameter  of string firsName is %S and lastName is %S" ,fName, lName);
	}
	
	public void gift(int price) 
	{
		System.out.printf("\ngift method taking of integer param and giftPice are %d" ,price);
	}
	
	public boolean gift(int a, int b) 
	{
		return (a>b);
	}
	

}
