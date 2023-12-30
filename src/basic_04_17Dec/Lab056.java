package basic_04_17Dec;

import java.util.Scanner;

public class Lab056 {

	public static void main(String[] args) {
		

        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition
		
		//which day is today
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your Days number here");
		int day = sc.nextInt();
		switch(day) 
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid input!!");
		}
		

	}

}
