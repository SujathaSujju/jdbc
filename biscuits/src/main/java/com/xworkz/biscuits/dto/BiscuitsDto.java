package main.java.com.xworkz.biscuits.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="biscuits")
public class BiscuitsDto {

	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private String flavour;
	
	
	
	public BiscuitsDto() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "BiscuitsDto [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", flavour="
				+ flavour + "]";
	}



	public BiscuitsDto(int id, String name, int price, String type, String flavour) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.flavour = flavour;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	
	
}
