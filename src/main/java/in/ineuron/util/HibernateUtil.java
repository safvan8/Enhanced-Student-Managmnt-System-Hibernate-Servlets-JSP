package in.ineuron.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil
{

	static Configuration configuration = null;
	static SessionFactory sessionFactory = null;
	static Session session = null;
	static
	{
		try
		{
			Configuration configuration = new Configuration();
			configuration.configure("/in/ineuron/resources/hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		} catch (HibernateException e)
		{
			e.printStackTrace();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static Session getSession()
	{
		if (session == null)
			session = sessionFactory.openSession();
		return session;
	}

	public static void closeSession(Session session)
	{
		if (session != null)
		{
			session.close();
		}
	}

	public static void closeSessionFactory()
	{
		if (sessionFactory != null)
		{
			sessionFactory.close();
		}
	}

}
