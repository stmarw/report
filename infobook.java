package Team;

public class infobook {
	// 책 정보 수정
    public void updateBook() {
        while (true) {
            System.out.println("수정 할 책의 번호를 입력해주세요");
            String temp = sc.nextLine();
            int cnt = 0;
            for (int i = 0; i < list.size(); i++) {
                if (temp.equals(list.get(i).getbNo())) {
                    System.out.println("제목 입력: ");
                    list.get(i).setTitle(sc.nextLine());
                    System.out.println("지은이 입력: ");
                    list.get(i).setAuthor(sc.nextLine());
                    System.out.println("가격 입력: ");
                    list.get(i).setprice(sc.nextLine());
                    cnt++;
                    System.out.println("도서 수정 완료");
                    break;
                }
            } // end for
            if (cnt == 0) {
                System.out.println("해당 도서가 존재하지 않습니다. 도서 번호를 다시 입력하세요.");
            } else {
                break;// 메인으로
            }
        } // end while
    }

}
