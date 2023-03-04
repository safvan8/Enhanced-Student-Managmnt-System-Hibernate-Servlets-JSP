package in.ineuron.dao.dboperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Student;

public class SelectStudent
{
	private static SelectStudent selectStudent = null;
	private Connection connection;
	private String sqlSelectQuery = null;

	// restrict Object creation outside class
	private SelectStudent()
	{
	}

	// factory method- singleton
	public static SelectStudent getSelectStudent()
	{
		if (selectStudent == null)
			selectStudent = new SelectStudent();

		return selectStudent;
	}

	public Student findById(Integer sid)
	{
		System.out.println("SelectStudent.findById()...................\n");

		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Student student = session.get(Student.class, sid);

		return student;
	}
}
