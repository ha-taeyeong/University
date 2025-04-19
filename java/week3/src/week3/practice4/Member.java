package week3.practice4;

class Member {
	private int memberId;
	private String name;
	private Date birthDate; // 집합 관계
	
	public Member(String name, Date date) {
		this.memberId=(int)(Math.random()*90)+10;
		this.name = name;
		this.birthDate = date; // 사용 관계
	}
	
	@Override
	public String toString() {
		return "회원 번호: " + memberId + "\n이름: " + name + "\n생년월일: " + birthDate;
		
	}
}
