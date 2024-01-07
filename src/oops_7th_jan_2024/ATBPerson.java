package oops_7th_jan_2024;

public class ATBPerson {

	//Attributes, or instance  variable values are default
	
	String name; // instance  variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;
    
    // default constructed
    
    public ATBPerson(){
    	System.out.println("I am Default constructer");
    	courseName = "ATB";
    	name ="Akki";
    }
    
    public ATBPerson(String name) {
    	System.out.println("I am parameterized constructer");
    	this.name = name;
    }
    
    public ATBPerson(String name, String courseName) {
    	System.out.println("I am parameterized constructer");
    	this.name = name;
    	this.courseName=courseName;
    }
    
    public void personDetails(){
    	System.out.println(this.name);
    	System.out.println(this.courseName);
    }
    
}
