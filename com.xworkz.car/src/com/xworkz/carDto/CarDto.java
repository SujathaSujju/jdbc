package com.xworkz.carDto;

public class CarDto {

	private String Brand;
	private int price;
	private String colour;
	private String type;
	private double speed;
	
	
	public CarDto() {
		System.out.println("Default Constructor");
	}
	
	
	public CarDto(String brand, int price, String colour, String type, double speed) {
		super();
		Brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;
		this.speed = speed;
	}
	
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "CarDto [Brand=" + Brand + ", price=" + price + ", colour=" + colour + ", type=" + type + ", speed="
				+ speed + "]";
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDto other = (CarDto) obj;
		if (Brand == null) {
			if (other.Brand != null)
				return false;
		} else if (!Brand.equals(other.Brand))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (price != other.price)
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
}
