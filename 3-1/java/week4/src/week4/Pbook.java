package week4;

class Pbook extends Book{
	String bind, sizeBook;
	// overriding
	@Override // 자식에 기재한다, 주석의 의미, 가독성, 오버라이드 체크
	public void write() { // 접근제한자 같거나 확장해야한다.
//		System.out.printf("title = %s, author = %s, pagecnt = %d\n", title, author, pagecnt);
//		write(); // 부모에 있는 메소드 X, 재귀 호출이 된다.
		super.write(); // 부모이 있는 메소드 O
		System.out.printf("bind = %s, sizeBook = %s \n", bind, sizeBook);
	}
}
