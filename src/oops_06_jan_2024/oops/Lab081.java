package oops_06_jan_2024.oops;

public class Lab081 {

	public static void main(String[] args) {
		
		 // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
       // OOPs concept
		
		
		Person p = new Person();
		p.name="Akshay";
		p.phoneNumber=987654321;
		System.out.println(p.name);
		Person p2 = new Person();
		p2.name="Raghav";
		System.out.println(p2.name);
		p.seelp();
		p.talk();
		new Person();  // object is created but not any reference variable
		Person p3=null;
		System.out.println("End of the Program");

	}

}
