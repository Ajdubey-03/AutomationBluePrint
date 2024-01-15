package oops_13Jan_2024.poly.methodoverloading;

public class RC {

	public static void main(String[] args) {
		Person p = new Person();
		p.gift("Akshay");
		p.gift("Akshay", "Akshay");
		p.gift(154);
		System.out.println("\n"+ p.gift(10, 15));
		System.out.println(p.gift(16, 15));


	}

}
