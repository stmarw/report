package day1;

import java.util.Scanner;

public class MainU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainU MU = new MainU();
		MU.bookstatus();
	}
	
	public void bookstatus() {
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		while (!isStop) {
			System.out.println("1. 도서정보 | 2. 도서대여 | 3. 도서반납 | 4. 도서현황| 5. 종료");
			System.out.print("메뉴 중 하나를 선택하세요 >>> ");
			
			int cmd = scan.nextInt();
			// 선택에 맞는 작업을 한다.
			switch(cmd) {
			case 1:
				System.out.println("도서정보현황");
				break;
			case 2:
				System.out.println("도서대여현황.");
				break;
			case 3:
				System.out.println("도서반납현황.");
				break;
			case 4:
				System.out.println("도서목록.");
				break;
			case 5:
				isStop = true;
				System.out.println("감사합니다.");
				break;
			}
		}
		scan.close();		
	}
}
	
