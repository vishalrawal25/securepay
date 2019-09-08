package com.secure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DataLoaderService dataLoader = context.getBean("dataLoader", DataLoaderService.class);
		dataLoader.createCategoriesAndItems();
	
	}
}