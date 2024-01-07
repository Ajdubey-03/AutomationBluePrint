package oops_7th_jan_2024.Inheritance;

public class ProgrammingLang {
	
	String version;
	String name;
	boolean active;
	int year;
	String Auther;
	
	ProgrammingLang(){
		System.out.println("I am default parent constructer");
	}
	
	ProgrammingLang(String Auther, int year){
		this.year =year;
		this.Auther =Auther;
	}
	
	public void getDetails() {
		System.out.println("Auther :: " + this.Auther +" &&" + " Year :: " +this.year);
	}

}
