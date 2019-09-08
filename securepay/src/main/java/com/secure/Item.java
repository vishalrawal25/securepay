package com.secure;

import java.util.Random;

public class Item {


	private String name;
	private Integer price;
	private Integer shippingCost;
	private Integer rating;

	public Item(String name) {
		this.name = name;
		this.price = Util.getRandomNumber(Constants.PRICE_MAX, Constants.PRICE_MIN);
		this.shippingCost = Util.getRandomNumber(Constants.PRICE_MAX, Constants.PRICE_MIN);
		this.rating = Util.getRandomNumber(Constants.RATING_MAX, Constants.RATING_MIN);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(Integer shippingCost) {
		this.shippingCost = shippingCost;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
