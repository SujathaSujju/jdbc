package com.xworkz.shoes;

public enum sqlCrendential {
	
	URL("jdbc:mysql://localhost:3306/XWORKZ"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	String value;
	
	private sqlCrendential(String value) {
		this.value=value;
	}

	public String getvalue() {
		return value;
	}
}
