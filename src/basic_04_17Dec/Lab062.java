package basic_04_17Dec;

public class Lab062 {

	public static void main(String[] args) {
		
		 int a = 110;
	     int b = 45;
	        // Max in two number?
	        // ?
	        // If else
	        // Math
	        
	        if(a>b)
	        {
	        System.out.printf("Maximum number is a:--> %d \n" , a);
	        }else 
	        {
	        System.out.printf("Maximum number is b:--> %d \n" , b);
	        }
	        
	        
	        
	        int maxVal=  (a>b)? a:b;
	        System.out.printf("Maximum number %d",maxVal);
	        
	        
	     int m2=   Math.max(12, 10);
	     
	     System.out.println("************************ "+ m2);

	}

}
