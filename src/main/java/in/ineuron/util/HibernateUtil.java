package in.ineuron.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{

	private static SessionFactory sessionFactory;

	// Static block to initialize the session factory
	static
	{
		try
		{
			// Load the configuration from hibernate.cfg.xml file
			Configuration configuration = new Configuration().configure("/in/ineuron/resources/hibernate.cfg.xml");
			// Build the session factory
			sessionFactory = configuration.buildSessionFactory();
		} catch (Throwable ex)
		{
			// If an exception occurs during initialization, throw an error
			throw new ExceptionInInitializerError(ex);
		}
	}

	// Method to get the session factory instance
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	// Method to get a new session instance
	public static Session getSession() throws HibernateException
	{
		return sessionFactory.openSession();
	}

}
