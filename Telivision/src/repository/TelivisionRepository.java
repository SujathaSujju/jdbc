package repository;

import java.util.ArrayList;

import com.xworkz.telivision.TelivisionDto;

public interface TelivisionRepository {

	public boolean save(TelivisionDto dto);
	
	public ArrayList<TelivisionDto> read();
	
	public ArrayList<TelivisionDto> findByNameAndSize(String name,String size);
	
	public TelivisionDto findTypeAndColourByIndex(String type,String colour,int index);
	
	public TelivisionDto updateSizeByType(String size,String type);
	
}
