package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.config.ApplicationConfiguration;
import com.pack.model.Country;

public class CountryMain {
public static void main(String[] args) {
	  ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

	  Country obj =(Country) appContext.getBean("countryObj");
	  System.out.println(obj.getCountryName());
}
}
