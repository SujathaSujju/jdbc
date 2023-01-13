package com.xworkz.shirt.dto;

public class ShirtDto {

	private int id;
	private String brandname;
	private String colour;
	private String size;
	private boolean haspocket;
	
	
	public ShirtDto() {
		
	}
	
	public ShirtDto(int id, String brandname, String colour, String size, boolean haspocket) {
		super();
		this.id = id;
		this.brandname = brandname;
		this.colour = colour;
		this.size = size;
		this.haspocket = haspocket;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isHaspocket() {
		return haspocket;
	}
	public void setHaspocket(boolean haspocket) {
		this.haspocket = haspocket;
	}

	@Override
	public String toString() {
		return "ShirtDto [id=" + id + ", brandname=" + brandname + ", colour=" + colour + ", size=" + size
				+ ", haspocket=" + haspocket + "]";
	}
	
	
}
