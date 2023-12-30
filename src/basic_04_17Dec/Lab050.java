package basic_04_17Dec;

import java.util.Scanner;

public class Lab050 {

	public static void main(String[] args) {
		
		// if else Statement yes,no ,true,false
		
//		if(true) 
//		{
//			System.out.println("True");
//		}
//		else 
//		{
//			System.out.println("false");
//		}
		
		
		if(true)
		{
			System.out.println("only true, No Else conditions");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input here");
		int num =sc.nextInt();
		if(num>20)
		{
			System.out.println("num> 20");
		}
		else if(num>10)
		{
			System.out.println("num > 10");
		}
		else 
		{
		System.out.println("lesser value");
		}

		
		sc.close();  //will closed the Scanner class here
	}
	

}
