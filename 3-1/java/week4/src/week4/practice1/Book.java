package week4.practice1;

public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // 내부에서 비교할 수 있는 메소드
    public boolean isEqual(Book otherBook) {
        // this 객체의 title과 author와 비교
    	// equals() : 문자열 비교하기 위한 함수
        return this.title.equals(otherBook.getTitle()) && this.author.equals(otherBook.getAuthor());
    }

}
