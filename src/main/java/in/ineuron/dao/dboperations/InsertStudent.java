package in.ineuron.dao.dboperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.util.HibernateUtil;
import in.ineuron.dto.Student;

// class to perform insert operations
public class InsertStudent
{
	private static InsertStudent insertStudent = null;

	// making class singleton
	private InsertStudent()
	{
	}

	public static InsertStudent getInsertStudent()
	{
		System.out.println("InsertStudent.getInsertStudent()...........\n");

		if (insertStudent == null)
			insertStudent = new InsertStudent();

		return insertStudent;
	}

	// to insert student record in to DB
	public Integer save(Student student)
	{
		System.out.println("InsertStudent.save()................\n");
		int generatedSId = 0;

		// creating session object by calling utility method
		Session session = HibernateUtil.getSession();

		boolean isOperationSuceess = false;
		// getting transaction -> to setAutocommit(flase)
		Transaction transaction = null;
		try
		{
			transaction = session.beginTransaction();

			// inserting object to DB
			// if we use save() method then Hibernate Software will insert a record in DB
			// and return generated primary key value,
			generatedSId = (Integer) session.save(student);

			isOperationSuceess = true;

		} catch (Exception e)
		{
			e.printStackTrace();
			isOperationSuceess = false;
		} finally
		{
			if (isOperationSuceess)
				transaction.commit();
			else
				transaction.rollback();

			session.close();
		}

		// returning generated PrimaryKey
		return generatedSId;
	}
}
