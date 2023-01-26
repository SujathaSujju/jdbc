package main.java.com.xworkz.cake;

import main.java.com.xworkz.cake.dto.CakeDto;
import main.java.com.xworkz.cake.service.CakeService;
import main.java.com.xworkz.cake.service.CakeServiceImpl;

public class CakeTester {

public static void main(String[] args) {
		
		CakeService service = new CakeServiceImpl();
		
		
		CakeDto dto7 = new CakeDto(1,"black forest","black", "500gram",700);
		CakeDto dto1 = new CakeDto(2,"cupcake","brown", "100gram",100);
		CakeDto dto2 = new CakeDto(3,"plum cake","green", "500gram",1000);
		CakeDto dto3 = new CakeDto(4,"VenillaCake","white", "250gram",100);
		CakeDto dto4 = new CakeDto(5,"StrawberryCake","pink", "500gram",300);
		CakeDto dto5 = new CakeDto(6,"VelvetCake","purple", "750gram",800);
		CakeDto dto6 = new CakeDto(7,"pine apple","pineapple", "250gram",1200);
		
//	       boolean status = service.save(dto7);
//	       service.save(dto1);
//	        service.save(dto2);
//	        service.save(dto3);
//	        service.save(dto4);
//	        service.save(dto5);
//	        service.save(dto6);
//	        
//	      System.out.println(status);
	       
	       
//	       System.out.println(service.findNameById(3));
//	       
//	       System.out.println(service.updateNameById("BlackForest",3 ));
//	
//	       
//	       System.out.println(service.deleteNameByID("FruitsCake", 7));
	       
	
	}

}

