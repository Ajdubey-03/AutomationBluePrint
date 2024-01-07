package oops_06_jan_2024.basic;

import java.util.Scanner;

public class Lab0077 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Check the String palindrom...");
		String userInput = sc.next();
		
		if(isPalindrome(userInput)) {
			System.out.println("Yes, It's palindrome number");
		}else 
		{
			System.out.println("Not a palindrom string");
		}
			
		
		

	}
	
	static boolean isPalindrome(String input){
		String original_str =input;
		StringBuilder sb1 = new StringBuilder(input);
		StringBuilder sb2 = sb1.reverse();
		String s3 =sb2.toString();
		return original_str.equalsIgnoreCase(s3);
		
	}

}
