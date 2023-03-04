package in.ineuron.dao.dboperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pojo.Student;

// to update existing student details
public class UpdateStudent
{
	private static UpdateStudent updateStudent = null;
	private static Connection connection = null;
	private static PreparedStatement preparedStatement;

	// restrict student creation outside object
	private UpdateStudent()
	{
	}

	public static UpdateStudent getUpdateStudent()
	{
		if (updateStudent == null)
			updateStudent = new UpdateStudent();
		return updateStudent;
	}

	public String updateById(Student student)
	{
		System.out.println("UpdateStudent.updateById()......................");
		String updateExecutionResult = "";

		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		boolean flag = false;

		try
		{
			transaction = session.beginTransaction();

			// updatig
			session.update(student);

			flag = true;

		} catch (HibernateException he)
		{
			he.printStackTrace();

		} finally
		{
			if (flag)
				transaction.commit();
			else
				transaction.rollback();
		}

		if (flag)
			updateExecutionResult = "success";
		else
			updateExecutionResult = "failed";

		return updateExecutionResult;
	}
}
