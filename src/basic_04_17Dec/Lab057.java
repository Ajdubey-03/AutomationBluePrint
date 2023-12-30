package basic_04_17Dec;

import java.util.Scanner;

public class Lab057 {

	public static void main(String[] args) {
		
		// open browser by taking input by the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your browser name here:: ");
		String browser = sc.next().toLowerCase();
		switch(browser) 
		{
		case "chrome":
			System.out.println("Execute the Chrome Code");
			break;
		case "firefox":
			System.out.println("Execute the firefox Code");
			break;
		case "edge":
			System.out.println("Execute the Edge Code");
			break;
		default:
			System.out.println("Not found any suitable browser");
		
		}
		
		
		

	}

}
