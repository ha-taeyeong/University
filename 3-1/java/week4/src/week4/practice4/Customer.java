package week4.practice4;

class Customer extends Person {
	
	private String customerNumber;
	private int mileage;
	
	public Customer(String name, String address, String tel, String customerNumber, int mileage) {
		super(name, address, tel);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		String str = super.toString();
		return str + "customerNumber=" + customerNumber + ", mileage=" + mileage + "\n";
	}

}
