import java.util.ArrayList;

import org.example.shop.Address;
import org.example.shop.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Address adres = new Address();
		adres.setCity("Gdańsk");
		adres.setHouseNumber("55");
		adres.setStreet("Brzegi");
		adres.setPostalCode("80-300");
		adres.setLocalNumber(1);
		
		Client c = new Client();
		c.setAddresses(new ArrayList<Address>());
		c.getAddresses().add(adres);
		adres.setClient(c);
		
		c.setName("Jan");
		c.setSurname("Kowalski");
		c.setNumber("AB1234");
		c.setEmail("j.kowalski@onet.pl");
		
		session.persist(c);
		
		session.getTransaction().commit();
		
		System.out.println("koniec");
	}

}
