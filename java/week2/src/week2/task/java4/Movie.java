package week2.task.java4;

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
