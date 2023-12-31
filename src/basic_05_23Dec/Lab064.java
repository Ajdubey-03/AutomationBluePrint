package basic_05_23Dec;

import java.util.Scanner;

public class Lab064 {

	public static void main(String[] args) {
		
		// printf 
		 // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
		
		
		
		 // Take a user input and print the information
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter you name");
		String name = sc.next();
		System.out.println("Enter you age");
		byte age =sc.nextByte();
		System.out.println("Enter you gender");
		char gender =sc.next().toCharArray().clone()[0];
		
		//printing the info 
		System.out.printf("Name is %s\n" ,name);
		System.out.printf("age is %d\n",age);
		System.out.printf("gender is %c\n",gender);
		
		
		sc.close();

	}

}
