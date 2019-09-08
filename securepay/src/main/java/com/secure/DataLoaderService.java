package com.secure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("dataLoader")
public class DataLoaderService {
	
	@Autowired
	BasketCreatorService basketCreatorService;
	
	@Value("#{'${Categories}'.split(',')}") 
	private List<String> categoryNameList;
	
	@Value("#{'${Items}'.split(',')}") 
	private List<String> itemNameList;
	
	List<Category> categoryList = new ArrayList<Category>();
	
	public void createCategoriesAndItems() {
		
		for (String categoryName : categoryNameList) {
			 categoryList.add(new Category(categoryName, createItems()));
		}
		
		basketCreatorService.createBasket(categoryList);
		
	}

	public List<Item> createItems() {
		List<Item> itemList = new ArrayList<Item>();
		for (String itemName : itemNameList) {
			itemList.add(new Item(itemName));
		}
		return itemList;
	}
}