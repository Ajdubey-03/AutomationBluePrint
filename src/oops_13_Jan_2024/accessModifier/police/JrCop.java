package oops_13_Jan_2024.accessModifier.police;

public class JrCop {
	public static void main(String[] args) {
		
		Cop cop = new Cop(5);
		System.out.println(cop.gun);
		cop.canIShoot();   // junior cap want to access Cop authority, so make method is deafult
	}

}
