package org.example.shop;

import java.util.Date;
import java.util.List;

import org.example.db.EntityBase;

public class Order extends EntityBase {
	
	private String number;
	private Date date;
	
	//relacja zamowienie - klient
	private Client client;
	//relacja zamowienie - product
	private List<Product> products;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	} 
	
	
}
