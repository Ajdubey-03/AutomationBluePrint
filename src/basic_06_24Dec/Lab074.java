package basic_06_24Dec;

public class Lab074 {

	public static void main(String[] args) {
		// 2D Array
		
		 // 2D
        int[][] arr = new int[3][3];
        int arr2[][] = new int[3][3];

        // row 0 to 2
        arr[0][0] = 12;
        arr[0][1] = 34;
        arr[0][2] = 34;

        // Initializing 2nd Array/2nd Row
        arr[1][0] = 100;
        arr[1][1] = 98;
        arr[1][2] = 45;

        // Initializing 3rd Array/3rd Row
        arr[2][0] = 1;
        arr[2][1] = 43;
        arr[2][2] = 45;
		
        for(int i =0; i<arr.length; i++) {
        	for(int j=0; j<arr.length; j++) {
        		System.out.println(arr[i][j]);
        	}
        }
        
   
        for(int i =0; i<arr.length; i++)
        {
        for(int j =0; j<arr[i].length; j++) 
        {
        	System.out.println(arr[i][j]);
        }
        }
        
        int[][] mat = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        for(int i =0; i<mat.length; i++) {
        	for(int j=0; j<mat.length; j++) {
        		System.out.println(mat[i][j]);
        	
        	}
        }

	}

}
