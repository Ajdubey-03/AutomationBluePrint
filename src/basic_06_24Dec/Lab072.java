package basic_06_24Dec;

public class Lab072 {

	public static void main(String[] args) {
		
		// FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".
		String F1 ="Fizz", F2 ="Buzz", F3="FizzBuzz";

		for(int i =1; i<=100; i++) 
		{
			if(i%3==0 && i%5==0) 
			{
				System.out.println(F3 + " " +i);
			}else if(i%3==0) 
			{
				System.out.println(F1+ " " +i);
			}else if(i%5==0) 
			{
				System.out.println(F2 + " " +i);
			}else 
			{
				
			}
			
		}

	}

}
