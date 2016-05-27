package nba.statistic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import nba.statistic.entity.City;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City beograd = new City();
		beograd.setName("New York");
		
		Session s = getSessionFactory().openSession();
		Transaction t= s.beginTransaction();
		s.save(beograd);
		s.getTransaction().commit();
		s.close();
		
		

	}

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration().configure();

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}
}
