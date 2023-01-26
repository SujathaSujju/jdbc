package main.java.com.xworkz.carrom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrom")
public class CarromDto {

	@Id
	private int id;
	private String brandname;
	private int price;
	private String size;
	private String strickercolor;
	
	
	
	public CarromDto() {
		super();
	}
	public CarromDto(int id, String brandname, int price, String size, String strickercolor) {
		super();
		this.id = id;
		this.brandname = brandname;
		this.price = price;
		this.size = size;
		this.strickercolor = strickercolor;
	}
	@Override
	public String toString() {
		return "CarromDto [id=" + id + ", brandname=" + brandname + ", price=" + price + ", size=" + size
				+ ", strickercolor=" + strickercolor + "]";
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getStrickercolor() {
		return strickercolor;
	}
	public void setStrickercolor(String strickercolor) {
		this.strickercolor = strickercolor;
	}
	
	
}
