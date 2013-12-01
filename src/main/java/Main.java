import java.sql.Connection;
import java.sql.DriverManager;

import org.example.db.dao.ClientDao;
import org.example.db.dao.HsqlClientDao;
import org.example.shop.Client;


public class Main {

	public static void main(String[] args) {
		
		Connection connection=null;
		try{
			connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			
			
			connection.setAutoCommit(false);
			
			ClientDao dao = new HsqlClientDao(connection);
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
			
			connection.commit();
		
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try{
			if(connection!=null && !connection.isClosed())
			{	
				connection.close();
				connection = null;
			}}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("koniec");
	}

}
