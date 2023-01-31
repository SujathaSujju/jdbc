package main.java.com.xworkz.chocolate.repo;

import java.util.List;

import main.java.com.xworkz.chocolate.dto.ChocolateDto;

public interface ChocolateRepo {

	public boolean save(ChocolateDto dto);

	public List<ChocolateDto> readAll();

	public boolean findByColorAndWeight(String color,String weight);

	public boolean findByPriceAndName(int price,String name);

	public boolean updateWeightByNameAndColor(String weight,String name,String color);

	public boolean updateNameByIdAndWeight(String name,int id,String weight);

	public boolean deleteByColorAndName(String color,String name);

}
