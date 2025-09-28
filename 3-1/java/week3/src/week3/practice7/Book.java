package week3.practice7;

class Book {
	// 제목, 저자, 발행년도, 가격
	private String title, writer;
	private int year, price;
	
	// 생성자
	public Book(String title, String writer, int year, int price) {
		this.title = title;
		this.writer = writer;
		this.year = year;
		this.price = price;
	}
	
	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "=> " + title + " by " + writer + ", " + price;
	}
	
}
