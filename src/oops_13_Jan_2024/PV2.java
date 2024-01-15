package oops_13_Jan_2024;

public class PV2 {

	public static void main(String[] args) {
		Person2 p2 = new Person2();
		p2.run();
		Person2 p3 = new Person2();
		p3.speed=25;
		p3.run();
		
	//	System.out.println(Person2.speed);  //not possible without object 
		System.out.println(p2.speed);
		System.out.println(p3.speed);

		//Person2 p4 = null;      // will get an error object is not ceated
		//p4.run();
		
		
		System.out.println(Person2.fastSpeed);  //Directly access the attributes or method by Class and dot notatin due to static keyword
		Person2.fastSpeed=141.01;
		Person2.fastrun();                   // Access by class name due to static keyword
	}

}


class Person2{
	
	double speed;
	static double fastSpeed;
	//Methods
	public  void run() {
		System.out.println("Run is clled : "+ speed );
		
	}
	
	public static void fastrun() {
		System.out.println("Running fast speed is ::" + fastSpeed);
	}
}