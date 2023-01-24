package com.xworkz.ac.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.ac.dto.ACdto;

public class ACconfig {

	public static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory(){
		
		if(sessionFactory==null) {
			
			Configuration config = new Configuration();
			
			Properties properties = new Properties();
			
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/XWORKZ");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.SHOW_SQL, "true");
//			properties.put(Environment.HBM2DDL_AUTO, "create-drop");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			
			config.setProperties(properties);
			config.addAnnotatedClass(ACdto.class);
			ServiceRegistry service	= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
			sessionFactory = config.buildSessionFactory(service);
			
			return sessionFactory;
			
		}
		
		return sessionFactory;
		
	}
}
