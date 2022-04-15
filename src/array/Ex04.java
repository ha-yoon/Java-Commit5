package array;

public class Ex04 {

	public static void main(String[] args) {
		
		// 배열의 길이가 7인 정수배열 만들기 
		// 배열의 각 항목에 10 ~ 70까지 데이터 넣기
		// 반복문을 통해서 배열의 각 항목의 데이터 출력하기 
		
		int[] intArray = new int[7];
		
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		intArray[5] = 60;
		intArray[6] = 70;
		
		// index가 3인 곳은 출력하지 않고
		// 나머지 데이터만 출력하기 

		for(int i = 0; i < intArray.length; i++) {
			
			if(i == 3) {
				continue;
			}
			
			System.out.println(intArray[i]); 
		}
		
	}

}
