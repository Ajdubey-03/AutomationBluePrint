package oops_06_jan_2024.basic;

public class Lab0072 {

	public static void main(String[] args) {
		
		String name = "Akshay";  //String constant pool , String is a immutable.
		String name1 = new String("Akshay");   // Heap area or object area
		
		System.out.println(name);
		
		name = "Kumar";
		System.out.println(name);
		System.out.println(name1);
		
		String str1 = "Hello";
	//	str1 = str1.concat("Gueys");
		
		str1 ="Helloooo";
		System.out.println(str1);
		
		
		

	}

}
