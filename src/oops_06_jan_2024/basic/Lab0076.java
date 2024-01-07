package oops_06_jan_2024.basic;

public class Lab0076 {

	public static void main(String[] args) {
		
		 // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder

		StringBuffer sb1 = new StringBuffer("AKSHAY");
		StringBuffer s2=sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1);
		
	}

}
