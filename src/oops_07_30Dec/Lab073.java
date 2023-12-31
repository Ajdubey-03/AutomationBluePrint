package oops_07_30Dec;

public class Lab073 {

	public static void main(String[] args) {

		int c = sum(10, 20);
		System.out.println(c);

		greet("Akshay");
		sayHello(3);

	}

	static int sum(int a, int b) {
		return a + b;
	}

	static void greet(String name) {
		System.out.println("Hello" + name +"\n");
	}
	
	static void sayHello(int n)
	{
		for(int i =0; i<n; i++) 
		{
			System.out.print("Hello guyes");
		}
	}

}
