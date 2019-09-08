package com.secure;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class BasketCreatorServiceTest {

	@Autowired
    @Qualifier("basketCreator")
    BasketCreatorService basketCreator;
    
    @Test
    public void testBasket() {
    	Category category1 = new Category();
    	category1.setName("C1");
    	
    	Category category2 = new Category();
    	category2.setName("C2");
    	
    	Item item1 = new Item("I1");
    	item1.setRating(5);
    	item1.setPrice(10);
    	item1.setShippingCost(20);
    	
    	Item item2 = new Item("I2");
    	item2.setRating(4);
    	item2.setPrice(10);
    	item2.setShippingCost(10);
    	
    	category1.setItemList(Arrays.asList(item1));
    	category2.setItemList(Arrays.asList(item2));
    	
    	basketCreator.createBasket(Arrays.asList(category1, category2));
        Assert.assertEquals("Total Cost: 50", "Total Cost: " + (item1.getPrice() + item1.getShippingCost() + item2.getPrice() + item2.getShippingCost()));


    }
}