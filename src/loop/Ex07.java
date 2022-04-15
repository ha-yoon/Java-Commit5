package loop;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 커피숍 주문받기
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		do {
			
			System.out.println("주문 도와드리겠습니다~");
			System.out.println("1.아메리카노 2.카페라떼 3.청포도에이드 4.주문종료");
			
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1 :
				System.out.println("아메리카노를 선택하셨습니다😊");
				System.out.println("아메리카노 나왔습니다~ 맛있게 드세요!😊");
				break;
			case 2 : 
				System.out.println("카페라떼를 선택하셨습니다😊");
				System.out.println("카페라떼 나왔습니다~ 맛있게 드세요!😊");
				break;
			case 3 : 
				System.out.println("청포도에이드를 선택하셨습니다😊");
				System.out.println("청포도에이드 나왔습니다~ 맛있게 드세요!😊");
				break;
			case 4 : 
				System.out.println("안녕히가세요~ 다음에 또 오세요!😊");
				break;
				default : 
					System.out.println("잘못 주문하셨습니다. 다시 입력해주세요!");
			
			}
			
			
		}while(menu != 4); 
		
		scan.close();
	}

}
