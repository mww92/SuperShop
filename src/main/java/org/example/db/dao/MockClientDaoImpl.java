package org.example.db.dao;

import java.util.ArrayList;
import java.util.List;

import org.example.db.EntityBase;
import org.example.db.MockDb;
import org.example.shop.Client;
import org.example.shop.Order;

public class MockClientDaoImpl implements ClientDao{

	private MockDb db;
	
	
	
	public MockClientDaoImpl(MockDb db) {
		this.db = db;
	}

	public void save(Client obj) {
		db.addToList(obj);
		
	}

	public void delete(Client obj) {
		db.getItems().remove(obj);
	}

	public void update(Client obj) {
		
	}

	public List<Client> getAll() {
	
		List<Client> result = new ArrayList<Client>();
		for(EntityBase ent: db.getItems())
		{
		     if(ent instanceof Client)
				result.add((Client) ent);
		}
		return result;
	}

	public Client get(int id) {
		
		for(Client c : getAll())
		{
			if(c.getId()==id)
				return c;
		}
		return null;
	}

	public List<Order> getOrders(Client c) {
		
		return c.getOrders();
	}

}
