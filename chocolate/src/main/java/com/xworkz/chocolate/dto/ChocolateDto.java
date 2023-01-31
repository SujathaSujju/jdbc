package main.java.com.xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="chocolate")
@NamedQuery(name="readAll",query="select dto from ChocolateDto dto")
@NamedQuery(name="findByColorAndWeight" ,query="select dto from ChocolateDto dto where dto.color=:clr and dto.weight=:wg")
@NamedQuery(name="findByPriceAndName",query="select dto from ChocolateDto dto where dto.price=:pr and dto.name=:nm")
@NamedQuery(name="updateWeightByNameAndColor",query="update ChocolateDto dto set dto.weight=:wg where dto.name=:nm and dto.color=:clr")
@NamedQuery(name="updateNameByIdAndWeight",query="update ChocolateDto dto set dto.name=:nm where dto.id=:id and dto.weight=:wg")
@NamedQuery(name="deleteByColorAndName",query="delete from ChocolateDto dto where dto.color=:clr and dto.name=:nm")

public class ChocolateDto {

	@Id
	private int id;
	private String name;
	private int price;
	private String weight;
	private String color;
	
	
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ChocolateDto(int id, String name, int price, String weight, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}
	public ChocolateDto() {
		super();
	}
	@Override
	public String toString() {
		return "ChocolateDto [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", color="
				+ color + "]";
	}
	
	
	
}
