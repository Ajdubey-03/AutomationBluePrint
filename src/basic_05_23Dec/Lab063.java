package basic_05_23Dec;

import java.util.Scanner;

public class Lab063 {

	public static void main(String[] args) {
		// Take input from the user and perform Math function
		
		Scanner sc = new Scanner(System.in);
		
        // You have to tell JVM which input user is enter
        // sc.next() ->  String;
       // sc.nextInt()
      // sc.nextDouble();
      // sc.nextBoolean();
      // sc.nextFloat();
		
		System.out.println("Enter the X");
		double x = sc.nextDouble();
		System.out.println("Enter the Y");
		double y = sc.nextDouble();
		System.out.println("Enter the Z");
		double z = sc.nextDouble();
		System.out.println(Math.abs(z));
		double result;
		result = Math.cbrt(Math.pow(x, 2) +Math.pow(y, 2) - Math.abs(z));
		System.out.println(result);
		
		sc.close();
		
		

	}

}
