package basic_06_24Dec;

public class Lab069 {

	public static void main(String[] args) {

		// Arrays -> Java
		// Collection data
		// Collection of Similar

		// Students -> Praveen, Nandani, Alok, Pramod
		// Collection of Students Names

		// {"Amit","Pramod","Praveen","Alok"}
		// Store - 10th Marks -> 96,90, 87, 82, 56(English)

		int marks[] = { 10, 15, 20, 35, 45 };
		String[] students = { "Aj", "Vj", "Rj", "Raunak" };
		float[] f1 = { 4.1f, 5.5f, 9.8f };
		boolean[] b = { true, false, true, false };
		char[] c = { 'A', 'B', 'C', 'D' };

		// Printing Array Elements and index , length etc

		System.out.println(students[3]); // element of 3rd index Raunak
		System.out.println(marks.length); // length of array
		System.out.println(marks[0]);
		marks[0] = 15;
		System.out.println(marks[0]); // Replace the array items

		System.out.println(f1[0]);
		
		
		
		String [] name = new String [3];  //Array Definitions
		name[0]="Akshay";
		name[1]="Kumar";
		name[2]="Dubey";
	//	System.out.println(name);  // it will showing garage values
		
		System.out.println(name[2]); // Dubey , Array is start with index 0
		 
		
		

//	System.out.println(f1[3]); // Exception in thread "main"//Index 3 out of bounds for length 3
		
		

	}

}
