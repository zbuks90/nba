package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import nba.statistic.entity.City;

public class CityDao {
	
	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration().configure();

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
		
		
	}
	
	public static City saveCity(City c){
		
		Session s = getSessionFactory().openSession();
		Transaction t= s.beginTransaction();
		s.save(c);
		s.getTransaction().commit();
		s.close();
		
		return c;
	}

}
