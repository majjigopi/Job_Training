package com.bharath.spring.springcore.assignment;

public class ShoppingCart {
	
	Item item;

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
