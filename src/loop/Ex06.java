package loop;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				continue;
			} // '5'만 제외하고 숫자 출력
			
			System.out.println(i);
		}

	}

}
