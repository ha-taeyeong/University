package week4.practice1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("혼공자", "신용권");

        isCheck(book1, book2);
        isCheck(book2, book3);
    }

    public static void isCheck(Book book1, Book book2) {
        if (book1.isEqual(book2)) {
        	System.out.printf("book1 => 책 제목: %s, 저자: %s \n", book1.getTitle(), book1.getAuthor());
        	System.out.printf("book2 => 책 제목: %s, 저자: %s \n", book2.getTitle(), book2.getAuthor());
            System.out.println("boo1과 book2 필드 멤버값이 동일합니다.");
        } else {
        	System.out.printf("book1 => 책 제목: %s, 저자: %s \n", book1.getTitle(), book1.getAuthor());
        	System.out.printf("book2 => 책 제목: %s, 저자: %s \n", book2.getTitle(), book2.getAuthor());
        	System.out.println("boo1과 book2 필드 멤버값이 서로 다릅니다.");
        }
    }
}
