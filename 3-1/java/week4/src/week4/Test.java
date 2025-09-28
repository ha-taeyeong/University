package week4;
/*
 * 	Pbook(종이책) : size(문고판, 보급판, 대형판), bind(…)
	Ebook(전자책) : filesize, format
	공통속성 	: 제목, 페이지수, 지은이
         	: 정보제공(제목, 페이지수, 지은이)

 */
public class Test {

	public static void main(String[] args) {
//		Book book = new Book();
//		book.bind = "softcopy"; 자식객체-부모객체 사용가능하지만, 부모객체-자식객체 사용가능
//		Pbook pbook = new Pbook();
		Book book = new Pbook(); // 상속관계인 경우 자식 타입은 부모 타입으로 자동 형변환이 된다.
		book = new Ebook(); // 부모 타입으로 변환이 되었기 떄문에, 자식객체를 사용할 수 없다.
		book.title = "java";
		book.write();
	}

}
