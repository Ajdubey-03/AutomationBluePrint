package oops_06_jan_2024.basic;

public class Lab0075 {

	public static void main(String[] args) {
		
		//Immutable-> can't be changed
		
		String password1 = "password123";
		
		// Mutable - that can be changed!!
		StringBuilder password2 =new StringBuilder("password");
		password2.append("1234");
		System.out.println(password2);
		
		

	}

}
