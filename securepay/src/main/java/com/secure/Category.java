package com.secure;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private String name;
	private List<Item> itemList = new ArrayList<Item>();
	
	public Category() {
	}

	public Category(String name, List<Item> itemList) {
		this.name = name;
		this.itemList = itemList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}
