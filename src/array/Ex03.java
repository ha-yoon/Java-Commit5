package array;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		// index를 통해서 100 200 300 400 500의 데이터를 넣기
		// 배열의 데이터를 출력하기
		
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;


		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]); 
		}
		
		System.out.println("배열의 길이는 ?" + intArray.length);
	

	}

}
