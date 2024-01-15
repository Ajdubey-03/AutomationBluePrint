package oops_13_Jan_2024.encapsulation;

public class Lab088 {

	public static void main(String[] args) {
		
		ICICI ic = new ICICI("Akk", 1000.0);
		double acb = ic.getBal();
		String nm=ic.getName();
		System.out.println(acb);
		System.out.println(nm);
		ic.setBal(-100);  //Invalid
		ic.setBal(120);

		
		double acb1 = ic.getBal();
		String nm1=ic.getName();
		System.out.println(acb1);
		System.out.println(nm1);
	}

}
