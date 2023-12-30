package basic_04_17Dec;

import java.util.Scanner;

public class Lab061 {

	public static void main(String[] args) {
		
		
		// switch case of new syntax
		// weekend and weekdays
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Days number");
		int day = sc.nextInt();
		switch(day) {
		case 1,2,3,4,5:
			System.out.println("Weekdays");
		    break;
		case 6,7:
			System.out.println("Weekend");
		    break;
		default:
			System.out.println("Inavlid Days");
		}
		
		System.out.println("Enter your month number here:: ");
		int month =sc.nextInt();
		switch(month) 
		{
		case 1 ->System.out.println("Jan");
		case 2 ->System.out.println("Feb");
		case 3 ->System.out.println("March");
		case 4 ->System.out.println("April");
		case 5 ->System.out.println("May");
		case 6 ->System.out.println("June");
		case 7 ->System.out.println("July");
		case 8 ->System.out.println("August");
		case 9 ->System.out.println("September");
		case 10 ->System.out.println("October");
		case 11 ->System.out.println("November");
		case 12 ->System.out.println("December");
		default->System.out.println("Invalid input");
		}
		
		
		switch(month)
		{
		case 1,3,5,7,8,10,12->{
			System.out.println("Month of 31 Days");
			System.out.println("Jan , March, May, July, August, October, December");
		}
		case 4,6,9,11->{
			System.out.println("Month of 30 Days");
			System.out.println("April, june, September, November");
		}
		case 2->{
			System.out.println("Month of 28/29 Days");
			System.out.println("Feb");
		}
		default -> System.out.println("Invalid output");
		}

	}

}
