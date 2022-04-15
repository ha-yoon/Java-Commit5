package loop;

public class Ex03 {

	public static void main(String[] args) {
		// 중첩 while문 사용해서 구구단 출력하기 (2 - 9)
		
		int dan = 2;
		int num = 1;

		
		while(num < 10) {
			
			while(dan < 10) {
				
				System.out.printf("%dx%d=%d\t", dan, num, dan*num);
				dan++;
			}
			System.out.println();
			num++;
			dan = 2;
		}

	}

}
