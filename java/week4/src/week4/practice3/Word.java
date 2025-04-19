package week4.practice3;

class Word{
	//영어 단어 저장을 위한 필드, private
	//영 단어에 대한 뜻을 저장하는 필드, private
	private String eng, kor;

	//생성자 – 매개변수로 받은 값을 필드로 초기화
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	//모든 필드에 대한 getter 메소드
	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}	
	
	//매개변수로 받은 문자열이 현재 객체가 가지는 영 단어와 일치하는지 검사하여 true, false를 반환하는 engComp() 메소드 
	public boolean wordComp(String search) {
        return this.eng.equals(search);
    }

	//객체 내용을 문자열로 반환하는 toString() 메소드
	@Override
	public String toString() {
		return "eng [eng=" + eng + ", kor=" + kor + "]";
	}
	
}
