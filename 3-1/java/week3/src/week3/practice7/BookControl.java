package week3.practice7;

public class BookControl {

	public static void searchPrice(Book[] books, int price) {
		System.out.println("가격 " + price + "이상 책 검색");
		
		for(Book book : books) {
			if (book.getPrice() >= price) {
				System.out.println(book);
			}
		}
	}

	public static void searchTitle(Book[] books, String writer) {
		System.out.println("\n" + writer + "의 책들 조회");
		
		for(Book book : books) {
			if (book.getWriter().equals(writer)) {
				System.out.println(book);
			}
		}
	}

}
