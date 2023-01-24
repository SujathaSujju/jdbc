package com.xworkz.ac.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="AC")
public class ACdto {

	@Id
	private int id;
	private String name;
	private int price;
	private String capacity;
	private String color;
	
	
	public ACdto() {
		
	}
	
	public ACdto(int id, String name, int price, String capacity, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.capacity = capacity;
		this.color = color;
	}

	@Override
	public String toString() {
		return "ACdto [id=" + id + ", name=" + name + ", price=" + price + ", capacity=" + capacity + ", color=" + color
				+ "]";
	}
	
	
	
}
