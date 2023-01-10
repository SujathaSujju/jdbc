package com.xworkz.shoes.Shoesdto;

public class ShoesDto {

	private int id;
	private String brandName;
	private int size;
	private String color;
	private int price;
	
	public ShoesDto() {
		
	}
	
	public ShoesDto(int id, String brandName, int size, String color, int price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.size = size;
		this.color = color;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoesDto [id=" + id + ", brandName=" + brandName + ", size=" + size + ", color=" + color + ", price="
				+ price + "]";
	}
	
	
}
