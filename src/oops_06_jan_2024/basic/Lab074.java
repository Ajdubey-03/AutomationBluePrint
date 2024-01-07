package oops_06_jan_2024.basic;

public class Lab074 {

	public static void main(String[] args) {
		
		// String : immutable by nature/ can't be changed
		String name ="Rahul";
		String name1 = new String("Rahul");
		
		System.out.println(name + "hello");
		System.out.println(name);
		
		
		// Mutable : can be changed
		// String can be make mutable by using StringBuilder and StringBuffer class
		
		StringBuilder sb1 = new StringBuilder("Akshay");
		System.out.println(sb1);
		sb1.append(" kumar");
		System.out.println(sb1);
		
		StringBuffer sf1 = new StringBuffer("Rahul");
		sf1.append(" Dubeyy");
		System.out.println(sf1);
		
	}

}
