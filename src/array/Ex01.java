package array;

public class Ex01 {

	public static void main(String[] args) {

		
		
		int[] intArray1 = {10, 20, 30};
	
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);

		
		int[] intArray2 = null; 
		intArray2 = new int []{1, 2, 3};  
		
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		
		int[] intArray3 = new int[3]; 
		
		intArray3[0] = 4;
		intArray3[1] = 5;
		intArray3[2] = 6;
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		
		
		int[] intArray4 = {100};
		
		System.out.println(intArray4[0]);
		
		int[] intArray5 = null;
		intArray5 = new int [] {200, 300};
		
		System.out.println(intArray5[0]);
		System.out.println(intArray5[1]);
		

 }
	
}
