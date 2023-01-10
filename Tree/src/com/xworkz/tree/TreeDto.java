package com.xworkz.tree;

public class TreeDto {
 
	private int slno;
	private String name;
	private String color;
	private String type;
	private int age;
	private Double height;
	
	public TreeDto() {
		
	}
	
	public TreeDto(int slno, String name, String color, String type, int age, Double height) {
		super();
		this.slno = slno;
		this.name = name;
		this.color = color;
		this.type = type;
		this.age = age;
		this.height = height;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "TreeDto [slno=" + slno + ", name=" + name + ", color=" + color + ", type=" + type + ", age=" + age
				+ ", height=" + height + "]";
	}
	
	
		
	
	
}
