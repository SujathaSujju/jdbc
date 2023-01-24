package com.xworkz.ac;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.service.Service;

import com.xworkz.ac.config.ACconfig;
import com.xworkz.ac.dto.ACdto;

public class ACrunner {

	
	public static void main(String args[]) {
		
		ACdto dto = new ACdto(1, "voltas", 15000, "1.5 tons", "white");
		
		ACdto dto1 = new ACdto(2, "whirlpool", 18000, "1.3 tons", "grey");
		
		ACdto dto2 = new ACdto(3, "LG", 20000, "1.2 tons", "aqua blue");
		
		Session session = ACconfig.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		//		session.save(dto);
//		session.save(dto1);
//		session.save(dto2);
		
		
//		System.out.println(session.get(ACdto.class, 2));
	
		Criteria criteria = session.createCriteria(ACdto.class);
		
	List<ACdto>	data=criteria.list();
for(ACdto list:data) {
	System.out.println(list);
}
		
	   
	   	   
	   
	   transaction.commit();
	   session.close();
		
		
	}
}
