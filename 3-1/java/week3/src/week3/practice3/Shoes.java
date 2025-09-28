package week3.practice3;

class Shoes {

	private int size;
	private int cnt;
	private String type;

	public Shoes(int size, int cnt, String type) {
		this.size = size;
		this.cnt = Math.max(cnt, 0);
		this.type = (type != null) ? type : "알 수 없음";
	}
	
	int getSize() {
		return size;
	}
	
	int getCnt() {
		return cnt;
	}
	
	String getType() {
		return type;
	}
	
	boolean sell(int cnt) {
		if(cnt <= 0 || this.cnt < cnt) {
			return false;
		}
		this.cnt -= cnt;
		return true;
	}
	int add(int cnt) {
		if(cnt <=0) {
			return this.cnt = cnt;
		} else {
			return this.cnt += cnt;
		}
	}
	
	@Override
	public String toString() {
		return "신발 [종류=" + type + ", 사이즈=" + size + ", 재고=" + cnt +"]"; 
	}
}
