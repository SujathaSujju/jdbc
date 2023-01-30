package main.java.com.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "bulb")
@NamedQuery(name="readAll",query="select read from BulbDto read ")
@NamedQuery(name="findByName",query="select find from BulbDto find where find.brandName=:nm")
public class BulbDto {

	@Id
	private int id;
	private String brandName;
	private String voltage;
	private String type;
	private String colour;
	
	public BulbDto() {
		System.out.println("default constructor");
	}
	
	public BulbDto(int id, String brandName, String voltage, String type, String colour) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.voltage = voltage;
		this.type = type;
		this.colour = colour;
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
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "BulbDto [id=" + id + ", brandName=" + brandName + ", voltage=" + voltage + ", type=" + type
				+ ", colour=" + colour + "]";
	}

	
	
}
