package oops_13_Jan_2024.encapsulation;

public class Lab087 {

	public static void main(String[] args) {
		Students s = new Students();
		s.age=27;
		s.name="Bhanu";
		s.print();
		
		Persons p =new Persons();
		p.bal=-11;
		p.id=10;
		p.name="Ajj";
		int age =p.age(25);
		System.out.println(age);
		p.sleep();
		
		
		 // Getter and setter - Condition Based
        // They should hidden (Detaial should be hidden , and can not be modified or changes directly)
		// So Encapsulatuion is prasent here
		
		
		
	}

}
