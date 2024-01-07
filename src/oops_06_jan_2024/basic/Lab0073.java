package oops_06_jan_2024.basic;

public class Lab0073 {

	public static void main(String[] args) {
		
		String name = "Akshay";
		System.out.println(name.concat(" Kumar")); // after concat it is creating another string
		System.out.println(name + " kumaarr");
		String name1=name.concat(" Dumeyy");
		System.out.println(name1);
		System.out.println(name.contains("a"));
		System.out.println(name);  // Still will be same , because string is immutable 
		String st = new String("Akshay");
		System.out.println(st ==name);  // Expected false due to st is created i heap area or ob area, Reference is not same for boath
		System.out.println(st.equals(name));  // Checking values only not reference , Expected true
		String p1 = new String("Ujjwal shahu");
		String p2 = new String("ujjwal ShaHu");
		System.out.println("compare String values :: "+ p1.equalsIgnoreCase(p2));
		System.out.println("compare String values with reference :: "+ (p1==p2));
		
		

		String Expected_pass = "password@123";
		String Actual_pass ="PassworD@123";
		if(Actual_pass.equalsIgnoreCase(Expected_pass)) {
			System.out.println("Yes, Accepted");
		}
		
		
	}

}
