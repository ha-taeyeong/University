package week4.practice4;

class Person {
	
	private String name, address, phone;

	public Person(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", phone=" + phone + "\n";
	}
	
}
