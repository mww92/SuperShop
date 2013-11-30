package org.example.db.dao;

import static org.junit.Assert.*;

import org.example.db.MockDb;
import org.example.shop.Client;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClientDaoTest {

	ClientDao dao;
	
	@BeforeClass
	public static void initialize()
	{}
	
	@Before
	public void setUp()
	{

		Client c = new Client();
		c.setEmail("a@wp.pl");
		c.setName("Jan");
		c.setSurname("Nowak");
		c.setNumber("1234");
		MockDb db = new MockDb();
		db.save(c);
		dao = new MockClientDaoImpl(db);
	}
	
	@Test
	public void testGet() {
		
		Client c1 = dao.get(1);
		Client c2 = dao.get(2);
		Client c3 = dao.get(1);
		
		assertNotNull("Zwrócono null mimo ze obiekt jest w bazie",c1);
		assertNull("zwrócono wartosc mimo, że nie ma takiego obiektu w bazie",c2);
		assertTrue(c1.getEmail().equals("a@wp.pl"));
		
		assertEquals(c1.getName(),"Jan");
		assertEquals(c1.getSurname(), "Nowak");
		assertEquals(c1.getNumber(),"1234");
		
		assertNotSame(c1,c3);
		
	}

}
