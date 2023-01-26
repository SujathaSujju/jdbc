package main.java.com.xworkz.cake.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cake")


public class CakeDto {
	
	@Id
	private int id;
	private String name;
	private String color;
	private String weight;
	private int price;
	
	
	
	
	@Override
	public String toString() {
		return "CakeDto [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + ", price=" + price
				+ "]";
	}
	public CakeDto() {
		super();
	}
	public CakeDto(int id, String name, String color, String weight, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.price = price;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
