package basic_05_23Dec;

public class Lab065 {

	public static void main(String[] args) {
		

        // Condition
        // -> If, If Else, If Else-If, Else, Switch ( BREAK)
        // -> Check for some condition, true or false
        // No Break and Continue
        // Switch ( BREAK) ->



        // Loops
        // -> Do perform a task multiple times
        // -> For, While, Do while,
        // Break and Continue


        // For, While and Do While

        // For Loop ->
        // 1. Use to perform a task multiple times
        // 2. Based on condition -> task multiple times.
		
	
		// Repetitive Task
		
      //  System.out.println("Aj"); // 10 times
        
        /* for loop Syntax
        
         for( A ;B ; C)
         A -> Initialization -> JVM What variable, where you are starting point
         B - Condition -> When you want this to stop.
         C ->  Increment / Decrement

         A -> int i = 1
         B -> i < = 10 ;
         C -> i++ -> Post increment
         D -> Which code -> System.out.println("Acd");
		*/
		
		
        for(int i =1; i<=5; i++) {
        	System.out.println("AJ");
        }
        
        

        System.out.println("Print the value of i, but I want to break when i = 5");
        
        for(int i =1; i<=10; i++) {

        	//System.out.printf("value of i : %d\n", i); // 5 also will printed here
        	
        	if(i ==5) 
        	{
        		break;
        	}
        	System.out.printf("value of i : %d\n", i);  // 5 will not print here
        }
        
        
  

	}

}
