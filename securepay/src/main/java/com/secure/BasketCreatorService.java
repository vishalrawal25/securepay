package com.secure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("basketCreator")
public class BasketCreatorService {
	
	final static Logger logger = Logger.getLogger(BasketCreatorService.class);
	
	public void createBasket(List<Category> categoryList) {
		Set<String> categorySet = new HashSet<String>();
		List<Category> resultList = new ArrayList<Category>();
		Integer totalCost = 0;
		Integer rating = 5;
		
		
		while (rating >= Constants.RATING_MIN) {
			for (Category category : categoryList) {
				if (!categorySet.contains(category.getName())) {
					for (Item item : category.getItemList()) {
						if (item.getRating() == rating) {
							if (totalCost + item.getPrice() + item.getShippingCost() <= 50) {
								Category resultCategory = new Category();
								resultCategory.setName(category.getName());
								resultCategory.setItemList(Arrays.asList(item));
								resultList.add(resultCategory);
								categorySet.add(category.getName());
								
								totalCost += item.getPrice() + item.getShippingCost();
								break;
							}
						}
					
					}
				}
			}
			--rating;
		}
		
		printResult(resultList);
	}
	
	private void printResult(List<Category> categoryList) {
		Integer totalCost = 0;
		Integer totalRating = 0;
		
		for (Category category : categoryList) {
			logger.info(category.getName() + " : " +  category.getItemList().get(0).getName());
			totalCost += category.getItemList().get(0).getPrice() + category.getItemList().get(0).getShippingCost();
			totalRating += category.getItemList().get(0).getRating();
			
		}
		logger.info("Total Cost: " + totalCost);
		logger.info("Total Rating: " + totalRating);
	}

}
