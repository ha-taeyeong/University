package week4.practice5;

class Magazine extends Book {
	
	// 객체 선언
	private String date;
	
	// 생성자
	public Magazine(String title, int pages, String writer, String date) {
		super(title, writer, pages);
		this.date = date;
	}

	// getter, setter
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + "\n발매일: " + date + "\n";
	}
	
}
