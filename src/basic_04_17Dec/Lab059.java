package basic_04_17Dec;

public class Lab059 {

	
	public static void main(String[] args) {
		
		
		int a =35;
		switch(a) 
		{
		case 35:
			System.out.println("Hello");
		}

		
		char ch ='A';
		switch(ch)
		{
		case 'A':
			System.out.println("Char is supported in switch");
			break;
		}
		
		float f =6.5f;
		switch((int)f)
		{
		case 6:
			System.out.println("float is not supported in switch");
			//break; 
		default:
			System.out.println("Type cast required to float to int");
		}
		
		double d = 1.0;
		switch((int)d)
		{
		case 1:
			System.out.println("Doule is also not supported in switch case");
			//break;
		default:
			System.out.println("need to type cast into type");
		}
		

        long a11=30;
        switch((int)a11)
        { 
        case 30:
        	System.out.println("Long also not supported in Switch case");
        	//break;
        default:
        	System.out.println("Need to convert into int type");
        }
        
        String name ="AJ";
        switch(name) 
        {
        case "AJ":
        	System.out.println("String is supported in switch");
        	break;
        
        }
        
        System.out.println("Supported type in Switch -> int,char,string,byte");
        System.out.println("Not supported type in Switch -> boolean,long,float,double");
	}

}
