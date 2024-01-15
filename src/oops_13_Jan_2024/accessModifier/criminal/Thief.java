package oops_13_Jan_2024.accessModifier.criminal;

import oops_13_Jan_2024.accessModifier.police.Cop;

public class Thief {
	
	public static void main(String[] args) {
		Cop cop =new Cop(10);
		System.out.println(cop.gun);
		
	//	cop.canIShoot();          // It is wrong Theif how can use the Police action , So make this method private and attributes
	}
	
}
