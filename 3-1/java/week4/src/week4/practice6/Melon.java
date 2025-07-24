package week4.practice6;

class Melon extends Food {

	private String info;

	public Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "cal = " + super.getCal() + "  cost=" + super.getCost() + "  kg=" + super.getKg() + "  경작농원=" + info;
	}
	
}
