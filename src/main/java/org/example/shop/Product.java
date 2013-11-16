package org.example.shop;

import org.example.db.EntityBase;

public class Product extends EntityBase{
	
	private String name;
	private String description;
	private double prize;
	
	//relacje product - zamowienie
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	
}
