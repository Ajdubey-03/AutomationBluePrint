package basic_06_24Dec;

import java.util.Scanner;

public class Lab071 {

	public static void main(String[] args) {
		// Take input user Marks of 5 subjects and Print the marks
		Scanner sc = new Scanner(System.in);
		int [] marks = new int[5];
		System.out.println("Enter the First Subject");
		marks[0]=sc.nextInt();
		System.out.println("Enter the second Subject");
		marks[1]=sc.nextInt();
		System.out.println("Enter the third Subject");
		marks[2]=sc.nextInt();
		System.out.println("Enter the fourth Subject");
		marks[3]=sc.nextInt();
		System.out.println("Enter the fifth Subject");
		marks[4]=sc.nextInt();
		
		
		for(int el:marks)                   // Extract values of array
		{
			System.out.println(el);   
		}
		sc.close();
	}

}
