package oops_13_Jan_2024;

public class PV1 {

	public static void main(String[] args) {
		
		Person p =new Person();  // it will call the Default constructer
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.b);      // Boolean value will be false by Default if not assigne any values
		
		new Person();   // Object is create but not assigne any Refrence variable
		System.out.println("----------Parameterise constructer------------");
		Person p1 = new Person(12, "Raju", true);  // Parameter constructer will call here and value will assigne accrd
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p.b);
		

	}

}




// Creat a Person class and 

class Person{
	int age;
	String name;
	boolean b;
	
	// Default Constructer
	public Person() 
	{
		age =10;
		name= "Akshay";
	}
	
	// Permetrise Constructer
	public Person(int age, String name,boolean b) {
		this.age =age;
		this.name=name;
		this.b =true;
	}
	
	
	
	
}
