package com.xworkz.bag;

public class BagDto {

	private int id;
	private String name;
	private String colour;
	private int price;
	private String capacity;
	
	public BagDto() {
		
	}
	
	
	public BagDto(int id, String name, String colour, int price, String capacity) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.capacity = capacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "BagDto [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + ", capacity="
				+ capacity + "]";
	}
	
	
}
