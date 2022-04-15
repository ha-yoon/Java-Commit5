package loop;

public class Ex04 {

	public static void main(String[] args) {
		
		int a = 100;
		
		do {
			
			System.out.println("처음 한 번은 우선 실행한다.");
			
		}while(a == 200); 
		
		while(a == 200) {
			System.out.println("실행 안함");
		}

	}

}
