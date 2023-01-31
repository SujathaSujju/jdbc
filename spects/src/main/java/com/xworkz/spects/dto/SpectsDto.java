package main.java.com.xworkz.spects.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="spects")
@NamedQuery(name="readAll",query="select dto from SpectsDto dto")
@NamedQuery(name="findByShapeAndPrice",query="select check from SpectsDto check where check.shape=:sh and check.price=:pr")
@NamedQuery(name="updatePriceByName",query="update SpectsDto dto set dto.price=:pr where dto.name=:nm")
@NamedQuery(name="updateColorByPriceAndShape",query="update SpectsDto dto set dto.color=:clr where dto.price=:pr and dto.shape=:sh")
@NamedQuery(name="deleteByPriceAndColor",query="delete from SpectsDto dto where dto.price=:pr and dto.color=:clr")
@NamedQuery(name="deleteByNameAndId",query="delete from SpectsDto dto where dto.name=:nm and dto.id=:id")
public class SpectsDto {

	@Id
	private int id;
	private String name;
	private String color;
	private String shape;
	private int price;
	
	
	
	@Override
	public String toString() {
		return "SpectsDto [id=" + id + ", name=" + name + ", color=" + color + ", shape=" + shape + ", price=" + price
				+ "]";
	}

	public SpectsDto() {
		
	}
	
	public SpectsDto(int id, String name, String color, String shape, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.shape = shape;
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
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
