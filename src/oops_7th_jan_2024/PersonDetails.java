package oops_7th_jan_2024;

public class PersonDetails {
	String name;
	int age;
	String email;
	String phone;
	String gender;
	String profession;
	
	
	public PersonDetails(){
		
	}
	
	public PersonDetails(String name, String email) {
		this.name =name;
		this.email =email;
		
	}
	
	public void getDetails() {
		System.out.println("name is : "+ name);
		System.out.println("age is : "+ age);
		System.out.println("email is : "+ email);
		System.out.println("gender is : "+ gender);
		System.out.println("profession is : "+ profession);
	}

}
