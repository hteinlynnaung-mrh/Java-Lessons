class Customer {
	
	private String name;
	private String phone;
	
	Customer() {
		this.name = "Guest";
		this.phone = "N/A";
	}
	
	Customer(String name) {
		this.name = name;
		this.phone = "N/A";
	}
	
	Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}

}
