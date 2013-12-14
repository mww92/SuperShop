import java.sql.Connection;
import java.sql.DriverManager;

import org.example.db.HsqlUnitOfWork;
import org.example.db.dao.ClientDao;
import org.example.db.dao.HsqlClientDao;
import org.example.db.dao.HsqlProductDao;
import org.example.shop.Client;
import org.example.shop.Product;


public class Main {

	public static void main(String[] args) {
		
		
		
			HsqlUnitOfWork uow = new HsqlUnitOfWork();
			ClientDao dao = new HsqlClientDao(uow);
			Client c = new Client();
			
			c.setEmail("a@wp.pl");
			c.setName("Jan");
			c.setSurname("Nowak");
			c.setNumber("1234");
			c.setId(0);
			
			Client c1 = new Client();
			c1.setId(0);
			dao.delete(c1);
			dao.save(c);
			uow.commit();
			uow.close();
		System.out.println("koniec");
	}

}
