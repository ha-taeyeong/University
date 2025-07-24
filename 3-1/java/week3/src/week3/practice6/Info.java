package week3.practice6;

class Info {
	// id, pass 객체 선언
	private String id, pass;
	private static int count = 0;

	// 생성자
	public Info(String id) {
		this.id = id;
		count++; // 객체가 생성될 때마다 증가
		this.pass = generatePassword(id, count);
	}
	
    // 비밀번호 생성 메서드 (Math.random() 사용)
    private String generatePassword(String id, int count) {
        int randomNum = (int)(Math.random() * 90) + 10; // 10~99 사이의 난수 생성
        return id + count + randomNum;
    }
	
	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass() {
		this.pass = generatePassword(this.id, count);
	}

	// toString
	@Override
	public String toString() {
		return "Info [아이디=" + id + ", 비밀번호=" + pass + "]";
	}
	
}
