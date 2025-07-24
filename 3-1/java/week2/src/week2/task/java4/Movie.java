package week2.task.java4;
/*
 * 영화 Movie 클래스를 정의하여 하시오.
 * Movie 클래스는 영화 제목, 평점, 감독, 발표된 연도 등의 필드를 가진다.
 * Movie 클래스를 작성하고 객체를 생성하여 모든 필드 정보를 출력한다.
 * 필드는 객체 생성시 생성자를 호출하여 초기화 한다
 */
class Movie {
	
	private String title	; // 제목
	private String director	; // 감독
	private String year		; // 발표된 연도
	private int rating		; // 평점
	
	// 생성자 호출하여 초기화
	public Movie(String title, String director, String year, int rating) {
		
		this.title		= title		;
		this.director 	= director	;
		this.year 		= year		;
		this.rating 	= rating	;
	
	}
	
	// 모든 필드 정보 출력 메소드
	public void show() {
		
		System.out.println("영화 제목: " + title + "\n감독: " + director + "\n평점: " + rating + "\n발표 연도: " + year);
		
	}
	

}
