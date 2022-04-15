package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// Scanner로 index 하나를 입력받아 해당하는 데이터 출력하기
		
		int[] array = {100, 200, 300, 400, 500};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("array 배열의 인덱스는 0 ~ 4 까지 입니다.");
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		if(index < 0 || index > 4) {
			System.out.println("인덱스를 잘못 입력 했습니다.");
		}else {
		System.out.println("array[" + index + "]의 값 :" + array[index]);
		}
		
		
		scan.close();
		

	}

}
