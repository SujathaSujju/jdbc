package com.xworkz.watch;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class WatchRunner {
	
	public static void main(String args[]) {

	WatchService service = new WatchServiceImpl();
	
	WatchDto dto1 = new WatchDto(1, "titan", "green", "digital", 500);
	WatchDto dto2 = new WatchDto(2, "ajanta", "red", "analog", 800);
	WatchDto dto3 = new WatchDto(3, "sonata", "black", "smartwatch", 900);
	WatchDto dto4 = new WatchDto(4, "citizen", "grey", "wall", 400);
	WatchDto dto5 = new WatchDto(5, "omega", "white", "wrist", 1000);
	WatchDto dto6 = new WatchDto(6, "rolex", "pink", "digital", 1500);
	WatchDto dto7 = new WatchDto(7, "hublot", "gold", "analog", 1200);
	WatchDto dto8 = new WatchDto(8, "fitbit", "silver", "alarm", 1300);
	WatchDto dto9 = new WatchDto(9, "casio", "blue", "digital", 1100);
	WatchDto dto10 = new WatchDto(10, "cartier", "orange", "wall", 2000);
	WatchDto dto12 = new WatchDto(12, "omega", "white", "Wall", 1000);
	WatchDto dto13 = new WatchDto(13, "omega", "white", "sports", 1000);
	
	WatchDto[] list = {dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10,dto12,dto13};
	
//	for(int i=0;i<list.length;i++) {
//		service.save(list[i]);
//	}
	
//	  for(WatchDto dto : service.findByNameAndColour("omega", "white")){
//		  System.out.println(dto);
//	  }
	
//	System.out.println(service.findByIdAndType(5, "wrist"));
//	
//	System.out.println(service.updateNameById("quartz", 5));
//	
	System.out.println(service.deleteByColourandType("white", "sports"));
	
	 List<WatchDto> DTO=service.read();
	 for (WatchDto read : DTO) {
		 System.out.println(read);
	}
	
	}
	
}
