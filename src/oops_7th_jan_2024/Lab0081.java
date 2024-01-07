package oops_7th_jan_2024;

public class Lab0081 {

	public static void main(String[] args) {
		// Runnable class of ATBPersons
		
		ATBPerson at = new ATBPerson();
		//System.out.println(at.courseName);
		at.personDetails();
		
		
		ATBPerson at1 = new ATBPerson("Akshay");
		at1.courseName ="Test Engineer";
		at1.personDetails();
		
	
		ATBPerson at2 = new ATBPerson("Akshay", "QA Automation");
		at2.personDetails();
		
		

	}

}
