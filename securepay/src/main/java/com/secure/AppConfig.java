package com.secure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {
	
	@Bean(name="dataLoader")
	public DataLoaderService getDataLoader(){
		return new DataLoaderService();
	}
	
	@Bean(name="basketCreator")
	public BasketCreatorService getBasketCreator(){
		return new BasketCreatorService();
	}
	
}