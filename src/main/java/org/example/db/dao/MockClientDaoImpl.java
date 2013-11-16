package org.example.db.dao;

import java.util.ArrayList;
import java.util.List;

import org.example.db.EntityBase;
import org.example.db.MockDb;
import org.example.shop.Client;
//koment
public class MockClientDaoImpl implements ClientDao{

	private MockDb db;
	
	
	
	public MockClientDaoImpl(MockDb db) {
	
		this.db = db;
	}

	public void save(Client ent) {
		db.save(ent); 
		
	}

	public void delete(Client ent) {
		db.getItems().remove(ent);
		
	}

	public List<Client> getAll() {
		List<Client> result = new ArrayList<Client>();
		for(EntityBase ent: db.getItems())
		{
			if(ent instanceof Client)
				result.add((Client)ent);
		}
		
		return result;
	}

	public Client get(int id) {
		for(Client c: getAll())
		{
			if(c.getId()==id)
				return c;
		}
		return null;
	}

	public void setAddresses(Client c) {
		
		
	}

	public void setOrders(Client c) {
		
		
	}

}
