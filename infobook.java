package day1;

import java.util.Scanner;

public class infobook {
	
	//1. 도서 목록
	public void bookList() {
		
	}
	
	// 2. 도서 등록
	public void bookAdd() {
		
	}
	
	// 3.책 정보 수정
    public void updateBook() {
    	Scanner sc = new Scanner(System.in);
    	LibraryDAO dao = new LibraryDAO();
        while (true) {
            System.out.println("수정 할 책의 번호를 입력해주세요");
            String temp = sc.nextLine();
            int book_no;
            String title;
            String author;
            String price;
            boolean flag;
            System.out.println("책번호 입력: ");
            book_no = sc.nextInt();
            System.out.println("제목 입력: ");
            title = sc.nextLine();
            System.out.println("지은이 입력: ");
            author = sc.nextLine();
            System.out.println("가격 입력: ");
            price = sc.nextLine();
            flag = dao.updateBook(book_no, title, author, price);
            if (flag) {
            	System.out.println("도서 수정 완료");
            	break;
            } else {
            	System.out.println("해당 도서가 존재하지 않습니다. 도서 번호를 다시 입력하세요.");
            }
            
            
//            int cnt = 0;
//            for (int i = 0; i < list.size(); i++) {
//                if (temp.equals(list.get(i).getbNo())) {
//                    System.out.println("제목 입력: ");
//                    list.get(i).setTitle(sc.nextLine());
//                    System.out.println("지은이 입력: ");
//                    list.get(i).setAuthor(sc.nextLine());
//                    System.out.println("가격 입력: ");
//                    list.get(i).setprice(sc.nextLine());
//                    cnt++;
//                    System.out.println("도서 수정 완료");
//                    break;
//                }
//            } // end for
//            if (cnt == 0) {
//                System.out.println("해당 도서가 존재하지 않습니다. 도서 번호를 다시 입력하세요.");
//            } else {
//                break;// 메인으로
//            }
        } // end while
    }

}
