package week3.practice4;

class Date {
	// 필드 선언
	private int year, month, day;
	
	// 생성자
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print1() {
		System.out.println(year + "." + month + "." + day);
		
	}
	public void print2() {
		String[] strMonth= {"Januar", "February", "March", "April", "May", "June", "July",
							"August", "September", "October", "November", "December"};
		
		
		System.out.println(strMonth[month-1] + " " + day + ", " + year);
	}
	public String toString() {
		return year+"/"+month+"/"+day;
	}
}
