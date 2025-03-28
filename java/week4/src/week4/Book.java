package week4;

class Book {
	String title, author;
	int pagecnt;
	
	protected void write() { // protected : 패키지가 달라도 상속 가능
		System.out.printf("title = %s, author = %s, pagecnt = %d\n", title, author, pagecnt);
	}
}
