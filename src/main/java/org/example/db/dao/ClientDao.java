package org.example.db.dao;

import org.example.db.Dao;
import org.example.shop.Client;

public interface ClientDao extends Dao<Client>{
	
	public void setAddresses(Client c);
	public void setOrders(Client c);
}
