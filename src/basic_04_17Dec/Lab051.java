package basic_04_17Dec;

import java.util.Scanner;

public class Lab051 {

	public static void main(String[] args) {
	
		 // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // 1. Input from user
        // Score(Data type) -> int  -> Grade ( char or String)
        // DAA- Ask for the confirmation of the doubts


        // 2. Basic login or Brute force Logic write basic rough code
        // if score >= 90 && score  <=100 -> print A
        // else if score >= 80 && score  89 <= 100 -> print B

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		if(marks>=90 &&marks<=100) 
		{
		System.out.println('A');
		}
		else if(marks>=80 && marks<=89) 
		{
		System.out.println('B');	
		}
		else if(marks >=70 && marks <=79) 
		{
		System.out.println('C');	
		}
		else if(marks >=60 && marks<=69) 
		{
		System.out.println('D');
		}
		else
		{
		System.out.println('F');
		}
	
	}

}
