package week4.practice5;

class Book {

	// 객체 선언
	private String title, writer;
	private int pages;
	
	// 생성자
	public Book(String title, String writer, int pages) {
		this.title = title;
		this.writer = writer;
		this.pages = pages;
	}
	
	// getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// toString
	@Override
	public String toString() {
		return "책이름: " + title + "\n페이지수: " + pages + "\n저자: " + writer;
	}
	
}
