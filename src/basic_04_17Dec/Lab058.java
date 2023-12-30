package basic_04_17Dec;

import java.util.Scanner;

public class Lab058 {

	public static void main(String[] args) {
		
		//check vowel or consonant by switch
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String here");
		//char input = sc.next().charAt(0);        // take string and convert it in char type
		char inp = sc.next().toCharArray()[0];   //// take string and convert it char array and return 0 index values

		switch(inp) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		
		

	}

}
