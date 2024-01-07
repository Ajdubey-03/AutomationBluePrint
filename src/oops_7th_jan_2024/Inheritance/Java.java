package oops_7th_jan_2024.Inheritance;

public class Java extends ProgrammingLang {

	public Java() {
		System.out.println("I am default constructer of child class");
	}
	
	
	public void adsFeature() {
		System.out.println("Extran feature added");
	}
	
	public static void main(String[] args) {
		
		
		Java j =new Java();
		// can get all the attributes and methods from Parents class as well as child class
		j.getDetails();
		
		ProgrammingLang p1 =new ProgrammingLang("james", 1994);
		p1.getDetails();
		
		
	//	Java j3 = new ProgrammingLang(); // invalid child class can not used as reference for parents
		
		ProgrammingLang p2 = new Java();
		// this can not access the Java class (child class attributes and methods)
		
	

	}

}
