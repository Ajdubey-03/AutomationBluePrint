package oops_7th_jan_2024;

public class Lab0083 {

	public static void main(String[] args) {
		
		PersonDetails pt = new PersonDetails();
		pt.name="Akshay";
		pt.age=28;
		pt.email="abcd@gyopmail.com";
		pt.gender ="Male";
		pt.phone="9999888800";
		pt.profession="Private job";
		pt.getDetails();
		
		System.out.println("------------------ -----------------------");
		
		PersonDetails pt1 = new PersonDetails("Rahul Kumar", "ax@yopmail.com");
		pt1.getDetails();

	}

}
