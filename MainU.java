package day1;

import java.sql.SQLException;
import java.util.Scanner;

public class MainU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainU MU = new MainU();
		try {
			MU.bookstatus();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void bookstatus() throws SQLException {
		Scanner scan = new Scanner(System.in);
		boolean isStop = false;
		BusinessLogic bl = new BusinessLogic();
		int bookNo;
		int stuNo;
		while (!isStop) {
			System.out.println("1. 도서정보 | 2. 도서대여 | 3. 도서반납 | 4. 도서현황 | 5. 이용현황| 6. 종료");
			System.out.print("메뉴 중 하나를 선택하세요 >>> ");
			
			int cmd = scan.nextInt();
			// 선택에 맞는 작업을 한다.
			switch(cmd) {
			case 1:
				System.out.println("1. 도서현황 | 2. 도서등록 | 3. 책정보수정 | 4. 종료.");
				System.out.print("메뉴 중 하나를 선택하세요 >>> ");
				int cmd2 = scan.nextInt();
				switch(cmd2) {
				case 1:
					isStop = true;
					System.out.println("도서목록");
					break;
				case 2:
					isStop = true;
					System.out.println("책 정보를 입력하세요.");
					break;
				case 3:
					isStop = true;
					System.out.print("수정 할 책의 번호를 입력해주세요.");
					break;
				case 4:
					isStop = true;
					System.out.println("감사합니다.");
				}
				break;
			case 2:
				System.out.println("도서대여");
				System.out.println("");
				System.out.println("대여하실 책의 번호를 입력해주세요>>");
				bookNo = scan.nextInt();
				System.out.println("학생번호를 입력해주세요 >>");
				stuNo = scan.nextInt();
				scan.close();
				bl.borrowBook(stuNo, bookNo);
				System.out.println("대여가 완료되었습니다.");
				break;
				
			case 3:
				System.out.println("도서반납.");
				System.out.println("");
				System.out.println("반납하실 책의 번호를 입력해주세요>>");
				bookNo = scan.nextInt();
				System.out.println("학생번호를 입력해주세요 >>");
				stuNo = scan.nextInt();
				scan.close();
				bl.returnBook(stuNo, bookNo);
				System.out.println("반납이 완료되었습니다.");
				break;
				
			case 4:
				System.out.println("도서목록");
				break;
			case 5:
				System.out.println("1. 대출 도서 상위 5위에 대한 정보");
				System.out.println("2. 대출자 상위 5위에 대한 정보 ");
				System.out.println("3. 대출기간이 가장 짧은 도서에 대한 정보");
				System.out.println("4. 대출반납이 가장 빠른 학생");
				System.out.println("5. 대출을 가장 많이하는 학과");
				System.out.println("6. 대출반납이 가장 늦은 학과");
				System.out.println("7. 종료.");
				System.out.println("메뉴 중 하나를 선택하세요 >>> ");
				int cmd3 = scan.nextInt();
				switch(cmd3) {
				case 1:
					isStop = true;
					System.out.println(" 대출 도서 상위 5위에 대한 정보");
					break;
				case 2:
					isStop = true;
					System.out.println("대출자 상위 5위에 대한 정보");
					break;
				case 3:
					isStop = true;
					System.out.println("대출기간이 가장 짧은 도서에 대한 정보");
					break;
				case 4:
					isStop = true;
					System.out.println("대출반납이 가장 빠른 학생");
					break;
				case 5:
					isStop = true;
					System.out.println("대출을 가장 많이하는 학과");
					break;
				case 6:
					isStop = true;
					System.out.println("대출반납이 가장 늦은 학과");
					break;
				case 7:
					isStop = true;
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}
				break;
				
			case 6:
				isStop = true;
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
		scan.close();		
	}

}
