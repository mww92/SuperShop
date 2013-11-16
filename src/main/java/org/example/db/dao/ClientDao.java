package org.example.db.dao;

import java.util.List;

import org.example.db.Dao;
import org.example.shop.Client;
import org.example.shop.Order;

public interface ClientDao extends Dao<Client> {
	
	List<Order> getOrders(Client c);
	
}
