package basic_06_24Dec;

public class Lab070 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 5 };
		System.out.println(arr1 == arr2); // false
		int[] arr3 = arr1;
		System.out.println(arr1 == arr3); // true

		System.out.println(arr1.equals(arr2)); // false
		// If String -> True Why - Values
		// Arrays -> Compare Don't -> Ref - Not equal

		arr3[0] = 24;
		System.out.println(arr1[0]);
		System.out.println(arr3[0]);

		
		// print the array
		
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i]*2);
		}
	}

}
