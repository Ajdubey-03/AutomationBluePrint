package oops_7th_jan_2024.Inheritance.multilevel;

public class Lab084 {

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		Father f = new Father();
		f.bhk2();
		f.bhk3();
		gf.bhk3();  // Only can get all the 
		Son s = new Son(); // get All the attributes of Parents grand 
		s.bhk1();
		s.bhk2();
		s.bhk3();
		

	}

}
