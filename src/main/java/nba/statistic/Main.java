package nba.statistic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import dao.CityDao;
import nba.statistic.entity.City;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City beograd = new City();
		beograd.setName("New York");

		CityDao.saveCity(beograd);

		

	}

}
