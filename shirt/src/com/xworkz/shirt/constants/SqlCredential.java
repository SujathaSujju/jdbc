package com.xworkz.shirt.constants;

public enum SqlCredential {

	URL("jdbc:mysql://localhost:3306/XWORKZ"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
String value;
	
	private SqlCredential(String value) {
		this.value=value;
	}

	public String getvalue() {
		return value;
	}
	
   }
