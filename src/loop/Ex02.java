package loop;

public class Ex02 {

	public static void main(String[] args) {

		// while문을 사용해서 1 ~ 10까지 합 구하기
		
		int hap = 0;
		
		int i = 1;
		
		while(i <= 10) {
			
			hap+= i;
			i++;
		}

		System.out.println("1부터 10까지의 합: " + hap);
	}

}
